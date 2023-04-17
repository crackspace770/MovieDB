package com.fajar.favorites

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.fajar.moviedb.ui.favorite.FavoriteMovieFragment
import com.fajar.moviedb.ui.favorite.FavoriteTvFragment

class SectionPagerAdapter(fragment: Fragment): FragmentStateAdapter(fragment)  {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        var fragment: Fragment? = null
        when(position) {
            0 -> fragment = FavoriteMovieFragment()
            1 -> fragment = FavoriteTvFragment()
        }
        return fragment as Fragment
    }
}