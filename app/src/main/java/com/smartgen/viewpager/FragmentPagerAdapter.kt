package com.smartgen.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentPagerAdapter(fm:FragmentManager,lc:Lifecycle):FragmentStateAdapter(fm,lc) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
     return when(position){
          0->BlankFragment()
          1->BlankFragment2()
          2->BlankFragment3()
          else->BlankFragment()
      }
    }

}