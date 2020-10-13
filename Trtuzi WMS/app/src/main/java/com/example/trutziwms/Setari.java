package com.example.trutziwms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Setari extends AppCompatActivity implements View.OnClickListener{

    private TextView titlu;
    private EditText user, pass;
    private Button logIn, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setari);

        titlu = findViewById(R.id.txtLogare);

        user = findViewById(R.id.editTextUsername);
        pass = findViewById(R.id.editTextTextPassword);

        logIn = findViewById(R.id.btnLogIn);
        back = findViewById(R.id.btnBackLogIn);

        logIn.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnLogIn){

        }else{
            backToMainMenu();
        }
    }

    public void backToMainMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}