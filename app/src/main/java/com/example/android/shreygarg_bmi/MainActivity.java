package com.example.android.shreygarg_bmi;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calc(View view) {
        float x = 0, y = 0;
        TextView a = (TextView) findViewById(R.id.bmi);
        TextView b = (TextView) findViewById(R.id.status);
        EditText h = (EditText) findViewById(R.id.height);
        EditText w = (EditText) findViewById(R.id.weight);
        EditText n = (EditText) findViewById(R.id.name);
        if (!(n.getText().toString().equals(""))&&!(h.getText().toString().equals(""))&&!(w.getText().toString().equals("")))
        {
                x = Float.valueOf(h.getText().toString());

                y = Float.valueOf(w.getText().toString());

                float z = (y / (x * x)) * 10000;
                DecimalFormat abc = new DecimalFormat("#.#");
                a.setText("" + z);
                if (z < 18.5) {
                    b.setText("Under Weight");
                    a.setText("" + abc.format(z));
                    b.setTextColor(Color.parseColor("#F44336"));
                    a.setTextColor(Color.parseColor("#F44336"));
                } else if (z < 25) {
                    b.setText("Normal");
                    a.setText("" + abc.format(z));
                    b.setTextColor(Color.parseColor("#03A9F4"));
                    a.setTextColor(Color.parseColor("#03A9F4"));
                } else if (z < 30) {
                    b.setText("Over Weight");
                    a.setText("" + abc.format(z));
                    b.setTextColor(Color.parseColor("#FFA000"));
                    a.setTextColor(Color.parseColor("#ffa000"));
                } else {
                    b.setText("Obesity");
                    a.setText("" + abc.format(z));
                    b.setTextColor(Color.parseColor("#FF0000"));
                    a.setTextColor(Color.parseColor("#FF0000"));
                }
            }
        }
    }