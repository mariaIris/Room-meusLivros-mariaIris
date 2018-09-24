package br.ufrn.eaj.tads.exemplobancoroom;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.nio.charset.CoderResult;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    AppDatabase db;
    LivroDao MeuLivro;
    int salve = 30;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button buttonCadastra = findViewById(R.id.buttonCadastra) ;
        final Button buttonLista = findViewById(R.id.buttonCancela);

        buttonCadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),buttonCadastra.getClass());
                startActivityForResult(intent, salve);

            }
        });

        buttonLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),buttonLista.getClass());
                startActivity(intent);
            }
        });




    }


        /*
        Thread execute = new Thread(new Runnable() {
            @Override
            public void run() {
                myCarroDao.inserir(new Carro("nome", "tipo", "desc", 2018));
                Log.i("TESTE", Arrays.toString(myCarroDao.listAll()));
            }
        });

        execute.start();
        */

    }

