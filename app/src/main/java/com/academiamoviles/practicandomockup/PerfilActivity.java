package com.academiamoviles.practicandomockup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    TextView tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        tvEmail = (TextView) findViewById(R.id.tv_email);

        Bundle datosRecibidos = getIntent().getExtras();
        String email = datosRecibidos.getString("email");

        tvEmail.setText(email);

    }
}
