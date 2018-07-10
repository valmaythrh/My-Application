package com.example.d0n1p.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private EditText UserName;
    private EditText Password;
    private Button Login;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserName = (EditText)findViewById(R.id.etUserName);
        Password = (EditText)findViewById(R.id.etPassword);
        Login = (Button)findViewById(R.id.button);
    }
}
