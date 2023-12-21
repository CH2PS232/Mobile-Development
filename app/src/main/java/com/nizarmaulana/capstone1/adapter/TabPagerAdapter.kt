package com.nizarmaulana.capstone1.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.nizarmaulana.capstone1.ui.makan.MakanFragment
import com.nizarmaulana.capstone1.ui.olahraga.OlahragaFragment

class TabPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MakanFragment()
            1 -> OlahragaFragment()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

    override fun getItemCount(): Int = 2
}