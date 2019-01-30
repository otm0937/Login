package com.example.otm09.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView logo_image;
    ImageView logo_wheel_one;
    ImageView logo_wheel_two;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Make Android Stat Bar Transparent
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);

        logo_image = (ImageView) findViewById(R.id.logo);
        logo_wheel_one = (ImageView) findViewById(R.id.wheelone);
        logo_wheel_two = (ImageView) findViewById(R.id.wheeltwo);

        Animation animation_one = AnimationUtils.loadAnimation(this, R.anim.rotate_around_center_point_opposite);
        logo_wheel_one.startAnimation(animation_one);
        Animation animation_two = AnimationUtils.loadAnimation(this, R.anim.rotate_around_center_point);
        logo_wheel_two.startAnimation(animation_two);
    }
}
