package com.example.practicando_parcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public EditText etContrasenha, etUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        etContrasenha = findViewById(R.id.txtContrasenha);
        etUsuario = findViewById(R.id.txtUsuario);
    }

    public void ingresar(View view){
        Intent i = new Intent(this, formulario.class);
        i.putExtra("usuario", etUsuario.getText().toString());  // envio de datos
        i.putExtra("contrasenha", etContrasenha.getText().toString());  // envio de datos

        startActivity(i);
        finish();
    }

}