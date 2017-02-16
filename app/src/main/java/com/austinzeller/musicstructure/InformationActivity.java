package com.austinzeller.musicstructure;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_information);

    final Button playButton = (Button)findViewById(R.id.playButton);
    playButton.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), PlayingActivity.class);
            startActivity(intent);
    }});}}