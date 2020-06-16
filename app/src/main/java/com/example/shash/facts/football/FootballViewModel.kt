package com.example.shash.facts.football

import androidx.lifecycle.ViewModel

class FootballViewModel: ViewModel() {
    var text = ""
    private lateinit var facts: MutableList<String>
    fun resetList() {
        facts = mutableListOf(
            "Football was invented in China nearly 476 B.C.",
            "Only Canadians and Americans call football as Soccer.",
            "During every game, Football players run an average of 9.65 km.",
            "The first game of Basketball was played with a soccer ball.",
            "Arthur Wharton is considered the first black professional footballer in the world.",
            "80% of the world’s footballs are manufactured in Pakistan.",
            "Pele was the first to call football “the beautiful game”.",
            "The football hall of fame is situated in Canton, Ohio.",
            "One of the fastest goal was in 2.8 seconds made by Argentinian Ricardo Oliveira in December 1998.",
            "Until 1913, Goalies did not wear different colored shirts from their teammates.",
            "The 16 is the maximum number of goals scored by one player in a single Football match.",
            "The World’s First Football Club was the English Sheffield Football Club founded in 1857.",
            "Lightning killed an entire football team during a game in 1998.",
            "Messi won the Golden Ball award for the best player of the 2014 World Cup.",
            "Cristiano Ronaldo, Ballon d’Or winner, became the first player who scored a goal in every single minute of the game."
        )
        facts.shuffle()
        nextFact()
    }
    init {
        resetList()
        nextFact()
    }

    private fun nextFact() {
        if(!facts.isEmpty()) {
            text = facts.removeAt(0)
        }
    }
    override fun onCleared() {
        super.onCleared()
    }
}