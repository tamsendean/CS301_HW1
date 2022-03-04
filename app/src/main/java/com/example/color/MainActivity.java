package com.example.color;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.view.View;
import android.widget.ArrayAdapter;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Spinner;
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

        TextView redVal = findViewById(R.id.redNum);
        TextView greenVal = findViewById(R.id.greenNum);
        TextView blueVal = findViewById(R.id.blueNum);

        SeekBar redSeek = findViewById(R.id.redSeekBar);
        SeekBar greenSeek = findViewById(R.id.greenSeekBar);
        SeekBar blueSeek = findViewById(R.id.blueSeekBar);

        dotObj = findViewById(R.id.dotView);
        ColorControl dot = new ColorControl(dotObj, redSeek, greenSeek, blueSeek, redVal, greenVal, blueVal);

        dotSelect = findViewById(R.id.dotView);
        dotSelect.setOnClickListener(dot);

        // set on seek bar change listener to seek bars
        SeekBar redSeekBar = findViewById(R.id.redSeekBar);
        redSeekBar.setOnSeekBarChangeListener(dot);

        SeekBar greenSeekBar = findViewById(R.id.greenSeekBar);
        greenSeekBar.setOnSeekBarChangeListener(dot);

        SeekBar blueSeekBar = findViewById(R.id.blueSeekBar);
        blueSeekBar.setOnSeekBarChangeListener(dot);

        // set seek bars to show progress
        /*dotSelect.red

        greenSeekBar.setProgress(dot.green);

        blueSeekBar.setProgress(dot.blue);
*/
        // set text views to show progress
        TextView redNum = findViewById(R.id.redNum);
        redNum.setText("" + redSeekBar.getProgress());

        TextView greenNum = findViewById(R.id.greenNum);
        greenNum.setText("" + greenSeekBar.getProgress());

        TextView blueNum = findViewById(R.id.blueNum);
        blueNum.setText("" + blueSeekBar.getProgress());
    }
}