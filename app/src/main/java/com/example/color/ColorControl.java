package com.example.color;

import android.graphics.Color;
import android.widget.SeekBar;
import android.view.View;
import android.widget.TextView;

/**
 * HW 1
 * @author Tamsen Dean
 */
public class ColorControl implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    private ColorView dotView;
    private ColorModel dotModel;
    private SeekBar rSeek;
    private SeekBar gSeek;
    private SeekBar bSeek;
    private TextView rSeekVal;
    private TextView gSeekVal;
    private TextView bSeekVal;
    public int color;

    public ColorControl(ColorView dotView, SeekBar rSeek, SeekBar gSeek, SeekBar bSeek, TextView rSeekVal, TextView gSeekVal, TextView bSeekVal) {
        this.dotView = dotView;
        this.dotModel = this.dotView.getObj();
        this.rSeek = rSeek;
        this.gSeek = gSeek;
        this.bSeek = bSeek;
        this.rSeekVal = rSeekVal;
        this.gSeekVal = gSeekVal;
        this.bSeekVal = bSeekVal;
    }

    @Override // upon clicking dot, its specific color is changed with rgb values
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.dot1button:
                color = Color.rgb(dotModel.dotR, dotModel.dotG, dotModel.dotB);
                this.dotView.dot1Paint.setColor(color);
                this.rSeek.setProgress(dotModel.dotR);
                this.gSeek.setProgress(dotModel.dotG);
                this.bSeek.setProgress(dotModel.dotB);
                this.rSeekVal.setText("" + dotModel.dotR);
                this.gSeekVal.setText("" + dotModel.dotG);
                this.bSeekVal.setText("" + dotModel.dotB);
                break;
            case R.id.dot2button:
                color = Color.rgb(dotModel.dotR, dotModel.dotG, dotModel.dotB);
                this.dotView.dot2Paint.setColor(color);
                this.rSeek.setProgress(dotModel.dotR);
                this.gSeek.setProgress(dotModel.dotG);
                this.bSeek.setProgress(dotModel.dotB);
                this.rSeekVal.setText("" + dotModel.dotR);
                this.gSeekVal.setText("" + dotModel.dotG);
                this.bSeekVal.setText("" + dotModel.dotB);
                break;
            case R.id.dot3button:
                color = Color.rgb(dotModel.dotR, dotModel.dotG, dotModel.dotB);
                this.dotView.dot3Paint.setColor(color);
                this.rSeek.setProgress(dotModel.dotR);
                this.gSeek.setProgress(dotModel.dotG);
                this.bSeek.setProgress(dotModel.dotB);
                this.rSeekVal.setText("" + dotModel.dotR);
                this.gSeekVal.setText("" + dotModel.dotG);
                this.bSeekVal.setText("" + dotModel.dotB);
                break;
            case R.id.dot4button:
                color = Color.rgb(dotModel.dotR, dotModel.dotG, dotModel.dotB);
                this.dotView.dot4Paint.setColor(color);
                this.rSeek.setProgress(dotModel.dotR);
                this.gSeek.setProgress(dotModel.dotG);
                this.bSeek.setProgress(dotModel.dotB);
                this.rSeekVal.setText("" + dotModel.dotR);
                this.gSeekVal.setText("" + dotModel.dotG);
                this.bSeekVal.setText("" + dotModel.dotB);
                break;
            case R.id.dot5button:
                color = Color.rgb(dotModel.dotR, dotModel.dotG, dotModel.dotB);
                this.dotView.dot5Paint.setColor(color);
                this.rSeek.setProgress(dotModel.dotR);
                this.gSeek.setProgress(dotModel.dotG);
                this.bSeek.setProgress(dotModel.dotB);
                this.rSeekVal.setText("" + dotModel.dotR);
                this.gSeekVal.setText("" + dotModel.dotG);
                this.bSeekVal.setText("" + dotModel.dotB);
                break;
            case R.id.dot6button:
                color = Color.rgb(dotModel.dotR, dotModel.dotG, dotModel.dotB);
                this.dotView.dot6Paint.setColor(color);
                this.rSeek.setProgress(dotModel.dotR);
                this.gSeek.setProgress(dotModel.dotG);
                this.bSeek.setProgress(dotModel.dotB);
                this.rSeekVal.setText("" + dotModel.dotR);
                this.gSeekVal.setText("" + dotModel.dotG);
                this.bSeekVal.setText("" + dotModel.dotB);
                break;
        }
        dotView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (!fromUser) return;
        switch (seekBar.getId()) {
            case R.id.redSeekBar:
                // colored progress
                dotModel.dotR = rSeek.getProgress();
                break;

            case R.id.greenSeekBar:
                dotModel.dotG = gSeek.getProgress();
                break;

            case R.id.blueSeekBar:
                dotModel.dotB = bSeek.getProgress();
                break;
        }
        dotView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        //null
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        //null
    }
}