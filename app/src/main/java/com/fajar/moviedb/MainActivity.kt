package com.fajar.moviedb

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.fajar.moviedb.databinding.ActivityMainBinding
import com.fajar.moviedb.ui.favorite.FavoriteFragment
import com.fajar.moviedb.ui.home.HomeFragment
import com.fajar.moviedb.ui.main.MainFragment
import com.fajar.moviedb.ui.search.SearchFragment
import com.fajar.moviedb.ui.tv.TvFragment
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.main_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        setupBottomNavMenu(navController)
    }

    private fun setupBottomNavMenu(navController: NavController) {
        setFragment(HomeFragment())
        val navView: BottomNavigationView = binding.navView
        navView.setupWithNavController(navController)
        navView.setOnItemSelectedListener {
            when (it.itemId){
              //  R.id.navigation_main -> setFragment(MainFragment())
                R.id.navigation_home -> setFragment(HomeFragment())
                R.id.navigation_tv -> setFragment(TvFragment())
                R.id.navigation_search -> setFragment(SearchFragment())
                R.id.navigation_favorite -> setFragment(FavoriteFragment())

            }
            return@setOnItemSelectedListener true
        }


    }



    private fun setFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_fragment, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit()
    }
}