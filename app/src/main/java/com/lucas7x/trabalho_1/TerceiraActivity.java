package com.lucas7x.trabalho_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class TerceiraActivity extends AppCompatActivity {

    Button buttonEnviar;
    AutoCompleteTextView textEstado;
    EditText textNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        //autocomplete dos estados
        String str[]={"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal",
                "Espirito Santo", "Goiás", "Maranhão", "Mato Grosso do Sul", "Mato Grosso", "Minas Gerais",
                "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte",
                "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};

        textEstado = (AutoCompleteTextView) findViewById(R.id.autoCompleteEstado);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,str);
        textEstado.setThreshold(1);
        textEstado.setAdapter(adp);


        //campo de texto do nome
        textNome = findViewById(R.id.textNome);


        //butão de enviar
        buttonEnviar = findViewById(R.id.buttonEnviar);

        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), QuartaActivity.class);

                String nome     = textNome.getText().toString();
                String estado   = textEstado.getText().toString();
                //Usuario u = new Usuario(uNome, uEmail);

                //passar dados
                intent.putExtra("nome", nome);
                intent.putExtra("estado", estado);
                //intent.putExtra("objeto", u);

                startActivity(intent);
            }
        });
    }
}









