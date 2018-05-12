package com.example.android.tourguideusa;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Tudor on 21.03.2017.
 */

/**
 * {@link Fragment} that displays a list of words ( restaurants ).
 */
public class InnFragment extends Fragment {

    public InnFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words ( restaurant names ).
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.drawable.everest_restaurant, R.string.everest_restaurant));
        words.add(new Word(R.drawable.jungsik, R.string.jungsik_restaurant));
        words.add(new Word(R.drawable.gotham_bar_and_grill, R.string.gotham_bar_and_grill_restaurant));
        words.add(new Word(R.drawable.spotted_pig, R.string.spotted_pig_restaurant));
        words.add(new Word(R.drawable.eleven_madison_park, R.string.eleven_madison_park_restaurant));

        /**
         * Create an {@link WordAdapter}, whose data source is a list of {@link Word}s.
         * The adapter knows how to create list items for each item in the list.
         */
        WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.inn_background);

        /**
         * Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
         * There should be a {@link ListView} with the view ID called list, which is declared in the
         * word_list.xml layout file.
         */
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        /**
         *  Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
         *  {@link ListView} will display list items for each {@link Word} in the list.
         */
        listView.setAdapter(wordAdapter);


        return rootView;
    }
}
