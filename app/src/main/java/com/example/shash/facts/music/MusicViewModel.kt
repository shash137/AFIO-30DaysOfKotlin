package com.example.shash.facts.music

import androidx.lifecycle.ViewModel

class MusicViewModel : ViewModel() {
    var text = ""
    private lateinit var facts: MutableList<String>
    fun resetList() {
        facts = mutableListOf(
            "The global music industry was worth $19.1 billion as of 2018.",
            "Despacito by Luis Fonsi and Daddy Yankee have 6.6 billion views on YouTube as of February 2020.",
            "Shakira is the first person to have more than 100 million likes on Facebook.",
            "Katy Perry is the first person to have more than 100 million followers on Twitter.",
            "Eminem’s Rap God has the most words in a song, at 1,560 words.",
            "The world’s largest performing rock band included 953 musicians.",
            "The record for the world’s longest marathon team drumming is 3 days, 8 hours, and 2 minutes.",
            "Daddy Yankee is the first Latin artist to become Number One on Spotify.",
            "The song Despacito holds seven world records of its own.",
            "70 different pieces of wood make a violin.",
            "The tabla, is a musical instrument that was made first in India.",
            "Listening to Music Enhances Physical Performance.",
            "\"Jingle Bells\" Was Originally a Thanksgiving Song.",
            "Music helps plants grow faster."
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