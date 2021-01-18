package com.lucas7x.trabalho_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class QuartaActivity extends AppCompatActivity {
    TextView textViewNome, textViewEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);

        //pegar dados que vieram da terceira activity
        Bundle dados = getIntent().getExtras();
        String nome = dados.getString("nome");
        String estado = dados.getString("estado");

        textViewNome = findViewById(R.id.textViewNome);
        textViewEstado = findViewById(R.id.textViewEstado);

        textViewNome.setText("Nome:  " + nome);
        textViewEstado.setText("Estado:  " + estado);



    }
}