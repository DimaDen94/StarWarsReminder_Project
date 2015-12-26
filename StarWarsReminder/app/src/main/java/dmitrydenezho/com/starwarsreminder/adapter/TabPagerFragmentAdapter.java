package dmitrydenezho.com.starwarsreminder.adapter;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import dmitrydenezho.com.starwarsreminder.fragments.FirstFragment;

/**
 * Created by Dmitry on 26.12.2015.
 */
public class TabPagerFragmentAdapter extends FragmentPagerAdapter {
    private String[] tabs;
    public TabPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{"Таб 1","Напонимание","Tab 2"};


    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        switch (position){
            case 0:

                return FirstFragment.getInstance();
            case 1:
                return FirstFragment.getInstance();

            case 2:
                return FirstFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
