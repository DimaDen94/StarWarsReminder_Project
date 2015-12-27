package dmitrydenezho.com.starwarsreminder.adapter;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import dmitrydenezho.com.starwarsreminder.R;
import dmitrydenezho.com.starwarsreminder.fragments.AbstractTabFragment;
import dmitrydenezho.com.starwarsreminder.fragments.BirthdayFragment;
import dmitrydenezho.com.starwarsreminder.fragments.HistoryFragment;
import dmitrydenezho.com.starwarsreminder.fragments.IdeasFragment;
import dmitrydenezho.com.starwarsreminder.fragments.ToDoFragment;

/**
 * Created by Dmitry on 26.12.2015.
 */
public class TabPagerFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabPagerFragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
        tabs  = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, ToDoFragment.getInstance(context));
        tabs.put(3, BirthdayFragment.getInstance(context));
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {

        return tabs.get(position);

    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
