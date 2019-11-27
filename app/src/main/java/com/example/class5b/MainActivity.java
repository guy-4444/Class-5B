package com.example.class5b;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView main_IMG_top;
    private Button main_BTN_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_IMG_top = findViewById(R.id.main_IMG_top);
        main_BTN_go = findViewById(R.id.main_BTN_go);

        main_BTN_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animateItCode();
            }
        });
    }

    private void animateItCode() {
        main_IMG_top.setScaleX(0);
        main_IMG_top.setScaleY(0);
        main_IMG_top.setRotation(0);
        main_IMG_top.animate()
                //.rotation(360)
                .scaleX(1)
                .scaleY(1)
//                .setListener(new Animator.AnimatorListener() {
//                    @Override
//                    public void onAnimationStart(Animator animation) {
//
//                    }
//
//                    @Override
//                    public void onAnimationEnd(Animator animation) {
//                        animateItCode();
//                    }
//
//                    @Override
//                    public void onAnimationCancel(Animator animation) {
//
//                    }
//
//                    @Override
//                    public void onAnimationRepeat(Animator animation) {
//
//                    }
//                })
                .setDuration(2000)
                .setInterpolator(new AccelerateInterpolator())
                .start();

    }


    private void animateIt() {
        Animation animation;
        animation = AnimationUtils.loadAnimation(this, R.anim.anim_popup);
        main_IMG_top.startAnimation(animation);
    }
}
