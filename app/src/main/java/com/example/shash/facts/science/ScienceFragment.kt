package com.example.shash.facts.science

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.shash.facts.R
import com.example.shash.facts.databinding.FragmentScienceBinding


class ScienceFragment : Fragment() {
    data class Facts(
        val text: String
    )

    private val facts: MutableList<Facts> = mutableListOf(
        Facts(text = "Polar bears are nearly undetectable by infrared cameras."),
        Facts(text = "Stomach acid is strong enough to dissolve stainless steel."),
        Facts(text = "Venus is the only planet to spin clockwise."),
        Facts(text = "In 2.3 billion years it will be too hot for life to exist on Earth."),
        Facts(text = "Hawaii moves 7.5cm closer to Alaska every year."),
        Facts(text = "A teaspoonful of neutron star would weigh 6 billion tons."),
        Facts(text = "20% of Earth’s oxygen is produced by the Amazon rainforest."),
        Facts(text = "The Eiffel Tower can be 15 cm taller during the summer."),
        Facts(text = "Babies have around 300 bones at birth."),
        Facts(text = "There is enough DNA in the average person’s body to stretch from the sun to Pluto and back — 17 times."),
        Facts(text = "In an entire lifetime, the average person walks the equivalent of five times around the world."),
        Facts(text = "Grasshoppers have ears in their bellies.")
    )

    lateinit var currentFacts: Facts
    var factIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentScienceBinding>(
            inflater,
            R.layout.fragment_science, container, false
        )
        binding.nextButton.setOnClickListener {
            randomizeFact()
            binding.factss = this
        }
        (activity as AppCompatActivity).supportActionBar?.title = "Science"
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
