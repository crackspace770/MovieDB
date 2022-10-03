package com.fajar.moviedb.ui.tv

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.fajar.moviedb.R
import com.fajar.moviedb.core.data.Resource
import com.fajar.moviedb.core.domain.model.Movie
import com.fajar.moviedb.core.ui.MovieAdapter
import com.fajar.moviedb.core.ui.TvAdapter
import com.fajar.moviedb.core.utils.SortUtils
import com.fajar.moviedb.databinding.FragmentTvBinding
import com.fajar.moviedb.ui.detail.DetailActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TvFragment : Fragment() {

    private val viewModel: TvViewModel by viewModels()
    private var _binding: FragmentTvBinding? = null
    private val movieAdapter = TvAdapter()
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

            val movieAdapter = MovieAdapter()
            movieAdapter.onItemClick = { selectedData ->
                val intent = Intent(activity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_DATA, selectedData)
                startActivity(intent)
            }

            viewModel.getPopularTvList(SortUtils.POPULAR).observe(viewLifecycleOwner) { movie ->
                if (movie != null) {
                    when (movie) {
                        is Resource.Loading -> binding.progressBar.visibility = View.VISIBLE
                        is Resource.Success -> {
                            binding.progressBar.visibility = View.GONE
                            movie.data?.let { movieAdapter.setData(it) }
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
                adapter = movieAdapter
            }
            binding.apply {


            }

        }
    }

    private fun findMovieList(){
        binding.apply {
            progressBar.visibility = View.VISIBLE
            // btnTryAgain.visibility = View.GONE
            // onFailMsg.visibility = View.GONE
            viewModel.getPopularTvList(SortUtils.POPULAR).observe(viewLifecycleOwner, movieObserver)
        }
    }

    private val movieObserver = Observer<Resource<List<Movie>>> { movieList ->
        binding.apply {
            if(movieList != null){
                when(movieList){
                    is Resource.Loading -> {
                        progressBar.visibility = View.VISIBLE
                    }
                    is Resource.Success -> {
                        movieList.data?.let { movieAdapter.setData(it) }
                        progressBar.visibility = View.GONE
                        rvMovie.smoothScrollToPosition(0)
                        swipeToRefresh.isRefreshing = false
                    }
                    is Resource.Error -> {
                        progressBar.visibility = View.GONE
                        // btnTryAgain.visibility = View.VISIBLE
                        // onFailMsg.visibility = View.VISIBLE
                    }
                }
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.sorting_data_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var sort = ""
        when (item.itemId) {
            R.id.action_popular -> sort = SortUtils.POPULAR
            R.id.action_latest_release -> sort = SortUtils.LATEST
            R.id.action_oldest_release -> sort = SortUtils.OLDEST
            R.id.action_best_vote -> sort = SortUtils.BEST
            R.id.action_worst_vote -> sort = SortUtils.WORST
            R.id.action_random -> sort = SortUtils.RANDOM
        }
        binding.apply {
            viewModel.getPopularTvList(sort).observe(viewLifecycleOwner, movieObserver)
        }
        item.isChecked = true
        return super.onOptionsItemSelected(item)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}