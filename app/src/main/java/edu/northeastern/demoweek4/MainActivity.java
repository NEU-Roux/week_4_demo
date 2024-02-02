package edu.northeastern.demoweek4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import com.google.android.material.snackbar.Snackbar;

import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(view -> {
            Snackbar.make(view, "Say something", Snackbar.LENGTH_LONG).setAction("Action", null).show();
        });

        flip();
        rViewDemo();
    }


    protected void flip() {

        Button textViewDemo = findViewById(R.id.textViewDemo);

        //Intent intent = new Intent(MainActivity.this, EditViewdemo.class);

        textViewDemo.setOnClickListener(view -> {

            Intent intent = new Intent(this, EditViewdemo.class);
            Bundle bundle = new Bundle();
            bundle.putString("msg", "Hello from your creator!");
            intent.putExtras(bundle);

            startActivity(intent);
        });
    }


    protected void rViewDemo() {



        Button rViewButton = findViewById(R.id.rViewButton);

        //Intent intent = new Intent(MainActivity.this, EditViewdemo.class);

        rViewButton.setOnClickListener(view -> {

            Intent intent = new Intent(this, RView.class);
            startActivity(intent);
        });
    }

}