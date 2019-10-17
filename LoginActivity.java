package com.example.carltonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login (View view) {
        EditText username = (EditText) findViewById(R.id.username_text);
        EditText password = (EditText) findViewById(R.id.password_text);
        String username_string = username.getText().toString();
        String password_string = password.getText().toString();
        if(username_string.equals("admin") && password_string.equals("admin")) {
            Intent login_to_watch = new Intent(this, WatchFootballActivity.class);
            login_to_watch.putExtra(MainActivity.EXTRA_USERNAME, username_string);
            startActivity(login_to_watch);
        }
        else {
            Snackbar invalid_credentials = Snackbar.make(findViewById(R.id.my_constraint_layout),
                    R.string.invalid_credentials_message,
                    Snackbar.LENGTH_LONG);
            invalid_credentials.show();
        }
    }

    public void register (View view) {
        Snackbar successful_register = Snackbar.make(findViewById(R.id.my_constraint_layout), R.string.successful_register_message,
                Snackbar.LENGTH_LONG);
        successful_register.show();
        EditText username = (EditText) findViewById(R.id.username_text);
        String username_string = username.getText().toString();
        Intent register_to_watch = new Intent(this, WatchFootballActivity.class);
        register_to_watch.putExtra(MainActivity.EXTRA_USERNAME, username_string);
        startActivity(register_to_watch);
    }
}
