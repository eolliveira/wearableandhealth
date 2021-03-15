package br.com.erickoliveira.wearablesandhealth.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.erickoliveira.wearablesandhealth.R;
import br.com.erickoliveira.wearablesandhealth.database.dao.RoomUsuarioDAO;
import br.com.erickoliveira.wearablesandhealth.database.wearableandhealthDatabase;
import br.com.erickoliveira.wearablesandhealth.model.Usuario;

public class FormularioUsuarioActivity extends AppCompatActivity {

    private EditText campoNome;
    private EditText campoCpfCnpj;

    private Usuario usuario;
    private RoomUsuarioDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_usuario);

        setTitle("Novo Usuario");

        dao = Room.databaseBuilder(this, wearableandhealthDatabase.class, "wearableandhealth.db")
                .allowMainThreadQueries()
                .build()
                .getRoomUsuarioDAO();

        Button botaoSalvar = findViewById(R.id.activity_formulario_usuario_botao_salvar);
        botaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nome = campoNome.getText().toString();
                String cpfCnpj = campoCpfCnpj.getText().toString();

                usuario = new Usuario(nome, cpfCnpj);
                dao.salva(usuario);
            }
        });
    }
}