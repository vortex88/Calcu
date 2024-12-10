package com.example.yourapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class BlurView extends View {

    private Paint paint;
    private Bitmap bitmap;

    public BlurView(Context context) {
        super(context);
        init();
    }

    public BlurView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public BlurView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(Color.YELLOW); // Цвет свечения
        paint.setAlpha(7); // Прозрачность свечения (примерно 78% от 255)
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas tempCanvas = new Canvas(bitmap);
            tempCanvas.drawColor(Color.TRANSPARENT);
            tempCanvas.drawCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, paint); // Используем круг вместо прямоугольника
        }

        canvas.drawBitmap(bitmap, 0, 0, null);
    }

    public Bitmap getBitmap() {
        return bitmap;
    }
}