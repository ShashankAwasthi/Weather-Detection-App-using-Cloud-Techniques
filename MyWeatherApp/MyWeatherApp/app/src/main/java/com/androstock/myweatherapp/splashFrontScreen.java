package com.androstock.myweatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class splashFrontScreen extends AppCompatActivity {

    Button splashscreen;
    Animation downtoup,fadeIn;
    TextView welcomeMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_front_screen);
        splashscreen=(Button)findViewById(R.id.okUnderstandButton);
        welcomeMessage=(TextView)findViewById(R.id.welcomeMessage);
        downtoup= AnimationUtils.loadAnimation(this,R.anim.buttondowntoup);
        splashscreen.setAnimation(downtoup);
        fadeIn=AnimationUtils.loadAnimation(this,R.anim.fadein);
        welcomeMessage.setAnimation(fadeIn);
    }
    public void buttonSubmit(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
