package com.example.shash.facts

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shash.facts.databinding.FragmentCategoryBinding
import kotlinx.android.synthetic.main.fragment_category.*


class CategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCategoryBinding>(
            inflater,
            R.layout.fragment_category, container, false
        )
        binding.sportsButton.setOnClickListener{view: View ->
        view.findNavController().navigate(CategoryFragmentDirections.actionCategoryFragmentToSportsFragment())}
        binding.musicButton.setOnClickListener{view: View ->
            view.findNavController().navigate(CategoryFragmentDirections.actionCategoryFragmentToMusicFragment())}
        binding.scienceButton.setOnClickListener{view: View ->
        view.findNavController().navigate(CategoryFragmentDirections.actionCategoryFragmentToScienceFragment())}
        binding.technologyButton.setOnClickListener{view: View ->
            view.findNavController().navigate(CategoryFragmentDirections.actionCategoryFragmentToTechnologyFragment())}
        //setHasOptionsMenu(true)
        (activity as AppCompatActivity).supportActionBar?.title = "Facts"
        return binding.root
    }
                //Options Menu will be activated later with some new menu
//    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
//        super.onCreateOptionsMenu(menu, inflater)
//        inflater?.inflate(R.menu.menu, menu)
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }
}
