package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ThinkPad on 3/5/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    //Resource ID for background color for this list of word
    private int mColorResourceId;


    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param androidFlavors A List of AndroidFlavor objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> words, int colorsResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);
        mColorResourceId = colorsResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
    // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;
        if(listItemView == null) {
        listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.list_item, parent, false);
    }

    // Get the {@link AndroidFlavor} object located at this position in the list
    Word currentWord = getItem(position);

    // Find the TextView in the list_item.xml layout with the ID version_name
    TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
    // Get the version name from the current AndroidFlavor object and
    // set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

    // Find the TextView in the list_item.xml layout with the ID version_number
    TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
    // Get the version number from the current AndroidFlavor object and
    // set this text on the number TextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //find the ImageView in the list_item.xml
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getmImageResouceId());  // chu ý phuong thuc setImageResource nhé
            // de dam bao View duoc hien len
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE); // GONE la khi ẩn đi thì View không chiếm không gian View. Còn thằng VISIBLE thì nó bị ẩn nhưng vẫn chiếm không gian.
        }

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // find the color that resource ID map
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);

    // Return the whole list item layout (containing 2 TextViews and an ImageView)
    // so that it can be shown in the ListView
        return listItemView;
}
}
