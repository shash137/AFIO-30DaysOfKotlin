package com.example.shash.facts

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.shash.facts.databinding.FragmentCategoryBinding
import com.example.shash.facts.databinding.FragmentMusicBinding
import kotlinx.android.synthetic.main.fragment_category.*
import kotlinx.android.synthetic.main.fragment_music.*
import kotlin.random.Random

class MusicFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val binding = DataBindingUtil.inflate<FragmentMusicBinding>(
//            inflater,
//            R.layout.fragment_music, container, false
//        )
//        binding.musicFactButton.setOnClickListener {
//            buttonPressed()
//        }
        return inflater.inflate(R.layout.fragment_music, container, false)
    }

//    private fun buttonPressed (){
//        val myRandomInt = Random.nextInt(15)
//        val res: Resources = resources
//        val fact = res.getStringArray(R.array.music_facts)
////        for (value in fact){
////            Log.i("fact", value.toString())
////        }
//        musicFact.text = fact[myRandomInt]
//    }
}
