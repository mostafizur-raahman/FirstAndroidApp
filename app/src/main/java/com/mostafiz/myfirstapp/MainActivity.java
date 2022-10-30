package com.mostafiz.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn,btn2;
    TextView text;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        text = findViewById(R.id.textView);

        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);

       /* btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                if ( count == 20 ){
                    count = 0;
                    text.setText("You cross the limit now count " + count + " Times");
                }
                else{
                    text.setText("Button Clicked " + count + " Times");
                }

            }
        });*/


    }

    @Override
    public void onClick(View view) {
        if ( view.getId() == R.id.button ){
            text.setText("Log in successful,congrstualation!");
        }
        if ( view.getId() == R.id.button2 ){
            text.setText("Log out successful,congrstualation!");
        }

    }
}