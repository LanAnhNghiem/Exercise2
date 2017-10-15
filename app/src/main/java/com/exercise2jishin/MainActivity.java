package com.exercise2jishin;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnUpload;
    TextInputEditText firstName;
    TextInputEditText lastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName = (TextInputEditText) findViewById(R.id.txtFirstName);
        lastName = (TextInputEditText) findViewById(R.id.txtLastName);
        btnUpload = (Button) findViewById(R.id.btnUpload);
        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, NewActivity.class);
//                intent.putExtra("firstName", firstName.getText().toString());
//                intent.putExtra("lastName", lastName.getText().toString());
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Hi, hentai !!!!");
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent, "Chọn app để gửi tin nhắn"));
            }
        });
    }
}
