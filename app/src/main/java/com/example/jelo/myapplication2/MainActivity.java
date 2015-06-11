package com.example.jelo.myapplication2;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button red = (Button) findViewById(R.id.button);
        Button white = (Button) findViewById(R.id.button4);
        Button black = (Button) findViewById(R.id.button3);
        Button green = (Button) findViewById((R.id.button2));
    final RelativeLayout ll = (RelativeLayout) findViewById(R.id.joze);


        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll.setBackgroundColor(Color.RED);

            }
        });

        white.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll.setBackgroundColor(Color.WHITE);

            }
        });

        black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll.setBackgroundColor(Color.BLACK);

            }
        });
        green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll.setBackgroundColor(Color.GREEN);

            }
        });
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
