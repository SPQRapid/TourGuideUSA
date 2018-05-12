package com.example.android.tourguideusa;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Tudor on 21.03.2017.
 */

/**
 * WordAdapter is an ArrayAdapter that can provide the layout for each list item
 * based on a data source, which is a list of Word objects.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    // The background colors for the list of words.
    private int mColorsActivities;

    /**
     * Creating a new WordAdapter object.
     *
     * @param context          is the current context that the adapter is being created in.
     * @param words            is the list of {@link Word}s to be displayed.
     * @param colorsActivities is the background colors for this list of words
     */
    public WordAdapter(Context context, ArrayList<Word> words, int colorsActivities) {
        super(context, 0, words);
        mColorsActivities = colorsActivities;
    }

    /**
     * Using the ctr + o to create a view that will allow us to use the usa_list_item.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.usa_list_item, parent, false);
        }
        // Getting the {@link Word} object located at this position in the list.
        Word currentWord = getItem(position);

        // Finding the imageView in the list_item_usa with the ID picture_usa.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.picture_usa);
        /**
         * Getting the ImageData from the currentWord object and set this image
         * on the imageView.
         */
        imageView.setImageResource(currentWord.getImageData());

        // Finding the textView in the list_item_usa with the ID text_usa.
        TextView textView = (TextView) listItemView.findViewById(R.id.text_usa);
        /**
         * Getting the DescriptionUsa from the currentWord object and set this image
         * on the textView.
         */
        textView.setText(currentWord.getDescriptionUsa());

        // Set the theme color for the usa_list_item.
        View textContainer = listItemView.findViewById(R.id.background_color);
        // Find the color that the colors activities maps to.
        int color = ContextCompat.getColor(getContext(), mColorsActivities);
        // Set the background color of the textContainer view.
        textContainer.setBackgroundColor(color);

        /**
         * Return the whole list item layout (containing 1 TextView, 1 ImageView) so that it can be
         * shown in the usa_list_item.
         */
        return listItemView;
    }

}
