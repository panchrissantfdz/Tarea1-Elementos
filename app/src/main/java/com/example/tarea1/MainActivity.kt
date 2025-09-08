package com.example.tarea1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.tarea1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            loadFragment(TextFieldsFragment())
        }

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_text_fields -> {
                    loadFragment(TextFieldsFragment())
                    true
                }

                R.id.nav_buttons -> {
                    loadFragment(ButtonsFragment())
                    true
                }

                R.id.nav_selection -> {
                    loadFragment(SelectionElementsFragment())
                    true
                }

                R.id.nav_lists -> {
                    loadFragment(ListsFragment())
                    true
                }

                R.id.nav_info -> {
                    loadFragment(InformationFragment())
                    true
                }

                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

    }
}