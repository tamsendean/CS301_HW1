package com.example.color;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Main Activity
 * @author Tamsen Dean
 */
public class MainActivity extends AppCompatActivity {
    private View dotSelect;
    private ColorView dotObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView redVal = (TextView)findViewById(R.id.redNum);
        TextView greenVal = (TextView)findViewById(R.id.greenNum);
        TextView blueVal = (TextView)findViewById(R.id.blueNum);

        SeekBar redSeek = (SeekBar)findViewById(R.id.redSeekBar);
        SeekBar greenSeek = (SeekBar)findViewById(R.id.greenSeekBar);
        SeekBar blueSeek = (SeekBar)findViewById(R.id.blueSeekBar);

        dotObj = findViewById(R.id.dotView);
        ColorControl dot = new ColorControl(dotObj, redSeek, greenSeek, blueSeek, redVal, greenVal, blueVal);

        dotSelect = findViewById(R.id.dotView);
        dotSelect.setOnClickListener(dot);

        // set on seek bar change listener to seek bars
        redSeek.setOnSeekBarChangeListener(dot);
        greenSeek.setOnSeekBarChangeListener(dot);
        blueSeek.setOnSeekBarChangeListener(dot);

        Button dot1 = (Button)findViewById(R.id.dot1button);
        dot1.setOnClickListener(dot);
        Button dot2 = (Button)findViewById(R.id.dot2button);
        dot2.setOnClickListener(dot);
        Button dot3 = (Button)findViewById(R.id.dot3button);
        dot3.setOnClickListener(dot);
        Button dot4 = (Button)findViewById(R.id.dot4button);
        dot4.setOnClickListener(dot);
        Button dot5 = (Button)findViewById(R.id.dot5button);
        dot5.setOnClickListener(dot);
        Button dot6 = (Button)findViewById(R.id.dot6button);
        dot6.setOnClickListener(dot);

        // attempt to display seek bar values, successful in color control class
        redVal.setText("" + redSeek.getProgress());
        greenVal.setText("" + greenSeek.getProgress());
        blueVal.setText("" + blueSeek.getProgress());
    }
}