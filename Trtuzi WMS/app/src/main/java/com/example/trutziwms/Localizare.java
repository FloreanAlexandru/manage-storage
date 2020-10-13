package com.example.trutziwms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import okio.ByteString;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Localizare extends AppCompatActivity implements View.OnClickListener {

    private ArrayList<String> itemeL;

    private TextView titlu,afisare;
    private Button btnCautare, btnInapoi,btnInapoiL;
    private AutoCompleteTextView editTextCod;
    private String afisor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizare);

        itemeL = new ArrayList<String>();
        itemeL.add("40052");
        itemeL.add("400123");
        itemeL.add("40144");
        itemeL.add("4101223");
        itemeL.add("4201231");
        itemeL.add("4001232");
        itemeL.add("410123");
        itemeL.add("4001234");
        itemeL.add("4201");
        itemeL.add("4001236");

        editTextCod = findViewById(R.id.editTextCod1);
        ArrayAdapter<String> adapterAutoCompl = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,itemeL);
        editTextCod.setAdapter(adapterAutoCompl);

        titlu = findViewById(R.id.txtLocalizare);
        afisare = findViewById(R.id.afisareInf);
        btnCautare = findViewById(R.id.btnCautare);
        btnInapoi = findViewById(R.id.btnBack1);
        btnInapoiL = findViewById(R.id.backLocalizare);

        btnInapoi.setOnClickListener(this);
        btnCautare.setOnClickListener(this);
        btnInapoiL.setOnClickListener(this);

        closeKeyboard();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCautare:

                if(editTextCod.length()==0){
                    editTextCod.setError("Introduceti un cod");
                }else if(editTextCod.length()<=3){
                    editTextCod.setError("Introduceti un cod de minim 4 cifre");
                }else {
                        String cod_text1 = editTextCod.getText().toString();
                        String id = cod_text1;
                    if(itemeL.contains(id)) {
                        jsonParse(id);
                        btnInapoi.setVisibility(View.GONE);
                        btnCautare.setVisibility(View.GONE);
                        editTextCod.setVisibility(View.GONE);
                        titlu.setVisibility(View.GONE);
                        afisare.setVisibility(View.VISIBLE);
                        btnInapoiL.setVisibility(View.VISIBLE);
                    }else{
                        editTextCod.setError("Acest cod nu exista");
                    }
                }
                break;
            case R.id.btnBack1:
                goBacktoMainMenu(view);
                Toast.makeText(this, "Inapoi la meniul principal", Toast.LENGTH_SHORT).show();
                break;
            case R.id.backLocalizare:
                btnInapoi.setVisibility(View.VISIBLE);
                btnCautare.setVisibility(View.VISIBLE);
                editTextCod.setVisibility(View.VISIBLE);
                titlu.setVisibility(View.VISIBLE);
                afisare.setVisibility(View.GONE);
                afisare.setText("");
                btnInapoiL.setVisibility(View.GONE);
                Toast.makeText(this,"Inapoi",Toast.LENGTH_SHORT).show();
        }
    }

    public void goBacktoMainMenu(View view){

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void jsonParse(String Id) {

        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://192.168.20.22/")
                .addConverterFactory(GsonConverterFactory.create()).build();
        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Item>> call = null;
            switch (Id){
                case "40052":
                    call = jsonPlaceHolderApi.I40052();
                    Toast.makeText(this, "Cautare informatii 40052", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    Toast.makeText(this,"Nu exista informatii referitoare la "+Id,Toast.LENGTH_SHORT).show();
            }

            call.enqueue(new Callback<List<Item>>() {
                @Override
                public void onResponse(Call<List<Item>> call, Response<List<Item>> response) {

                    if (!response.isSuccessful()) {
                        afisare.setText("Code: " + response.code());
                        return;
                    }

                    List<Item> items = response.body();
                    String content="";
                    for (Item item : items) {
                        content += "Cod Gestiune:" + item.getCodGest() + "\n";
                        content += "Denumire Gestiune: " + item.getDenGest() + "\n";
                        content += "Stoc: " + item.getStoc() + "\n\n";
                        afisare.setText(content);
                    }
                }

                @Override
                public void onFailure(Call<List<Item>> call, Throwable t) {
                    afisare.setText(t.getMessage());
                }
            });
        }

        public void closeKeyboard(){
            View view = this.getCurrentFocus();
            if(view != null){
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(view.getWindowToken(),0);
            }
        }
}