package com.example.concatenarnomes;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void concatenar(View view) {

        TextView nome1 = (TextView) findViewById(R.id.txtNome1);

        TextView nome2 = (TextView) findViewById(R.id.txtNome2);

        TextView resultado = (TextView) findViewById(R.id.txtResult);

        resultado.setText("");

        if(nome1.getText().toString().equals("") || nome2.getText().equals("")
        )
        {
            AlertDialog.Builder a = new AlertDialog.Builder(this);

            a.setTitle("Erro de concatenação");

            a.setMessage("Nome não inserido");

            a.create().show();

            resultado.setText("Resultado");
        }else
            resultado.setText("Olá "+nome1.getText()+" "+nome2.getText());
    }
}