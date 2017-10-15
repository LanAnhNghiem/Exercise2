package com.exercise2jishin;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class NewActivity extends AppCompatActivity {
    TextInputEditText firstName;
    TextInputEditText lastName;
    public static final String TAG = NewActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        firstName = (TextInputEditText) findViewById(R.id.txtFirstName);
        lastName = (TextInputEditText) findViewById(R.id.txtLastName);
        Intent intent = getIntent();
//        if(intent.hasExtra("firstName")){
//            String strFirstName = intent.getExtras().getString("firstName");
//            firstName.setText(strFirstName);
//            lastName.setText(intent.getExtras().getString("lastName"));
//        }else{
//            Log.e(TAG, "Invalid string extra");
//        }
        firstName.setText(intent.getExtras().getString(Intent.EXTRA_TEXT));
    }
}
