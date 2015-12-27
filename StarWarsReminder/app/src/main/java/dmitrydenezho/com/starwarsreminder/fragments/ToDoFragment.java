package dmitrydenezho.com.starwarsreminder.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import dmitrydenezho.com.starwarsreminder.R;

/**
 * Created by Dmitry on 26.12.2015.
 */
public class ToDoFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.first_fragment;

    public static ToDoFragment getInstance(Context context) {
        Bundle args = new Bundle();
        ToDoFragment fragment = new ToDoFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_todo));
        return fragment;
    }
        @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }

}
