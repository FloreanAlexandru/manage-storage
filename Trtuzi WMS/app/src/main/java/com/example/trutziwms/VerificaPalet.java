package com.example.trutziwms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VerificaPalet extends AppCompatActivity implements View.OnClickListener{

    private TextView titlu,afisor;
    private EditText codBarePalet;
    private Button backToMenu,backToVerifica,btnScan,btnVerifica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifica_palet);

        titlu = findViewById(R.id.txtVerificaPalet);
        afisor = findViewById(R.id.afisareVrifica);

        codBarePalet = findViewById(R.id.editScanText1);

        btnScan = findViewById(R.id.btnScan1);
        backToMenu = findViewById(R.id.btnVerificaPaletBack);
        backToVerifica = findViewById(R.id.btnVerificaPaletBack);
        backToMenu = findViewById(R.id.btnVerificaPaletBackMenu);

        btnScan.setOnClickListener(this);
        backToMenu.setOnClickListener(this);
        backToVerifica.setOnClickListener(this);
        backToMenu.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnVerificaPalet:
                break;
            case R.id.btnScan1:
                break;
            case R.id.btnVerificaPaletBack:
                break;
            case R.id.btnVerificaPaletBackMenu:
                backToMenu(view);
                Toast.makeText(this,"Inapoi la meniul principal",Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void backToMenu(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}