package com.austinzeller.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView playing = (TextView) findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link PlayingActivity}
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);

                // Start the new activity
                startActivity(playingIntent);
            }
        });

        // Find the View that shows the family category
        TextView store = (TextView) findViewById(R.id.store);

        // Set a click listener on that View
        store.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link StoreActivity}
                Intent storeIntent = new Intent(MainActivity.this, StoreActivity.class);

                // Start the new activity
                startActivity(storeIntent);
            }
        });

        // Find the View that shows the colors category
        TextView songs = (TextView) findViewById(R.id.songs);

        // Set a click listener on that View
        songs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SongsActivity}
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);

                // Start the new activity
                startActivity(songsIntent);
            }
        });

        // Find the View that shows the phrases category
        TextView information = (TextView) findViewById(R.id.information);

        // Set a click listener on that View
        information.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link InformationActivity}
                Intent informationIntent = new Intent(MainActivity.this, InformationActivity.class);

                // Start the new activity
                startActivity(informationIntent);
            }
        });

        
    }
}
