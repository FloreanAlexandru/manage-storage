package com.example.trutziwms;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView welcomeTxt, messageTxt;
    private Button btnLocalizare, btnScade, btnVerificaPalet, btnVerificareLocatie,
                    btnMutaLocatie, btnAdaugarePeLocatie, btnSetari, btnIesire;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcomeTxt =(TextView) findViewById(R.id.btnWelcome);
        messageTxt =(TextView) findViewById(R.id.btnMessage);

        btnLocalizare =(Button) findViewById(R.id.btnLocalizare);
        btnScade =(Button) findViewById(R.id.btnScade);
        btnVerificaPalet =(Button) findViewById(R.id.btnVerificarePalet);
        btnVerificareLocatie =(Button) findViewById(R.id.btnVerificareLocatie);
        btnMutaLocatie =(Button) findViewById(R.id.brnMutaLocatie);
        btnAdaugarePeLocatie =(Button) findViewById(R.id.btnAdaugarePalet);
        btnSetari =(Button) findViewById(R.id.btnSetari);
        btnIesire =(Button) findViewById(R.id.btnIesire);

        btnIesire.setOnClickListener(this);
        btnLocalizare.setOnClickListener(this);
        btnSetari.setOnClickListener(this);
        btnAdaugarePeLocatie.setOnClickListener(this);
        btnVerificareLocatie.setOnClickListener(this);
        btnMutaLocatie.setOnClickListener(this);
        btnScade.setOnClickListener(this);
        btnVerificaPalet.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnIesire:
                exitClick();
                break;
            case R.id.btnLocalizare:
                Toast.makeText(this, "Optiunea selectata este: Localizare reper", Toast.LENGTH_SHORT).show();
                deschidereLocalizare();
                break;
            case R.id.btnAdaugarePalet:
                Toast.makeText(this, "Optiunea selectata este: Adaugare palet pe locatie ", Toast.LENGTH_SHORT).show();
                deschidereAdaugarePalet();
                break;
            case R.id.btnScade:
                Toast.makeText(this, "Optiunea selectata este: Scade cantitate de pe palet", Toast.LENGTH_SHORT).show();
                deschidereScadeCantPalet();
                break;
            case R.id.btnVerificarePalet:
                Toast.makeText(this, "Optiunea selectata este: Verifica palet", Toast.LENGTH_SHORT).show();
                deschidereVerificaPalet();
                break;
            case R.id.btnVerificareLocatie:
                Toast.makeText(this, "Optiunea selectata este: Verifica locatie", Toast.LENGTH_SHORT).show();
                deschidereVerificaLocatie();
                break;
            case R.id.brnMutaLocatie:
                Toast.makeText(this, "Optiunea selectata este: Muta locatie palet", Toast.LENGTH_SHORT).show();
                deschidereMutaLocatiePalet();
                break;
            case R.id.btnSetari:
                Toast.makeText(this, "Optiunea selectata este: Localizare Setari", Toast.LENGTH_SHORT).show();
                deschidereSetari();
                break;
            default:
                break;
        }
    }

    public void exitClick(){

        AlertDialog.Builder message = new AlertDialog.Builder(this);
        message.setMessage("Esti sigur ca vrei sa iesi ?").setCancelable(false)

                .setNegativeButton("Da", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                }).

                setPositiveButton("Nu", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

        AlertDialog alertDialog = message.create();
        message.setTitle("ATENTIE !");
        message.setIcon(R.drawable.warning_logo);
        message.show();

    }

    public void deschidereLocalizare(){
        finish();
        Intent intent = new Intent(this,Localizare.class);
        startActivity(intent);
    }

    public void deschidereAdaugarePalet(){
        finish();
        Intent intent = new Intent(this,AdaugarePalet.class);
        startActivity(intent);
    }

    public void deschidereScadeCantPalet(){
        finish();
        Intent intent = new Intent(this,ScadePalet.class);
        startActivity(intent);
    }

    public void deschidereVerificaPalet(){
        finish();
        Intent intent = new Intent(this,VerificaPalet.class);
        startActivity(intent);
    }

    public void deschidereVerificaLocatie(){
        finish();
        Intent intent = new Intent(this,VerificaLocatie.class);
        startActivity(intent);
    }

    public void deschidereMutaLocatiePalet(){
        finish();
        Intent intent = new Intent(this,MutaLocatiePalet.class);
        startActivity(intent);
    }

    public void deschidereSetari(){
        finish();
        Intent intent = new Intent(this,Setari.class);
        startActivity(intent);
    }
}