package com.example.sesion3_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.sesion3_fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //private lateinit var mainBinding: ActivityMainBinding
    //private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //mainBinding = ActivityMainBinding.inflate(layoutInflater)
        //navController= findNavController(R.id.nav_host_fragment)
        setContentView(R.layout.activity_main)
    }
}