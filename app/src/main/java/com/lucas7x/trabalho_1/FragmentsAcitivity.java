package com.lucas7x.trabalho_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

//import com.lucas7x.activity.fragment.ContatosFragment;
//import com.lucas7x.activity.fragment.ConversasFragment;

public class FragmentsAcitivity extends AppCompatActivity {
    /*
    private Button buttonContatos, buttonConversas;
    private ConversasFragment conversasFragment;
    private ContatosFragment contatosFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);

        //remover sombra da action bar
        getSupportActionBar().setElevation(0);

        conversasFragment   = new ConversasFragment();
        contatosFragment    = new ContatosFragment();

        buttonContatos  = findViewById(R.id.buttonContatos);
        buttonConversas = findViewById(R.id.buttonConversas);

        //configurar o objeto para o fragmento
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, contatosFragment);
        transaction.commit();

        buttonContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contatosFragment = new ContatosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, contatosFragment);
                transaction.commit();
            }
        });

        buttonConversas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                conversasFragment = new ConversasFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.frameConteudo, conversasFragment);
                transaction.commit();
            }
        });

    }

     */
}


















