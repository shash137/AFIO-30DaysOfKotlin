package com.example.shash.facts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.shash.facts.databinding.FragmentCricketBinding
import com.example.shash.facts.databinding.FragmentScienceBinding


class CricketFragment : Fragment() {
    data class Facts(
        val text: String
    )

    private val facts: MutableList<Facts> = mutableListOf(
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " "),
        Facts(text = " ")
    )
    lateinit var currentFacts: Facts
    var factIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCricketBinding>(
            inflater, R.layout.fragment_cricket, container, false
        )
        binding.nextButton.setOnClickListener {
            randomizeFact()
            binding.factss = this
        }
        (activity as AppCompatActivity).supportActionBar?.title = "Cricket"
        return binding.root
    }
    private fun randomizeFact() {
        facts.shuffle()
        factIndex = 0
        setFact()
    }

    fun setFact() {
        currentFacts = facts[factIndex]
    }
}