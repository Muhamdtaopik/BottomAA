package com.example.bottomaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.bottomaa.databinding.ActivityMainBinding
import com.example.bottomaa.fragments.FCalculator
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadFragment(FCalculator())

        var bottomnvamenu = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottomnvamenu.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.bot_menu_home -> {
                    loadFragment(FHome())
                    true
                }
                R.id.bot_menu_calculator -> {
                    loadFragment(FCalculator())
                    true
                }
                R.id.bot_menu_money -> {
                    loadFragment(FMoney())
                    true
                }
                R.id.bot_menu_bmi -> {
                    loadFragment(Fbmi())
                    true
                }
                R.id.bot_menu_Profile -> {
                    loadFragment(FProfile())
                    true
                }

                else -> {
                    false
                }
            }

        }
    }

    private  fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}
