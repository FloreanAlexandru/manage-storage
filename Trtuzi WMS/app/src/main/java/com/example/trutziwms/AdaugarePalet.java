package com.example.trutziwms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AdaugarePalet extends AppCompatActivity implements View.OnClickListener{

    private TextView titlu, afisor;
    private EditText CodBareLocatie, CodNomenclator,Cantitate;
    private Button btnAdaugare, btnBackMenu, btnBack, btnScan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adaugare_palet);

        titlu = findViewById(R.id.txtAdaugarePalet);
        afisor = findViewById(R.id.txtAdaugarePaletAfisare);

        CodBareLocatie = findViewById(R.id.editTextCodBareLocatie);
        CodNomenclator = findViewById(R.id.editTextCodNomenclator);
        Cantitate = findViewById(R.id.editTextCantitate);

        btnAdaugare = findViewById(R.id.btnAdaugarePalet);
        btnScan = findViewById(R.id.btnScan3);
        btnBack = findViewById(R.id.btnBackAdaugare);
        btnBackMenu = findViewById(R.id.btnAdaugareBackMenu);

        btnBack.setOnClickListener(this);
        btnScan.setOnClickListener(this);
        btnAdaugare.setOnClickListener(this);
        btnBackMenu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnScan3:
                break;
            case R.id.btnAdaugarePalet:
                break;
            case R.id.btnAdaugareBackMenu:
                Toast.makeText(this,"Inapoi la meniul principal", Toast.LENGTH_SHORT).show();
                backToMainMenu();
                break;
            case R.id.btnBackAdaugare:
                break;
        }
    }

    public void backToMainMenu(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}