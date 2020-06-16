package com.example.shash.facts.science

import androidx.lifecycle.ViewModel

class ScienceViewModel : ViewModel() {
    var text = ""
    private lateinit var facts: MutableList<String>
    fun resetList() {
        facts = mutableListOf(
            "Polar bears are nearly undetectable by infrared cameras.",
            "Stomach acid is strong enough to dissolve stainless steel.",
            "Venus is the only planet to spin clockwise.",
            "In 2.3 billion years it will be too hot for life to exist on Earth.",
            "Hawaii moves 7.5cm closer to Alaska every year.",
            "A teaspoonful of neutron star would weigh 6 billion tons.",
            "20% of Earth’s oxygen is produced by the Amazon rainforest.",
            "The Eiffel Tower can be 15 cm taller during the summer.",
            "Babies have around 300 bones at birth.",
            "There is enough DNA in the average person’s body to stretch from the sun to Pluto and back — 17 times.",
            "In an entire lifetime, the average person walks the equivalent of five times around the world.",
            "Grasshoppers have ears in their bellies."
        )
        facts.shuffle()
        nextFact()
    }

    init {
        resetList()
        nextFact()
    }

    private fun nextFact() {
        if (!facts.isEmpty()) {
            text = facts.removeAt(0)
        }
    }

    override fun onCleared() {
        super.onCleared()
    }
}