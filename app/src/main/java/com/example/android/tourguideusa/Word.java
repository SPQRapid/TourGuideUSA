package com.example.android.tourguideusa;

/**
 * Created by Tudor on 21.03.2017.
 */

public class Word {

    // int for the image of the activity.
    private int mImageUsa;

    // int for the description of the activity.
    private int mDescriptionUsa;

    /**
     * Creating a new Word object.
     *
     * @param imageUsa       is the int for the image of the activity.
     * @param descriptionUsa is the int for the description of the activity.
     */
    public Word(int imageUsa, int descriptionUsa) {
        mImageUsa = imageUsa;
        mDescriptionUsa = descriptionUsa;
    }

    // Returns the image of the activity.
    public int getImageData() {
        return mImageUsa;
    }

    // Returns the description of the activity.
    public int getDescriptionUsa() {
        return mDescriptionUsa;
    }
}
