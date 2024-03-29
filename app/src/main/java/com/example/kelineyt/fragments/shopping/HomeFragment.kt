package com.example.kelineyt.fragments.shopping

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kelineyt.R
import com.example.kelineyt.adapters.HomeViewpagerAdapter
import com.example.kelineyt.databinding.FragmentHomeBinding
import com.example.kelineyt.fragments.categories.*
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoriesFragments = arrayListOf(
            MainCategoryFragment(),
            ChairFragment(),
            CupboardFragment(),
            TableFragment(),
            AccessoryFragment(),
            FurnitureFragment()
        )

        binding.viewpagerHome.isUserInputEnabled = false

        val viewPager2Adapter =
            HomeViewpagerAdapter(categoriesFragments, childFragmentManager, lifecycle)
        binding.viewpagerHome.adapter = viewPager2Adapter
        TabLayoutMediator(binding.tabLayout, binding.viewpagerHome) { tab, position ->
            when (position) {
                0 -> tab.text = "Inicio"
                1 -> tab.text = "Chocotejas"
                2 -> tab.text = "Para Regalar"
                3 -> tab.text = "Chocolates"
                4 -> tab.text = "Barras de Chocolate"
                5 -> tab.text = "Bombones y Trufas"
            }
        }.attach()
    }
}