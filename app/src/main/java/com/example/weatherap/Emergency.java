package com.example.weatherap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Emergency extends AppCompatActivity {

    Button fire,disaster,ambulance;
    Animation scaleup,scaledown;
    Button buttonCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);

        fire = findViewById(R.id.fire);
        disaster = findViewById(R.id.disaster);
        ambulance = findViewById(R.id.ambulance);

        scaleup = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaledown =  AnimationUtils.loadAnimation(this,R.anim.scale_down);

        fire.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    fire.startAnimation(scaleup);

                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    fire.startAnimation(scaledown);
                }

                    return false;
            }
        });

        disaster.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    disaster.startAnimation(scaleup);

                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    disaster.startAnimation(scaledown);
                }

                return false;
            }
        });

        ambulance.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent){
                if (motionEvent.getAction()==MotionEvent.ACTION_DOWN){
                    ambulance.startAnimation(scaleup);

                }else if (motionEvent.getAction()==MotionEvent.ACTION_UP){
                    ambulance.startAnimation(scaledown);
                }

                return false;
            }
        });

        buttonCall = findViewById(R.id.fire);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:110"));
                startActivity(intent);
            }
        });

        buttonCall = findViewById(R.id.disaster);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:117"));
                startActivity(intent);
            }
        });

        buttonCall = findViewById(R.id.ambulance);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:1990"));
                startActivity(intent);
            }
        });

    }
}