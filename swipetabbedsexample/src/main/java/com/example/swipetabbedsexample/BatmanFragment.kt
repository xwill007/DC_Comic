package com.example.swipetabbedsexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.swipetabbedsexample.databinding.FragmentBatmanBinding


class BatmanFragment : Fragment() {

    private lateinit var batmanBinding : FragmentBatmanBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        batmanBinding = FragmentBatmanBinding.inflate(inflater,container,false)
        /*batmanBinding.ButtonNext.setOnClickListener {
            findNavController().navigate(R.id.action_batmanFragment_to_flashFragment)
        }*/
        return batmanBinding.root
    }

}