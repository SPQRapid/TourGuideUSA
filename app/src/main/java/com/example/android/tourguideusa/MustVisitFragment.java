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
 * {@link Fragment} that displays a list of words ( must visit ).
 */
public class MustVisitFragment extends Fragment {

    public MustVisitFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Creating a list of words
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(R.drawable.walt_disney_worlds_magic_kingdom, R.string.walt_disney_worlds_magic_kingdom));
        words.add(new Word(R.drawable.big_sur, R.string.big_sur));
        words.add(new Word(R.drawable.mount_rushmore, R.string.mount_rushmore));
        words.add(new Word(R.drawable.grand_canyon, R.string.grand_canyon));
        words.add(new Word(R.drawable.grand_prismatic_spring, R.string.grand_prismatic_spring));

        /**
         * Create an {@link WordAdapter}, whose data source is a list of {@link Word}s.
         * The adapter knows how to create list items for each item in the list.
         */
        WordAdapter wordAdapter = new WordAdapter(getActivity(), words, R.color.must_see_background);

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
