package com.example.realmproject;

import androidx.appcompat.app.AppCompatActivity;

import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Discover extends AppCompatActivity implements View.OnClickListener {

    public CardView whoBtn, pollutionBtn, diseaseBtn, drinkBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        whoBtn = (CardView) findViewById(R.id.discoverWhoCard);
        pollutionBtn = (CardView) findViewById(R.id.discoverPollutionCard);
        diseaseBtn = (CardView) findViewById(R.id.discoverDiseaseCard);
        drinkBtn = (CardView) findViewById(R.id.discoverDrinkCard);

        whoBtn.setOnClickListener((View.OnClickListener)this);
        pollutionBtn.setOnClickListener((View.OnClickListener)this);
        diseaseBtn.setOnClickListener((View.OnClickListener)this);
        drinkBtn.setOnClickListener((View.OnClickListener)this);

    }

    @Override
    public void onClick(View view) {

        Intent i;
        switch (view.getId()) {

            case R.id.discoverWhoCard:Card:
            i = new Intent(this, Who.class);
                startActivity(i);
                break;

            case R.id.discoverPollutionCard:Card:
            i = new Intent(this, Pollution.class);
                startActivity(i);
                break;

            case R.id.discoverDiseaseCard:Card:
            i = new Intent(this, Disease.class);
                startActivity(i);
                break;

            case R.id.discoverDrinkCard:Card:
            i = new Intent(this, Drink.class);
                startActivity(i);
                break;

        }

    }
}