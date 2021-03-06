package com.example.shash.facts.cricket

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CricketViewModel : ViewModel() {

    private val _text = MutableLiveData<String>()
    val text: LiveData<String>
        get() = _text

    private val _eventFactsFinish = MutableLiveData<Boolean>()
    val eventFactsFinish: LiveData<Boolean>
        get() = _eventFactsFinish

    private lateinit var facts: MutableList<String>
    private fun resetList() {
        facts = mutableListOf(
            "Adam Gilchrist holds the record for playing the most number of Tests straight after debut.",
            "On 12 th January 1964, Indian spinner Bapu Nadkarni bowled 21 consecutive maiden overs vs England at Chennai.",
            "In a World Cup Match, chasing 335, Sunil Gavaskar scored an unbeaten 36 off 174 balls.",
            "Mahela Jayawardene is the only batsman to have scored centuries in both the Semi-Final and Final of a World Cup.",
            "Dirk Nannes has represented both Australia and Netherlands in International Cricket.",
            "Shahid Afridi hit his fastest ODI Century with Tendulkar’s bat.",
            "Sir Don Bradman has just hit 6 sixes in his entire career.",
            "Sachin Tendulkar got out for a duck only once in his Ranji career. Bhuvaneshwar Kumar got him.",
            "Sachin Tendulkar’s test match average is less than that of Vinod Kambli.",
            "Tendulkar after being dismissed by Brad Hogg in an ODI obliged him with words -“Never again mate” and it was true !!",
            "Ravi Shastri, ML Jaisimha and Cheteshwar Pujara are the only Indian batsman who did batting on all five days of a Test.",
            "The youngest ever Test captain in Indian Cricket history was Mansoor Ali Khan Pataudi (21 years).",
            "Mithali Raj is the First Woman Cricketer to play 200 ODIs",
            "India is the first team to win the World Cup as host of the final match.",
            "The record of highest runs scored in an over is 77 runs!",
            "Mahendra Singh Dhoni is the first and only Captain to claim all ICC trophies in international cricket.",
            "On 11/11/11, South Africa needed 111 runs to win at 11:11"
        )
        facts.shuffle()
    }

    init {
        _text.value = ""
        resetList()
        nextFact()
    }

    fun nextFact() {
        if (facts.isEmpty()) {
            onNextFact()
        } else {
            _text.value = facts.removeAt(0)
        }
    }

    private fun onNextFact() {
        _eventFactsFinish.value = true
    }
}
