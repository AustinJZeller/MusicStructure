package com.austinzeller.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

    final Button storeButton = (Button)findViewById(R.id.storeButton);
    storeButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), StoreActivity.class);
            startActivity(intent);
        }});}}

