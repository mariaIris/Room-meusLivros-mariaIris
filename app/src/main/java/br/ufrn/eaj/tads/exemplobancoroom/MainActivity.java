package br.ufrn.eaj.tads.exemplobancoroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    AppDatabase db;
    CarroDao myCarroDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = AppDatabase.getDatabase(this);
        myCarroDao = db.carroDao();

        myCarroDao.inserir(new Carro("nome", "tipo", "desc", 2018));
        Log.i("TESTE", Arrays.toString(myCarroDao.listAll()));

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
}
