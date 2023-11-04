package com.example.alertapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.alertapp.ManageContacts;
import com.example.alertapp.MessageChange;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up the click listeners for the buttons.
        Button changeMessageButton = findViewById(R.id.change_message_button);
        changeMessageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MessageChange.class); // Replace CurrentActivity with your current activity and ChangeMessageActivity with the desired activity
                startActivity(intent);
            }
        });

        findViewById(R.id.manage_contacts_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Open the manage contacts activity.
                startActivity(new Intent(MainActivity.this, ManageContacts.class));
            }
        });

        findViewById(R.id.log_out_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Log out the user and return to the login screen.
                finish();
            }
        });
    }
}
