package com.fajar.moviedb.setting.movie

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fajar.moviedb.R
import com.fajar.moviedb.core.ui.MovieAdapter
import com.fajar.moviedb.databinding.FragmentMovieFavoriteBinding
import com.fajar.moviedb.ui.detail.DetailActivity
import com.fajar.moviedb.ui.favorite.FavoriteViewModel

class FavoriteMovieFragment: Fragment(R.layout.fragment_movie_favorite)   {

    private val favoriteViewModel: FavoriteViewModel by viewModels()
    private var _binding: FragmentMovieFavoriteBinding? = null
    private val binding get() = _binding!!
    private val movieAdapter = MovieAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMovieFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {

            with(binding.rvMovieFavorite){
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }

            movieAdapter.onItemClick = { selectedData ->
                val intent = Intent(activity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_FILM, selectedData)
                startActivity(intent)
            }

            favoriteViewModel.getFavoriteMovie().observe(viewLifecycleOwner) { dataTourism ->
                movieAdapter.setData(dataTourism)
                binding.viewEmpty.root.visibility =
                    if (dataTourism.isNotEmpty()) View.GONE else View.VISIBLE
            }

            with(binding.rvMovieFavorite) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}