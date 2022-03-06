package com.example.color;
import android.util.AttributeSet;
import android.os.Build;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;


/**
 * Create objects
 * @author Tamsen Dean
 */
public class ColorView extends SurfaceView {
    public int dotColor;

    public Paint dot1Paint = new Paint();
    public Paint dot2Paint = new Paint();
    public Paint dot3Paint = new Paint();
    public Paint dot4Paint = new Paint();
    public Paint dot5Paint = new Paint();
    public Paint dot6Paint = new Paint();

    private ColorModel dotObj;

    public ColorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        dotObj = new ColorModel();
        this.setBackgroundColor(Color.WHITE);
        setColor();
    }

    public void setColor() {
        dotColor = Color.rgb(dotObj.dotR, dotObj.dotG, dotObj.dotB);
        this.dot1Paint.setColor(Color.RED);
        this.dot2Paint.setColor(Color.GREEN);
        this.dot3Paint.setColor(Color.BLUE);
        this.dot4Paint.setColor(Color.YELLOW);
        this.dot5Paint.setColor(Color.MAGENTA);
        this.dot6Paint.setColor(Color.CYAN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;

        canvas.drawCircle(width, height, 200.0f, dot1Paint);
        canvas.drawCircle(width+550, height+375, 200.0f, dot2Paint);
        canvas.drawCircle(width-475, height-500, 200.0f, dot3Paint);
        canvas.drawCircle(width+475, height-500, 200.0f, dot4Paint);
        canvas.drawCircle(width-450, height+375, 200.0f, dot5Paint);
        canvas.drawCircle(width, height+550, 200.0f, dot6Paint);
    }
    public ColorModel getObj(){
        return dotObj;
    }
}