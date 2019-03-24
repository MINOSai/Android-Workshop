package com.minosai.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.parsers.SAXParser;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    TextView textView;
    Button buttonChangeDescription;
    Button buttonHideImage;

    Button buttonSecondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MAIN_ACTIVITY TAG", "Hello World");

        imageView = findViewById(R.id.image_main);
        textView = findViewById(R.id.text_image_description);
        buttonChangeDescription = findViewById(R.id.button_change_description);
        buttonHideImage = findViewById(R.id.button_hide_image);
        buttonSecondActivity = findViewById(R.id.button_change_activity);

        buttonChangeDescription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeDescription();
            }
        });

        buttonHideImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideImage();
            }
        });

        buttonSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchSecondActivity();
            }
        });

    }

    private void launchSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    private void hideImage() {

        if (imageView.getVisibility() == View.VISIBLE) {
            imageView.setVisibility(View.INVISIBLE);
        } else {
            imageView.setVisibility(View.VISIBLE);
        }
    }

    private void changeDescription() {
        textView.setText("Description Changed");
    }
}
