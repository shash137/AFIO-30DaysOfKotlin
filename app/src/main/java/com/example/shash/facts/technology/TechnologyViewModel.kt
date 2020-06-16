package com.example.shash.facts.technology

import androidx.lifecycle.ViewModel

class TechnologyViewModel : ViewModel() {
    var text = ""
    private lateinit var facts: MutableList<String>
    fun resetList() {
        facts = mutableListOf(
            "The Firefox logo isn’t a fox, but it’s a Red Panda.",
            "Samsung is 38 years and 1 month older than Apple.",
            "More than 570 new websites are created every minute.",
            "There are over 3.5 billion searches per day on Google.",
            "500 million tweets are sent per day.",
            "Domain name registrations were free till 1995",
            "In 1956, 5 megabytes (5MB) of data weighed a ton",
            "The first known calculator, the Abacus, was invented in Babylonia in 2400 BC.",
            "Inside the Original Macintosh computer case are 47 signatures for each member of the Macintosh division of Apple in 1982.",
            "Stewardesses’ is the longest word you can type with one hand.",
            "We spend around 10 years watching TV.",
            "The only state that can be typed on the same line of a QWERTY keyboard is Alaska. ",
            "China has banned YouTube, Facebook, Gmail, Twitter, Instagram, Dropbox and Skype from public use.",
            "The computers used in the Apollo 11 trip to the moon had less processing power than current cell phones. "
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