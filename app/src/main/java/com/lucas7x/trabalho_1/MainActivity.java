package com.lucas7x.trabalho_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String[] nomes = {"João", "Maria", "Lucas", "Marta", "Fabio", "Karina", "Carlos", "Sabrina",
            "Sabrina", "Sebastião", "Rosa"};;

    private ListView listNomes;
    private Button buttonTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNomes = findViewById(R.id.listNomes);
        buttonTela2 = findViewById(R.id.buttonTela2);

        buttonTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
                startActivity(intent);
            }
        });

        //criar adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,        //layout
                android.R.id.text1,
                nomes
        );

        //adiciona adaptador para lista
        listNomes.setAdapter(adaptador);

        //adiciona evento de clique nos itens da lista
        listNomes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorSelecionado = listNomes.getItemAtPosition(i).toString();
                Toast.makeText(
                        getApplicationContext(),
                        valorSelecionado,
                        Toast.LENGTH_LONG
                ).show();
            }
        });
    }


}












