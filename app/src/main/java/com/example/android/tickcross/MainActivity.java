package com.example.android.tickcross;

import android.app.Activity;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView tickCross;
    private AnimatedVectorDrawableCompat tickToCross;
    private AnimatedVectorDrawableCompat crossToTick;
    private boolean tick = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tickCross = (ImageView) findViewById(R.id.tick_cross);
        tickToCross = AnimatedVectorDrawableCompat.create(this, R.drawable.avd_tick_to_cross);
        crossToTick = AnimatedVectorDrawableCompat.create(this, R.drawable.avd_cross_to_tick);

    }

    public void animate(View view) {
        AnimatedVectorDrawableCompat drawable = tick ? tickToCross : crossToTick;

        tickCross.setImageDrawable(drawable);
        drawable.start();
        tick = !tick;
    }
}
