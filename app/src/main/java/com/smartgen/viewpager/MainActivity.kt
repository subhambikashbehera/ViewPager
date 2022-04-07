package com.smartgen.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var tabLayout:TabLayout
    lateinit var viewPager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager=findViewById(R.id.viewPager)
        tabLayout=findViewById(R.id.tabLayout)
        viewPager.adapter=FragmentPagerAdapter(supportFragmentManager,lifecycle)
        TabLayoutMediator(tabLayout,viewPager){ tab: TabLayout.Tab, i: Int ->
            when(i){
                0->{tab.text="Chat"}
                1->{tab.text="status"}
                2->{tab.text="calls"}
                else->{tab.text="chats"}
            }
        }.attach()
    }
}