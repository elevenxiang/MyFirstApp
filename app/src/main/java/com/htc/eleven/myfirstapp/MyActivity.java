package com.htc.eleven.myfirstapp;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;


public class MyActivity extends AppCompatActivity {
    private final static String TAG = "ElevenButtonLayout";
    public final static String EXTRA_MESSAGE = "com.htc.eleven.myfirstapp.message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Log.i(TAG, "Now I am calling onCreate() !");

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */

        Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                System.out.println("I am clicked !");
//                Log.d("eleven", "I am on clicked !");
                Log.d(TAG, "I am on clicked now !");

                Intent intent = new Intent(MyActivity.this, DisplayActivity.class);

                EditText text =  (EditText) findViewById(R.id.edit_message);
                String message = text.getText().toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
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

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Now I am calling onStart() !");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Now I am calling onResume() !");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "Now I am calling onPostResume() !");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Now I am calling onPause() !");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Now I am calling onStop() !");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Now I am calling onDestroy() !");
    }


}
