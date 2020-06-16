package com.example.shash.facts.football

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.shash.facts.R
import com.example.shash.facts.databinding.FragmentFootballBinding


class FootballFragment : Fragment() {
    //    data class Facts(
//        val text: String
//    )
    private lateinit var viewModel: FootballViewModel
    private lateinit var binding: FragmentFootballBinding

    //    private val facts: MutableList<Facts> = mutableListOf(
//        Facts(text = "Football was invented in China nearly 476 B.C."),
//        Facts(text = "Only Canadians and Americans call football as Soccer.\n"),
//        Facts(text = "During every game, Football players run an average of 9.65 km."),
//        Facts(text = "The first game of Basketball was played with a soccer ball."),
//        Facts(text = "Arthur Wharton is considered the first black professional footballer in the world."),
//        Facts(text = "80% of the world’s footballs are manufactured in Pakistan."),
//        Facts(text = "Pele was the first to call football “the beautiful game”."),
//        Facts(text = "The football hall of fame is situated in Canton, Ohio."),
//        Facts(text = "One of the fastest goal was in 2.8 seconds made by Argentinian Ricardo Oliveira in December 1998."),
//        Facts(text = "Until 1913, Goalies did not wear different colored shirts from their teammates."),
//        Facts(text = "The 16 is the maximum number of goals scored by one player in a single Football match."),
//        Facts(text = "The World’s First Football Club was the English Sheffield Football Club founded in 1857."),
//        Facts(text = "Lightning killed an entire football team during a game in 1998."),
//        Facts(text = "Messi won the Golden Ball award for the best player of the 2014 World Cup."),
//        Facts(text = "Cristiano Ronaldo, Ballon d’Or winner, became the first player who scored a goal in every single minute of the game.")
//    )
//    lateinit var currentFacts: Facts
//    var factIndex = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_football, container, false
        )
        viewModel = ViewModelProviders.of(this).get(FootballViewModel::class.java)
        binding.nextButton.setOnClickListener {
            viewModel.resetList()
            setFact()
        }
        (activity as AppCompatActivity).supportActionBar?.title = "Football"
        return binding.root
    }

    fun setFact() {
        binding.footballFact.text = viewModel.text
    }
}