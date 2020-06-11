package com.example.shash.facts.cricket

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.shash.facts.R
import com.example.shash.facts.databinding.FragmentCricketBinding


class CricketFragment : Fragment() {
    data class Facts(
        val text: String
    )

    private val facts: MutableList<Facts> = mutableListOf(
        Facts(text = "Adam Gilchrist holds the record for playing the most number of Tests straight after debut."),
        Facts(text = "On 12 th January 1964, Indian spinner Bapu Nadkarni bowled 21 consecutive maiden overs vs England at Chennai."),
        Facts(text = "In a World Cup Match, chasing 335, Sunil Gavaskar scored an unbeaten 36 off 174 balls."),
        Facts(text = "Mahela Jayawardene is the only batsman to have scored centuries in both the Semi-Final and Final of a World Cup."),
        Facts(text = "Dirk Nannes has represented both Australia and Netherlands in International Cricket."),
        Facts(text = "Shahid Afridi hit his fastest ODI Century with Tendulkar’s bat."),
        Facts(text = "Sir Don Bradman has just hit 6 sixes in his entire career."),
        Facts(text = "Sachin Tendulkar got out for a duck only once in his Ranji career. Bhuvaneshwar Kumar got him."),
        Facts(text = "Sachin Tendulkar’s test match average is less than that of Vinod Kambli."),
        Facts(text = "Tendulkar after being dismissed by Brad Hogg in an ODI obliged him with words -“Never again mate” and it was true !!"),
        Facts(text = "Ravi Shastri, ML Jaisimha and Cheteshwar Pujara are the only Indian batsman who did batting on all five days of a Test."),
        Facts(text = "The youngest ever Test captain in Indian Cricket history was Mansoor Ali Khan Pataudi (21 years)."),
        Facts(text = "Mithali Raj is the First Woman Cricketer to play 200 ODIs"),
        Facts(text = "India is the first team to win the World Cup as host of the final match."),
        Facts(text = "The record of highest runs scored in an over is 77 runs!"),
        Facts(text = "On 11/11/11, South Africa needed 111 runs to win at 11:11"),
        Facts(text = "Mahendra Singh Dhoni is the first and only Captain to claim all ICC trophies in international cricket")
    )
    lateinit var currentFacts: Facts
    var factIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCricketBinding>(
            inflater,
            R.layout.fragment_cricket, container, false
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