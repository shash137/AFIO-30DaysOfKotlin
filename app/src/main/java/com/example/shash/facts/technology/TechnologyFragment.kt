package com.example.shash.facts.technology

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.shash.facts.R
import com.example.shash.facts.databinding.FragmentTechnologyBinding


class TechnologyFragment : Fragment() {
    data class Facts(
        val text: String
    )

    private val facts: MutableList<Facts> = mutableListOf(
        Facts(text = "The Firefox logo isn’t a fox, but it’s a Red Panda."),
        Facts(text = "Samsung is 38 years and 1 month older than Apple."),
        Facts(text = "More than 570 new websites are created every minute."),
        Facts(text = "There are over 3.5 billion searches per day on Google."),
        Facts(text = "500 million tweets are sent per day."),
        Facts(text = "Domain name registrations were free till 1995"),
        Facts(text = "In 1956, 5 megabytes (5MB) of data weighed a ton"),
        Facts(text = "The first known calculator, the Abacus, was invented in Babylonia in 2400 BC."),
        Facts(text = "Inside the Original Macintosh computer case are 47 signatures for each member of the Macintosh division of Apple in 1982."),
        Facts(text = "Stewardesses’ is the longest word you can type with one hand."),
        Facts(text = "We spend around 10 years watching TV."),
        Facts(text = "The only state that can be typed on the same line of a QWERTY keyboard is Alaska. "),
        Facts(text = "China has banned YouTube, Facebook, Gmail, Twitter, Instagram, Dropbox and Skype from public use."),
        Facts(text = "The computers used in the Apollo 11 trip to the moon had less processing power than current cell phones. ")
    )

    lateinit var currentFacts: Facts
    var factIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTechnologyBinding>(
            inflater,
            R.layout.fragment_technology, container, false
        )
        binding.nextButton.setOnClickListener {
            randomizeFact()
            binding.factss = this
        }
        (activity as AppCompatActivity).supportActionBar?.title = "Technology"
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

