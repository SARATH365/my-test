package com.sarath.myapplication.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.sarath.myapplication.R;
import com.sarath.myapplication.model.TableMenuList;
import com.sarath.myapplication.pojo.Catagory;

import java.util.ArrayList;
import java.util.List;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    // @StringRes
    //  private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2};
    private final Context mContext;
    List<TableMenuList> tableMenuLists = new ArrayList<>();

    public SectionsPagerAdapter(Context context, FragmentManager fm, List<TableMenuList> catagoryArrayList) {
        super(fm);
        mContext = context;
        this.tableMenuLists = catagoryArrayList;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1, tableMenuLists);

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tableMenuLists.get(position).getMenuCategory();
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        if (tableMenuLists != null) {
            return tableMenuLists.size();
        } else {
            return 0;
        }
    }
}