package com.example.diceroll;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView critmiss;
    private TextView crithit;
    private MediaPlayer roll;
    private MediaPlayer miss;
    private MediaPlayer hit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        critmiss = findViewById(R.id.CritMiss);
        crithit = findViewById(R.id.CritHit);
        roll = MediaPlayer.create(MainActivity.this,R.raw.rolldice);
        miss = MediaPlayer.create(MainActivity.this,R.raw.metalclang);
        hit = MediaPlayer.create(MainActivity.this,R.raw.metalgong);
        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }


    //Don't have all the code like the onClickListener

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;

        roll.start();

        if (critmiss.isShown())
            critmiss.setVisibility(View.INVISIBLE);

        if (crithit.isShown())
            crithit.setVisibility(View.INVISIBLE);

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.mipmap.d201);
                critmiss.setVisibility(View.VISIBLE);
                miss.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.mipmap.d202);
                break;
            case 3:
                imageViewDice.setImageResource(R.mipmap.d203);
                break;
            case 4:
                imageViewDice.setImageResource(R.mipmap.d204);
                break;
            case 5:
                imageViewDice.setImageResource(R.mipmap.d205);
                break;
            case 6:
                imageViewDice.setImageResource(R.mipmap.d206);
                break;
            case 7:
                imageViewDice.setImageResource(R.mipmap.d207);
                break;
            case 8:
                imageViewDice.setImageResource(R.mipmap.d208);
                break;
            case 9:
                imageViewDice.setImageResource(R.mipmap.d209);
                break;
            case 10:
                imageViewDice.setImageResource(R.mipmap.d2010);
                break;
            case 11:
                imageViewDice.setImageResource(R.mipmap.d2011);
                break;
            case 12:
                imageViewDice.setImageResource(R.mipmap.d2012);
                break;
            case 13:
                imageViewDice.setImageResource(R.mipmap.d2013);
                break;
            case 14:
                imageViewDice.setImageResource(R.mipmap.d2014);
                break;
            case 15:
                imageViewDice.setImageResource(R.mipmap.d2015);
                break;
            case 16:
                imageViewDice.setImageResource(R.mipmap.d2016);
                break;
            case 17:
                imageViewDice.setImageResource(R.mipmap.d2017);
                break;
            case 18:
                imageViewDice.setImageResource(R.mipmap.d2018);
                break;
            case 19:
                imageViewDice.setImageResource(R.mipmap.d2019);
                break;
            case 20:
                imageViewDice.setImageResource(R.mipmap.d2020);
                crithit.setVisibility(View.VISIBLE);
                hit.start();
                break;
        }
    }
}
