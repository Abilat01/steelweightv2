package com.abilat01.steelweightv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.abilat01.steelweightv2.fragments.ExercisesFragment
import com.abilat01.steelweightv2.fragments.InfoFragment
import com.abilat01.steelweightv2.fragments.ProgramFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Загрузка главного фрагмента(В первую очередь)
        loadFragment(ProgramFragment())

        bottomNavigationView.setOnNavigationItemSelectedListener { MenuItem ->
            when (MenuItem.itemId) {
                R.id.menu_programs -> {
                    loadFragment(ProgramFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_exercises -> {
                    loadFragment(ExercisesFragment())
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.menu_info -> {
                    loadFragment(InfoFragment())
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
            fragmentTransaction.replace(R.id.fragment_container, fragment)
            fragmentTransaction.commit()
        }
    }

}