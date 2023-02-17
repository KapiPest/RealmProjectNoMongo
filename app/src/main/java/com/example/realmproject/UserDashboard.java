package com.example.realmproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class UserDashboard extends AppCompatActivity implements View.OnClickListener {

    String Time;
    SimpleDateFormat simpleTimeFormat;
    Calendar calendar;
    private TextView waterTemperatureParameterTime, waterTurbidityParameterTime, waterPhParameterTime;
    private TextView waterTempVal, waterTurbidityVal, waterPhVal;
    private TextView waterTempStat, waterTurbidityStat, waterPhStat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_dashboard);

        waterTempVal = (TextView)findViewById(R.id.waterTemperatureParameterValue);
        waterTurbidityVal = (TextView)findViewById(R.id.waterTurbidityParameterValue);
        waterPhVal = (TextView)findViewById(R.id.waterPhParameterValue);

        waterTempStat = (TextView)findViewById(R.id.waterTemperatureParameterStatus);
        waterTurbidityStat = (TextView)findViewById(R.id.waterTurbidityParameterStatus);
        waterPhStat = (TextView)findViewById(R.id.waterPhParameterStatus);

        /*FOR DATE AND TIME IN DASHBOARD*/

        waterTemperatureParameterTime = findViewById(R.id.waterTemperatureParameterTime);
        waterTurbidityParameterTime = findViewById(R.id.waterTurbidityParameterTime);
        waterPhParameterTime = findViewById(R.id.waterPhParameterTime);
        calendar = Calendar.getInstance();
        simpleTimeFormat = new SimpleDateFormat("HH:mm");
        Time = simpleTimeFormat.format(calendar.getTime());


        waterTemperatureParameterTime.setText(Time);
        waterTurbidityParameterTime.setText(Time);
        waterPhParameterTime.setText(Time);

    }

    @Override
    public void onClick(View view) {


    }
}