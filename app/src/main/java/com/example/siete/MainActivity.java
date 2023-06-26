package com.example.siete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {
        ImageView spotify = findViewById(R.id.spotifybutton);
        ImageView youtube = findViewById(R.id.youtubebutton);
        ImageView whatsapp = findViewById(R.id.whatsappbutton);
        ImageView notes = findViewById(R.id.notesbutton);

        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Bienvenido, siga participando", Toast.LENGTH_LONG).show();
            }
        });


        whatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Bienvenido, siga participando", Toast.LENGTH_LONG).show();
            }
        });


        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Bienvenido, siga participando", Toast.LENGTH_LONG).show();
            }
        });


        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Bienvenido, siga participando", Toast.LENGTH_LONG).show();
            }
        });

    }
}