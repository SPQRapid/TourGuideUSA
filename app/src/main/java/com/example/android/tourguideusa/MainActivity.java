package com.example.android.tourguideusa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Finding the imageView ID named usa_flag.
        ImageView usaFlag = (ImageView) findViewById(R.id.usa_flag);
        usaFlag.setImageResource(R.drawable.usa);

        // Finding the imageView ID named statue_liberty.
        ImageView statueLiberty = (ImageView) findViewById(R.id.statue_liberty);
        statueLiberty.setImageResource(R.drawable.statue_liberty);

        // Finding the textView ID named text_button.
        TextView textView = (TextView) findViewById(R.id.text_button);

        // Creating a on Click Listener.
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Creating a intent.
                Intent textViewIntent = new Intent(MainActivity.this, TourGuide.class);

                // Start a new activity.
                startActivity(textViewIntent);
            }
        });

    }
}
