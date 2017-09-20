package com.academiamoviles.practicandomockup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.academiamoviles.practicandomockup.R;

public class MenuActivity extends AppCompatActivity {

    Button btnIniciarSesion, btnRegistrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Log.i("CICLO DE VIDA", "onCreate");

        btnIniciarSesion = (Button) findViewById(R.id.btn_iniciar_sesion);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // abrir la otra actividad
                Log.i("CICLO DE VIDA", "abrir otra actividad");

                Intent iIniciarSesion = new Intent(MenuActivity.this, LoginActivity.class);
                startActivity(iIniciarSesion);
                finish();

            }
        };
        btnIniciarSesion.setOnClickListener(onClickListener);

        btnRegistrate = (Button) findViewById(R.id.btn_registrate);
        btnRegistrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // abrir la otra actividad
                Log.i("CICLO DE VIDA", "abrir otra actividad REGISTRO");


                Intent iRegistrate = new Intent(MenuActivity.this, RegistroActivity.class);
                startActivity(iRegistrate);
                finish();

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("CICLO DE VIDA", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("CICLO DE VIDA", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("CICLO DE VIDA", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("CICLO DE VIDA", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("CICLO DE VIDA", "onDestroy");
    }

}
