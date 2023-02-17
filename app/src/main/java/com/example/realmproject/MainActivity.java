package com.example.realmproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("preferences", MODE_PRIVATE);
        boolean firstTime = preferences.getBoolean("firstTime", true);

        if (firstTime) {
            setContentView(R.layout.activity_main);

            button = findViewById(R.id.pop_btn);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(MainActivity.this, UsersWelcoming.class);
                    startActivity(intent);


                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putBoolean("firstTime", false);
                    editor.apply();
                    finish();

                }
            });
        } else {

            Intent intent = new Intent(MainActivity.this, UsersWelcoming.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    public void onClick(View view) {

    }
}