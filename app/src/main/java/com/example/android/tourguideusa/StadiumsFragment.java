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
 * {@link Fragment} that displays a list of words ( stadiums ).
 */
public class StadiumsFragment extends Fragment {

    public StadiumsFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.drawable.att_stadium, R.string.att_stadium));
        words.add(new Word(R.drawable.lucas_oil__stadium, R.string.lucas_oil_stadium));
        words.add(new Word(R.drawable.century_link_field, R.string.century_link_field_stadium));
        words.add(new Word(R.drawable.ever_bank_field, R.string.ever_bank_field_stadium));
        words.add(new Word(R.drawable.fenway_park, R.string.fenway_park_stadium));

        /**
         * Create an {@link WordAdapter}, whose data source is a list of {@link Word}s.
         * The adapter knows how to create list items for each item in the list.
         */
        WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.museums_background);

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
