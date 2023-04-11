package com.fajar.moviedb.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.fajar.moviedb.core.data.Resource
import com.fajar.moviedb.core.ui.MainAdapter
import com.fajar.moviedb.core.ui.TrendingAdapter
import com.fajar.moviedb.databinding.FragmentMainBinding
import com.fajar.moviedb.ui.detail.DetailActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment: Fragment() {

    private val viewModel: MainViewModel by viewModels()
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val trendingAdapter = TrendingAdapter()
    private val movieAdapter = MainAdapter()
    private val tvAdapter = MainAdapter()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(activity != null){


            binding.apply {

                rvTrending.apply {
                    layoutManager =
                        LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                    adapter = trendingAdapter
                }

                rvMovie.apply {
                    layoutManager =
                        LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                    adapter = movieAdapter
                }

                rvTv.apply {
                    layoutManager =
                        LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                    adapter = tvAdapter
                }


                trendingAdapter.onItemClick = { selectedData ->
                    val moveToDetail = Intent(requireContext(), DetailActivity::class.java)
                    moveToDetail.putExtra(DetailActivity.EXTRA_FILM, selectedData)
                    startActivity(moveToDetail)
                }

                movieAdapter.onItemClick = { selectedData ->
                    val moveToDetail = Intent(requireContext(), DetailActivity::class.java)
                    moveToDetail.putExtra(DetailActivity.EXTRA_FILM, selectedData)
                    startActivity(moveToDetail)
                }
                tvAdapter.onItemClick = { selectedData ->
                    val moveToDetail = Intent(requireContext(), DetailActivity::class.java)
                    moveToDetail.putExtra(DetailActivity.EXTRA_FILM, selectedData)
                    startActivity(moveToDetail)
                }

                findTrendingShows()
                findUpcomingMovies()
                findTopTvShows()

                swipeToRefresh.setOnRefreshListener {
                    findTrendingShows()
                    findUpcomingMovies()
                    findTopTvShows()
                    swipeToRefresh.isRefreshing = false
                }

            }

        }
    }

    private fun findTrendingShows() {
        binding.apply {
       //     loadingUpcomingMovie.visibility = View.VISIBLE
       //     onFailMsg.visibility = View.GONE
            viewModel.getTrendingThisWeekList()
                .observe(viewLifecycleOwner) { movieList ->
                    if (movieList != null) {
                        when (movieList) {
                            is Resource.Loading -> {
                 //               loadingTrending.visibility = View.VISIBLE
                            }
                            is Resource.Success -> {
                                movieList.data?.let { trendingAdapter.setData(it) }
                    //            loadingTrending.visibility = View.GONE
                            }
                            is Resource.Error -> {
                   //             loadingTrending.visibility = View.GONE
                   //             onFailMsg.visibility = View.VISIBLE
                            }
                        }
                    }
                }
        }
    }

   private fun findUpcomingMovies() {
        binding.apply {
         //   progressBar.visibility = View.VISIBLE
            //onFailMsg.visibility = View.GONE
            viewModel.getUpcomingMovies()
                .observe(viewLifecycleOwner) { movieList ->
                    if (movieList != null) {
                        when (movieList) {
                            is Resource.Loading -> {
       //                         progress_bar.visibility = View.VISIBLE
                            }
                            is Resource.Success -> {
                         //       loadingUpcomingMovie.visibility = View.GONE
                                val sortedList =
                                   movieList.data?.sortedByDescending { it.releaseDate }
                                sortedList?.let { movieAdapter.setData(it) }
                           }
                            is Resource.Error -> {
  //                              progress_bar.visibility = View.GONE
                                //onFailMsg.visibility = View.VISIBLE
                            }
                        }
                    }
                }
        }
    }

    private fun findTopTvShows() {
        binding.apply {
        //    progressBar.visibility = View.VISIBLE
            //btnTryAgain.visibility = View.GONE
           // onFailMsg.visibility = View.GONE
            viewModel.getTopTvShowList()
                .observe(viewLifecycleOwner) { tvShowList ->
                        when (tvShowList) {
                            is Resource.Loading -> {
 //                               progress_bar.visibility = View.VISIBLE
                            }
                            is Resource.Success -> {
 //                              progress_bar.visibility = View.GONE
                               val sortedList =
                                    tvShowList.data?.sortedByDescending { it.voteAverage }
                                sortedList?.let { tvAdapter.setData(it) }
                            }
                            is Resource.Error -> {
  //                              progress_bar.visibility = View.GONE
                               // btnTryAgain.visibility = View.VISIBLE
                               // onFailMsg.visibility = View.VISIBLE
                           }
                       }
                    }
               }
        }

    }



