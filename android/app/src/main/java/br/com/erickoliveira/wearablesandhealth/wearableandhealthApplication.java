package br.com.erickoliveira.wearablesandhealth;

import android.app.Application;

import androidx.room.Room;

import br.com.erickoliveira.wearablesandhealth.database.dao.RoomUsuarioDAO;
import br.com.erickoliveira.wearablesandhealth.database.wearableandhealthDatabase;
import br.com.erickoliveira.wearablesandhealth.model.Usuario;

public class wearableandhealthApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        criaUsuariosTeste();
    }

    private void criaUsuariosTeste() {
        wearableandhealthDatabase database = Room.databaseBuilder(this, wearableandhealthDatabase.class, "wearableandhealth.db")
                .allowMainThreadQueries()
                .build();
        RoomUsuarioDAO dao = database.getRoomUsuarioDAO();
        dao.salva(new Usuario("Erick", "06906838989"));
        dao.salva(new Usuario("Julia", "06906838989"));
        dao.salva(new Usuario("Pedro", "06906838989"));
    }


}
