package com.fajar.moviedb.ui.tv

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.fajar.moviedb.R
import com.fajar.moviedb.core.data.Resource
import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.ui.MovieAdapter
import com.fajar.moviedb.core.ui.TvAdapter
import com.fajar.moviedb.core.utils.SortUtils
import com.fajar.moviedb.databinding.FragmentHomeBinding
import com.fajar.moviedb.databinding.FragmentTvBinding
import com.fajar.moviedb.ui.detail.DetailActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TvFragment : Fragment(R.layout.fragment_tv) {

    private val viewModel: TvViewModel by viewModels()
    private var tvAdapter = MovieAdapter()
    private var _binding: FragmentTvBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTvBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setHasOptionsMenu(true)

        if (activity != null) {

            tvAdapter = MovieAdapter()
            tvAdapter.onItemClick = { selectedData ->
                val intent = Intent(activity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_DATA, selectedData)
                startActivity(intent)
            }

            viewModel.popularTv.observe(viewLifecycleOwner) { movie ->
                if (movie != null) {
                    when (movie) {
                        is Resource.Loading -> binding.progressBar.visibility = View.VISIBLE
                        is Resource.Success -> {
                            binding.progressBar.visibility = View.GONE
                            movie.data?.let { tvAdapter.setData(it) }
                        }
                        is Resource.Error -> {
                            binding.progressBar.visibility = View.GONE
                            binding.viewError.root.visibility = View.VISIBLE
                            binding.viewError.tvError.text =
                                movie.message ?: getString(R.string.something_wrong)
                        }
                    }
                }
            }



            with(binding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = tvAdapter
            }

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}