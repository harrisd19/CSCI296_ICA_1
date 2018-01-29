package com.example.devon.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.*;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greet(View view) {

        //get the resource reference for the EditText view
        EditText txfName = (EditText) findViewById(R.id.txfName);
        //get the input text from the EditText view object
        String name = txfName.getText().toString();
        //get reference to the TextView view
        TextView txfGreet = (TextView) findViewById(R.id.txtfGreet);
        //update the TextView text
        txfName.setText(name);

    }
}
