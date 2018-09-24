package br.ufrn.eaj.tads.exemplobancoroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;

@SuppressWarnings("ALL")
public class Cadastro extends AppCompatActivity {
    EditText editTextTitulo;
    EditText editTextAutor;
    EditText editTextAno;
    RatingBar ratingBarNota;
    AppDatabase db;
    LivroDao MeuLivro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = AppDatabase.getDatabase(this);
        MeuLivro = db.livroDao();


        Button buttonCadastrar = findViewById(R.id.buttonCadastra) ;
        Button buttonCancelar = findViewById(R.id.buttonCancela);
        editTextTitulo = findViewById(R.id.editTextTitulo);
        editTextAutor = findViewById(R.id.editTextAutor);
        editTextAno = findViewById(R.id.editTextAno);
        ratingBarNota = findViewById(R.id.ratingBarNota);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MeuLivro.inserir(new Livro(editTextTitulo.getText().toString(),editTextAutor.getText().toString(), editTextAno.getText().toString(),ratingBarNota.getRating()));
                setResult(RESULT_OK);
                finish();

            }
        });


        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });


    }

}
