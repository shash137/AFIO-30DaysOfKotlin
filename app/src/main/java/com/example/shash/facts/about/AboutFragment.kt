package com.example.shash.facts.about

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.shash.facts.BuildConfig
import com.example.shash.facts.R
import com.example.shash.facts.databinding.FragmentAboutBinding


class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(
            inflater,
            R.layout.fragment_about, container, false
        )
        binding.githubIcon.setOnClickListener{
            iconPressed()
        }
        //val versionCode = BuildConfig.VERSION_CODE
        val versionName = BuildConfig.VERSION_NAME
        binding.version.text = "Version: " + versionName
        (activity as AppCompatActivity).supportActionBar?.title = "About"
        return binding.root
    }

    private fun iconPressed() {
        val openURL = Intent (android.content.Intent.ACTION_VIEW)
        openURL.data = Uri.parse("https://github.com/shash137/AFIO-30DaysOfKotlin")
        startActivity(openURL)
    }

}
