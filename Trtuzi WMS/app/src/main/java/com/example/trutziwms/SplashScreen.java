package com.example.trutziwms;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class SplashScreen extends AppCompatActivity {

    ImageView trutziImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        trutziImage = findViewById(R.id.trutzi_logo_in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startEnterAnimation();
            }

        },1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                exitAnimation();
            }

        },2500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }

        },7000);
    }

    private void startEnterAnimation() {
        trutziImage.startAnimation(AnimationUtils.loadAnimation(this,R.anim.image_in));
        trutziImage.setVisibility(View.VISIBLE);
    }

    private void exitAnimation() {
        trutziImage.startAnimation(AnimationUtils.loadAnimation(this,R.anim.image_out));
        trutziImage.setVisibility(View.INVISIBLE);
    }

}
