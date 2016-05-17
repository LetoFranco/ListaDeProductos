package com.example.francoleto.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText user;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void validateLogin(View view){
        user = (EditText) findViewById(R.id.et_user);
        password = (EditText) findViewById(R.id.et_password);
        if (user.getText().toString().compareTo("education")==0 && password.getText().toString().compareTo("password")==0){
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(MainActivity.this, "The password or user are incorrect", Toast.LENGTH_SHORT).show();
        }
    }
}
