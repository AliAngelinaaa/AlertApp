package com.example.alertapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class OpeningScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening_screen);
    }

    // Method to open the login popup
    public void openLoginPopup(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.popup_login, null);
        builder.setView(dialogView);

        // Set up your popup UI elements and logic here

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    // Method to handle successful authentication
    public void handleSuccessfulAuthentication() {
        Intent intent = new Intent(OpeningScreenActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
