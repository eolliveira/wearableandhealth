package br.com.erickoliveira.wearablesandhealth.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import br.com.erickoliveira.wearablesandhealth.database.dao.RoomUsuarioDAO;
import br.com.erickoliveira.wearablesandhealth.model.Usuario;

@Database(entities = {Usuario.class}, version = 1, exportSchema = false)
public abstract class wearableandhealthDatabase extends RoomDatabase {
    public abstract RoomUsuarioDAO getRoomUsuarioDAO();
}
