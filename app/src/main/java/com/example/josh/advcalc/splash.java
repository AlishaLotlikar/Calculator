package com.example.josh.advcalc;

import android.content.Intent;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class splash extends AppCompatActivity {
    ImageView img;
    Animation an,rotate;
    AnimationSet set=new AnimationSet(false);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        an=AnimationUtils.loadAnimation(splash.this,R.anim.zoom_in);
        rotate=AnimationUtils.loadAnimation(splash.this,R.anim.rotate);
        //an.reset();
        img=findViewById(R.id.imgLogo);
        //img.clearAnimation();
        //img.startAnimation(an);
        set.addAnimation(an);
        set.addAnimation(rotate);
        img.startAnimation(set);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(splash.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 3000);
    }

}
