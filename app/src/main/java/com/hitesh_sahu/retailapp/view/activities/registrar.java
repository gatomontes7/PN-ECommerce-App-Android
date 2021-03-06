/*
 * App Mov e-commerce 2022, desarrollo para el módulo Aplicaciones Moviles.
 */

package com.hitesh_sahu.retailapp.view.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.hitesh_sahu.retailapp.model.entities.Usuario;
import com.hitesh_sahu.retailapp.model.entities.daoUsuario;

import com.hitesh_sahu.retailapp.R;

public class registrar extends AppCompatActivity implements View.OnClickListener{

        EditText us, pass, nom, ap;
        Button reg, can;
        daoUsuario dao;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login);
            us=(EditText)findViewById(R.id.RegUser);
            pass=(EditText)findViewById(R.id.RegPass);
            nom=(EditText)findViewById(R.id.RegNombre);
            ap=(EditText)findViewById(R.id.RegApellidos);
            reg=(Button)findViewById(R.id.btnRegistrar);
            can=(Button)findViewById(R.id.btnRegCancelar);

            reg.setOnClickListener(this);
            can.setOnClickListener(this);
            dao = new daoUsuario(this);

        }


        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnRegistrar:
                    Usuario u = new Usuario();
                    u.setUsuario(us.getText().toString());
                    u.setPassword(pass.getText().toString());
                    u.setNombre(nom.getText().toString());
                    u.setApellidos(ap.getText().toString());
                    if (!u.isNull()){
                        Toast.makeText(this, "ERROR: campos vacios", Toast.LENGTH_LONG).show();
                    }else if(dao.insertUsuario(u)){
                        Toast.makeText(this, "Registro Exitoso!", Toast.LENGTH_LONG).show();
                        Intent i2 = new Intent(registrar.this, login_pri.class);
                        startActivity(i2);
                        finish();
                    }else{
                        Toast.makeText(this, "Usuario ya registrado", Toast.LENGTH_LONG).show();
                    }
                    break;
                case R.id.btnRegCancelar:
                        Intent i = new Intent(registrar.this, login_pri.class);
                        startActivity(i);
                        finish();
                    break;
            }
        }
}
