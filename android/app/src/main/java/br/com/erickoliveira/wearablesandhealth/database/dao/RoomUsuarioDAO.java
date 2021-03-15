package br.com.erickoliveira.wearablesandhealth.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;

import br.com.erickoliveira.wearablesandhealth.model.Usuario;

@Dao
public interface RoomUsuarioDAO {

    @Insert
    void salva(Usuario usuario);
}
