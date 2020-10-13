package com.example.trutziwms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ScadePalet extends AppCompatActivity implements View.OnClickListener {

    TextView txtScadere, txtAfisareScadere;
    Button btnbackMenu, btnbackScadere, btnScan, btnScadere;
    EditText editTextScan,editTextScadere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scade_palet);

        txtScadere = findViewById(R.id.txtScadePalet);
        txtAfisareScadere = findViewById(R.id.afisareScadere);

        btnbackMenu = findViewById(R.id.btnScadeBackMenu);
        btnbackScadere = findViewById(R.id.btnScadeBack);
        btnScan = findViewById(R.id.btnScan);
        btnScadere = findViewById(R.id.btnScade);

        editTextScan = findViewById(R.id.editScanText);
        editTextScadere = findViewById(R.id.editScadeText);

        btnScadere.setOnClickListener(this);
        btnScan.setOnClickListener(this);
        btnbackMenu.setOnClickListener(this);
        btnbackScadere.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnScadeBackMenu:
                backToMainMenu(view);
                Toast.makeText(this,"Inapoi la meniul principal",Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnScadeBack:
                break;
            case R.id.btnScan:
                break;
            case R.id.btnScade:
                break;
        }
    }

    public void backToMainMenu(View view){
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
            finish();
        }
}