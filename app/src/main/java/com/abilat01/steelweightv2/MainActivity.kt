package com.abilat01.steelweightv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Загрузка первых фрагментов
        loadFragment(ExploreFragment())

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when {
                menuItem.itemId == R.id.navigationExplore -> {
                    loadFragment(ExploreFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigationDashboard -> {
                    loadFragment(DashboardFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                menuItem.itemId == R.id.navigationProfile ->{
                    loadFragment(ProfaleFragment())
                    return@setOnNavigationItemSelectedListener true
                }

                else -> {
                    return@setOnNavigationItemSelectedListener false

                }
            }

        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().also { fragmentTransaction ->
            fragmentTransaction.replace(R.id.fragmentContainer, fragment)
            fragmentTransaction.commit()


        }
    }

}