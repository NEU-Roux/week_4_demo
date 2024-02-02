package edu.northeastern.demoweek4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;
import android.util.Log;


import com.google.android.material.snackbar.Snackbar;

public class EditViewdemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_viewdemo);

        Bundle bundle = getIntent().getExtras();
        String msg = bundle.getString("msg");


        CharSequence cs;

        Log.d("INIT", msg);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

       // Button textViewDemo = findViewById(R.id.textViewDemo);
        EditText te = findViewById(R.id.textView);
        CharSequence usertext =te.getText();
        outState.putCharSequence("savedText", usertext);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        EditText te = findViewById(R.id.textView);
        CharSequence userText=savedInstanceState.getCharSequence("savedText");
        te.setText(userText);

    }
}