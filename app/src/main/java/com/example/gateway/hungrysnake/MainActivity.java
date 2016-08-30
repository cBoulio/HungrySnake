package com.example.gateway.hungrysnake;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;
import static com.example.gateway.hungrysnake.R.id.testImage;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageX;
    private Button rightButton;
    private Button leftButton;
    private Button upButton;
    private Button downButton;

    private Button masterButton;

     private float x;
     private  float y;


    private float mX;
    private float mY;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageX = (ImageView) findViewById(R.id.testImage);
        masterButton = (Button) findViewById(R.id.masterButton);

        rightButton = (Button) findViewById(R.id.rightButton);
        rightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                x = imageX.getX();
                x+=5;
                imageX.setX(x);
            }
        });
        leftButton = (Button) findViewById(R.id.leftButton);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x = imageX.getX();
                x-=5;
                imageX.setX(x);
            }
        });
        upButton = (Button) findViewById(R.id.upButton);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                y = imageX.getY();
                y-=5;
                imageX.setY(y);
            }
        });
        downButton = (Button) findViewById(R.id.downButton);
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                y = imageX.getY();
                y+=5;
                imageX.setY(y);
            }
        });





    }





    @Override
    public void onClick(View view) {

    }



}
