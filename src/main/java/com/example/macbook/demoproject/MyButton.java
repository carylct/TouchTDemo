package com.example.macbook.demoproject;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

/**
 * Created by LCT
 * Time:16/12/30 16:15.
 * Annotation：
 */
public class MyButton extends Button {

    public MyButton(Context context) {
        super(context);
    }
    public MyButton(Context context, AttributeSet attrs) {

        super(context, attrs);
    }

    String tag = "MyButton";

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        String tag1 = "dispatchTouchEvent";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("------>"+tag + tag1 + "ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("------>"+tag + tag1 + "ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("------>"+tag + tag1 + "ACTION_UP");
                break;

        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        String tag1 = "onTouchEvent";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println("------>"+tag + tag1 + "ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println("------>"+tag + tag1 + "ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println("------>"+tag + tag1 + "ACTION_UP");
                break;

        }
        return false;
    }
}
