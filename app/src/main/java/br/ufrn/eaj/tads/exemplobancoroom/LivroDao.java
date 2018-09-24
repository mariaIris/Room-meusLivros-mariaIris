package br.ufrn.eaj.tads.exemplobancoroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

@Dao
public interface LivroDao {
    @Insert
    long inserir(Livro livro);

    @Delete
    int deletar(Livro livro);

    @Update
    int atualizar(Livro livro);

    @Query("SELECT * FROM tabela_livro")
    Livro[] listAll();

    @Query("SELECT * FROM TABELA_LIVRO WHERE id = :id")
    Livro[] listById(long id);
}
