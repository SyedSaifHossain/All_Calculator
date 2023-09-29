package com.example.all_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.all_calculator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var drawerToggle: ActionBarDrawerToggle
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val navController = findNavController(R.id.fragmentId)
        binding.bottomNav.setupWithNavController(navController)
        drawerToggle = ActionBarDrawerToggle(this, binding.drawerLayout, R.string.nav_open, R.string.nav_close)
        drawerToggle.syncState()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.drawerNav.setOnNavigationItemSelectedListener{
            when (it.itemId) {

                R.id.bmiFragment -> {
                    binding.drawerLayout.closeDrawers()
                    binding.drawerNav.setupWithNavController(navController)
                }

                R.id.scientificFragment -> {
                    binding.drawerLayout.closeDrawers()
                    binding.drawerNav.setupWithNavController(navController)
                }

                R.id.tempFragment -> {
                    binding.drawerLayout.closeDrawers()
                    binding.drawerNav.setupWithNavController(navController)
                }

                R.id.white -> {
                    binding.drawerLayout.setBackgroundColor(getResources().getColor(R.color.white))
                    binding.bottomNav.setBackgroundColor(getResources().getColor(R.color.white))
                    binding.drawerLayout.closeDrawers()
                }

                R.id.black -> {
                    binding.drawerLayout.setBackgroundColor(getResources().getColor(R.color.black))
                    binding.bottomNav.setBackgroundColor(getResources().getColor(R.color.black))
                    binding.drawerLayout.closeDrawers()
                }

                R.id.red -> {
                    binding.drawerLayout.setBackgroundColor(getResources().getColor(R.color.red))
                    binding.bottomNav.setBackgroundColor(getResources().getColor(R.color.red))
                    binding.drawerLayout.closeDrawers()
                }

                R.id.setting -> {
                    binding.drawerLayout.closeDrawers()
                }

                R.id.logout -> {
                    binding.drawerLayout.closeDrawers()
                }
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (drawerToggle.onOptionsItemSelected(item)) {
            true
        } else super.onOptionsItemSelected(item)
    }
}