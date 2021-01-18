package com.lucas7x.trabalho_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SegundaActivity extends AppCompatActivity {

    ToggleButton toggleButton;
    RadioGroup radioGroupSexo;
    Button buttonTela3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //toggle button
        toggleButton = findViewById(R.id.toggleButton);
        adicionarListenerToggle();

        //radio button
        radioGroupSexo = findViewById(R.id.radioGroupSexo);
        adicionarListenerRadioGroup();

        buttonTela3 = findViewById(R.id.buttonTela3);
        buttonTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TerceiraActivity.class);

                String uNome    = "Lucas";//editNome.getText().toString();
                String uEmail   = "lc@gmail.com";//editEmail.getText().toString();
                Usuario u = new Usuario(uNome, uEmail);

                //passar dados
                intent.putExtra("nome", "Lucas");
                intent.putExtra("idade", 25);
                intent.putExtra("objeto", u);

                startActivity(intent);
            }
        });
    }

    public void adicionarListenerRadioGroup() {
        radioGroupSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(i == R.id.radioMasculino) {
                    Toast.makeText(getApplicationContext(), "Sexo masculino selecionado.", Toast.LENGTH_SHORT).show();
                    //textoResultado.setText(radioMasculino.getText().toString());
                } else {
                    Toast.makeText(getApplicationContext(), "Sexo feminino selecionado.", Toast.LENGTH_SHORT).show();
                    //textoResultado.setText(radioFeminino.getText().toString());
                }
            }
        });
    }

    public void adicionarListenerToggle() {

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if (b) {
                    toggleButton.setText("Toggle ligado");
                    Toast.makeText(getApplicationContext(), "Toggle ligado", Toast.LENGTH_SHORT).show();
                } else {
                    toggleButton.setText("Toggle desligado");
                    Toast.makeText(getApplicationContext(), "Toggle desligado", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}