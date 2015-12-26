package dmitrydenezho.com.starwarsreminder.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dmitrydenezho.com.starwarsreminder.R;

/**
 * Created by Dmitry on 26.12.2015.
 */
public class FirstFragment extends Fragment {
    private static final int LAYOUT = R.layout.first_fragment;
    private View view;


    public static FirstFragment getInstance() {
        Bundle args = new Bundle();
        FirstFragment fragment = new FirstFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
