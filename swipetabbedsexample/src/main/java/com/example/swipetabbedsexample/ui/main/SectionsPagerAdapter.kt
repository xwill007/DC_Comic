package com.example.swipetabbedsexample.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.swipetabbedsexample.*

private val TAB_TITLES = arrayOf(
    R.string.batman_title,
    R.string.flash_title,
    R.string.superman_title,
    R.string.wonder_title
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        when(position){
            0-> return BatmanFragment()
            1-> return FlashFragment()
            2-> return SupermanFragment()
            3-> return WonderWomanFragment()
        }
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int =4
        // Show 2 total pages.


}