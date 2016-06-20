package com.lohyenjeong.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void createToast(View view) {
        // Do something in response to button click
        Button b = (Button)view;
        String buttonText = b.getText().toString().toLowerCase();
        Toast.makeText(MainActivity.this, "This is my project " + buttonText, Toast.LENGTH_SHORT).show();
    }
}



