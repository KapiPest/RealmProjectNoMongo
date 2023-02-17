package com.example.realmproject;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UsersWelcoming extends AppCompatActivity implements View.OnClickListener {

    public CardView dashboard, discover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_welcoming);


        dashboard = (CardView) findViewById(R.id.dashboardCard);
        discover = (CardView) findViewById(R.id.discoverCard);

        dashboard.setOnClickListener(this);
        discover.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        Intent i;

        switch (view.getId()) {
            case R.id.dashboardCard :
                i = new Intent(this,UserDashboard.class);
                startActivity(i);
                break;

            case R.id.discoverCard :
                i = new Intent(this,Discover.class);
                startActivity(i);
                break;

        }

    }

    public void onBackPressed() {

        Toast.makeText(UsersWelcoming.this, "End", Toast.LENGTH_SHORT).show();

    }
}