package com.example.bottomnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigationexample.databinding.FragmentSupermanBinding


class SupermanFragment : Fragment() {

    private lateinit var supermanBinding: FragmentSupermanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        supermanBinding = FragmentSupermanBinding.inflate(inflater,container,false)
        return supermanBinding.root
    }

}