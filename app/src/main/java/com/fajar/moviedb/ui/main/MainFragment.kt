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
import com.fajar.moviedb.core.ui.MovieAdapter
import com.fajar.moviedb.databinding.FragmentMainBinding
import com.fajar.moviedb.ui.detail.DetailActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment: Fragment() {

    private val viewModel: MainViewModel by viewModels()
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val movieAdapter = MovieAdapter()
    private val tvAdapter = MovieAdapter()

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
            val movieAdapter = MovieAdapter()

            movieAdapter.onItemClick = { selectedData ->
                val intent = Intent(activity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_DATA, selectedData)
                startActivity(intent)
            }

            tvAdapter.onItemClick = { selectedData ->
                val intent = Intent(activity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.EXTRA_DATA, selectedData)
                startActivity(intent)
            }

            binding.apply {

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

            //    findUpcomingMovies()
            //    findTopTvShows()

               // btnTryAgain.setOnClickListener {
              //      findUpcomingMovies()
              //      findTopTvShows()
              //  }

              //  swipeToRefresh.setOnRefreshListener {
             //       findUpcomingMovies()
             //       findTopTvShows()
             //       swipeToRefresh.isRefreshing = false
             //   }

            }

        }


    }

  //  private fun findUpcomingMovies() {
   //     binding.apply {
           // loadingUpcomingMovie.visibility = View.VISIBLE
            //onFailMsg.visibility = View.GONE
    //        viewModel.getPopularMoviesList()
    //            .observe(viewLifecycleOwner) { movieList ->
    //                if (movieList != null) {
    //                    when (movieList) {
    //                        is Resource.Loading -> {
                         //       loadingUpcomingMovie.visibility = View.VISIBLE
    //                        }
    //                        is Resource.Success -> {
                         //       loadingUpcomingMovie.visibility = View.GONE
     //                           val sortedList =
     //                               movieList.data?.sortedByDescending { it.releaseDate }
     //                           sortedList?.let { movieAdapter.setData(it) }
      //                      }
     //                       is Resource.Error -> {
                         //       loadingUpcomingMovie.visibility = View.GONE
                              //  onFailMsg.visibility = View.VISIBLE
       //                     }
      //                  }
      //              }
     //           }
     //   }
   // }

  //  private fun findTopTvShows() {
  //      binding.apply {
         //   loadingTopRatedTvShow.visibility = View.VISIBLE
          //  btnTryAgain.visibility = View.GONE
          //  onFailMsg.visibility = View.GONE
     //       viewModel.getPopularTvList()
    //            .observe(viewLifecycleOwner) { tvShowList ->
    //                    when (tvShowList) {
    //                        is Resource.Loading -> {
                       //         loadingTopRatedTvShow.visibility = View.VISIBLE
     //                       }
     //                       is Resource.Success -> {
                      //          loadingTopRatedTvShow.visibility = View.GONE
       //                         val sortedList =
      //                              tvShowList.data?.sortedByDescending { it.voteAverage }
      //                          sortedList?.let { tvAdapter.setData(it) }
      //                      }
      //                      is Resource.Error -> {
                       //         loadingTopRatedTvShow.visibility = View.GONE
                            //    btnTryAgain.visibility = View.VISIBLE
                            //    onFailMsg.visibility = View.VISIBLE
   //                         }
    //                    }
    //                }
    //            }
    //    }
   // }



}