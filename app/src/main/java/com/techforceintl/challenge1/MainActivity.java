package com.techforceintl.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onButtonClick (View view) {
        TextView textView = findViewById(R.id.firstName);
        textView = findViewById(R.id.lastName);
        textView = findViewById(R.id.email);

        EditText  firstname = findViewById(R.id.editTextfirstName2);
        EditText  lastName = findViewById(R.id.editTextlastName);
        EditText  email = findViewById(R.id.editTextemail);

        textView.setText("First Name: " + firstname.getText().toString());
        textView.setText("Last Name: " + lastName.getText().toString());
        textView.setText("Email: " + email.getText().toString());
    }
}
