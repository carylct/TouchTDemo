package com.example.macbook.demoproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        TextView text=(TextView) findViewById(R.id.text);
        ViewGroup.LayoutParams  la=text.getLayoutParams();
        la.width=550;
        la.height=300;
        text.setLayoutParams(la);
    }
    String tag = "MainActivity";

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        String tag1 = "dispatchTouchEvent";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println(tag + tag1 + "ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println(tag + tag1 + "ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println(tag + tag1 + "ACTION_UP");
                break;

        }
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        String tag1 = "onTouchEvent";
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                System.out.println(tag + tag1 + "ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                System.out.println(tag + tag1 + "ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                System.out.println(tag + tag1 + "ACTION_UP");
                break;

        }
        return false;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
