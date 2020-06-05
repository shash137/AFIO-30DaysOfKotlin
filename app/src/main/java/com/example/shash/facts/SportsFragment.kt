package com.example.shash.facts

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.shash.facts.databinding.FragmentCategoryBinding
import com.example.shash.facts.databinding.FragmentSportsBinding

class SportsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentSportsBinding>(
            inflater,
            R.layout.fragment_sports, container, false)
        binding.cricketButton.setOnClickListener { view: View->
            view.findNavController().navigate(SportsFragmentDirections.actionSportsFragmentToCricketFragment())}
        binding.footballButton.setOnClickListener { view: View ->
            view.findNavController().navigate(SportsFragmentDirections.actionSportsFragmentToFootballFragment())}

        (activity as AppCompatActivity).supportActionBar?.title = "Sports"
        return binding.root
    }
}
