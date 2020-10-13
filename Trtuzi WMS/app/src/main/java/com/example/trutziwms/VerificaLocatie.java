package com.example.trutziwms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VerificaLocatie extends AppCompatActivity implements View.OnClickListener {

    private TextView titlu,afisor;
    private EditText codBareLocatie;
    private Button btnScan,btnVerificare,btnBackToMenu,btnBackToVerificare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifica_locatie);

        titlu=findViewById(R.id.txtVerificaLocatie);
        afisor= findViewById(R.id.afisareVrificaLocatie);

        codBareLocatie = findViewById(R.id.editScanText2);

        btnScan = findViewById(R.id.btnScan2);
        btnVerificare = findViewById(R.id.btnVerificaLocatieP);
        btnBackToMenu = findViewById(R.id.btnVerificaLocatieBackMenu);
        btnBackToVerificare = findViewById(R.id.btnVerificaLocatieBack);

        btnScan.setOnClickListener(this);
        btnBackToVerificare.setOnClickListener(this);
        btnBackToMenu.setOnClickListener(this);
        btnVerificare.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnScan2:
                break;
            case R.id.btnVerificaLocatieP:
                break;
            case R.id.btnVerificaLocatieBackMenu:
                backToMainMenu(view);
                break;
            case R.id.btnVerificaLocatieBack:
                break;
        }
    }

    public void backToMainMenu(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}