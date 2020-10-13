package com.example.trutziwms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MutaLocatiePalet extends AppCompatActivity implements View.OnClickListener {

    private TextView titlu, afisor;
    private EditText editTxtCodPalet,editTxtCodLocV, editTxtCodLocN;
    private Button btnScanCodP, btnScanLocV, btnScanLocN, btnMuta,btnBackMenu,btnBackMuta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muta_locatie_palet);

        titlu = findViewById(R.id.txtMutaLocatie);
        afisor = findViewById(R.id.txtMutaLocatieAfisor);

        editTxtCodPalet = findViewById(R.id.editTxtCodBarePalet);
        editTxtCodLocV = findViewById(R.id.editTxtCodLocatieVeche);
        editTxtCodLocN = findViewById(R.id.editTxtCodLocatieNoua);

        btnScanCodP = findViewById(R.id.btnScanCodPalet);
        btnScanLocV = findViewById(R.id.btnCodLocatieVeche);
        btnScanLocN = findViewById(R.id.btnCodLocatieNoua);
        btnMuta = findViewById(R.id.btnMutaPalet);
        btnBackMenu = findViewById(R.id.btnMutaBackToMenu);
        btnBackMuta = findViewById(R.id.btnBackMutaPalet);

        btnScanCodP.setOnClickListener(this);
        btnScanLocV.setOnClickListener(this);
        btnScanLocN.setOnClickListener(this);
        btnMuta.setOnClickListener(this);
        btnBackMenu.setOnClickListener(this);
        btnBackMuta.setOnClickListener(this)

        ;}

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnScanCodPalet:
                break;
            case R.id.btnCodLocatieVeche:
                break;
            case R.id.btnCodLocatieNoua:
                break;
            case R.id.btnMutaPalet:
                break;
            case R.id.btnMutaBackToMenu:
                Toast.makeText(this,"Inapoi la meniul principal", Toast.LENGTH_SHORT).show();
                backToMainMenu();
                break;
            case R.id.btnBackMutaPalet:
                break;
        }
    }

    public void backToMainMenu(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}