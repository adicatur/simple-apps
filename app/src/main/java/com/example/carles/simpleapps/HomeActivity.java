package com.example.carles.simpleapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    ImageView archerImage,androidImage,footballImage,musicImage;
    TextView nameText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String value = intent.getStringExtra("nama");

        nameText = (TextView) findViewById(R.id.name);

        androidImage= (ImageView) findViewById(R.id.image_android);
        archerImage= (ImageView) findViewById(R.id.image_arhcer);
        footballImage= (ImageView) findViewById(R.id.image_football);
        musicImage= (ImageView) findViewById(R.id.image_music);

        nameText.setText(value);
        androidImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Android", Toast.LENGTH_SHORT).show();
            }
        });
        archerImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Panahan", Toast.LENGTH_SHORT).show();
            }
        });
        footballImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Bola", Toast.LENGTH_SHORT).show();
            }
        });
        musicImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HomeActivity.this, "Musik", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
