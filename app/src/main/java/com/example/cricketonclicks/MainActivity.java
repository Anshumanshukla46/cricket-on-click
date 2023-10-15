package com.example.cricketonclicks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int a = 0,b = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sixa(View view){
        a+=6;
        displayForTeamA(a);
    }

    public void foura(View view){
        a+=4;
        displayForTeamA(a);
    }

    public void threea(View view){
        a+=3;
        displayForTeamA(a);
    }

    public void twoa(View view){
        a+=2;
        displayForTeamA(a);
    }

    public void onea(View view){
        a+=1;
        displayForTeamA(a);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void again(View v){
        a = 0;
        b = 0;
        displayForTeamA(a);
        displayForTeamB(b);
    }

    public void sixb(View view){
        b+=6;
        displayForTeamB(b);
    }

    public void fourb(View view){
        b+=4;
        displayForTeamB(b);
    }

    public void threeb(View view){
        b+=3;
        displayForTeamB(b);
    }

    public void twob(View view){
        b+=2;
        displayForTeamB(b);
    }

    public void oneb(View view){
        b+=1;
        displayForTeamB(b);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}