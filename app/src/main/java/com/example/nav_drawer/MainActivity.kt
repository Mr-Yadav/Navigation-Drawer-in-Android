package com.example.nav_drawer

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.nav_drawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.apply {

            toggle = ActionBarDrawerToggle(this@MainActivity, DrawerLayout, R.string.open, R.string.close)
            DrawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            actionBar?.setDisplayHomeAsUpEnabled(true)

            navMain.setNavigationItemSelectedListener {
                when(it.itemId) {
                    R.id.item1->{
                        Toast.makeText(this@MainActivity, "item 1", Toast.LENGTH_SHORT).show()
                    }
                    R.id.item1->{
                        Toast.makeText(this@MainActivity, "item 2", Toast.LENGTH_SHORT).show()

                    }
                    R.id.item1->{
                        Toast.makeText(this@MainActivity, "item 3", Toast.LENGTH_SHORT).show()

                    }

                }

                true

            }

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (toggle.onOptionsItemSelected(item))
        {
            true
        }
        return super.onOptionsItemSelected(item)
    }

}
