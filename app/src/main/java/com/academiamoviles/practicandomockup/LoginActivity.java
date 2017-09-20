package com.academiamoviles.practicandomockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.academiamoviles.practicandomockup.R;

public class LoginActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = (EditText) findViewById(R.id.et_email);
        etPassword = (EditText) findViewById(R.id.et_password);

        btnLogin = (Button) findViewById(R.id.btn_iniciar_sesion);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email, password;
                email = etEmail.getText().toString();
                password = etPassword.getText().toString();

                if ( email.equals("a@a.a") && password.equals("123") ) {

                    // enviar a otra actividad

                    Bundle datos = new Bundle();
                    datos.putString("email", email);

                    Intent iPerfil = new Intent(LoginActivity.this, PerfilActivity.class);
                    iPerfil.putExtras(datos);
                    startActivity(iPerfil);
                    finish();

                } else {

                    // mostrar error
                    Toast.makeText(LoginActivity.this, "ERROR DE USUARIO/PASSWORD", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}
