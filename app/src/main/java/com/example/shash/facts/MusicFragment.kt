package com.example.shash.facts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.shash.facts.databinding.FragmentMusicBinding


class MusicFragment : Fragment() {
    data class Facts(
        val text: String
    )

    private val facts: MutableList<Facts> = mutableListOf(
        Facts(text = "The global music industry was worth $19.1 billion as of 2018."),
        Facts(text = "Despacito by Luis Fonsi and Daddy Yankee have 6.6 billion views on YouTube as of February 2020."),
        Facts(text = "Shakira is the first person to have more than 100 million likes on Facebook."),
        Facts(text = "Katy Perry is the first person to have more than 100 million followers on Twitter."),
        Facts(text = "Eminem’s Rap God has the most words in a song, at 1,560 words."),
        Facts(text = "The world’s largest performing rock band included 953 musicians."),
        Facts(text = "The record for the world’s longest marathon team drumming is 3 days, 8 hours, and 2 minutes."),
        Facts(text = "Daddy Yankee is the first Latin artist to become Number One on Spotify."),
        Facts(text = "The song Despacito holds seven world records of its own."),
        Facts(text = "70 different pieces of wood make a violin."),
        Facts(text = "The veena is a beautiful instrument that was first made in India."),
        Facts(text = "The tabla, is a musical instrument that was made first in India."),
        Facts(text = "Listening to Music Enhances Physical Performance."),
        Facts(text = "\"Jingle Bells\" Was Originally a Thanksgiving Song."),
        Facts(text = "Music helps plants grow faster.")

    )

    lateinit var currentFacts: Facts
    var factIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentMusicBinding>(
            inflater, R.layout.fragment_music, container, false
        )

        binding.musicFactButton.setOnClickListener {
            randomizeFact()
            binding.factss = this
        }
        (activity as AppCompatActivity).supportActionBar?.title = "Music"
        return binding.root
    }

    fun randomizeFact() {
        facts.shuffle()
        factIndex = 0
        setFact()
    }

    fun setFact() {
        currentFacts = facts[factIndex]
    }

}
