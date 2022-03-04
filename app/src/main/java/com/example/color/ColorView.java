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
    public int d1Color;
    public int eyeColor;
    public int hairColor;
    public int hairStyle;

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
        this.dot1Paint.setColor(Color.RED);
        setColor();
    }

    public void setColor() {
        d1Color = Color.rgb(dotObj.dotR, dotObj.dotG, dotObj.dotB);
        eyeColor = Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        hairColor = Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        hairStyle = (int) (Math.random() * 3);
        this.dot1Paint.setColor(d1Color);
        this.dot2Paint.setColor(eyeColor);
        this.dot3Paint.setColor(hairColor);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        int length = height;
        if (hairStyle == 0) {
            length = length + 500;
        } else if (hairStyle == 1) {
            length = length + 600;
        } else if (hairStyle == 2) {
            length = length + 700;
        }


        canvas.drawCircle(width, height, 200.0f, dot1Paint);

    }
    public ColorModel getObj(){
        return dotObj;
    }
}