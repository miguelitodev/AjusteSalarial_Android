package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular(View v){
        RadioButton opcao1 = findViewById(R.id.radioButton1);
        RadioButton opcao2 = findViewById(R.id.radioButton2);
        RadioButton opcao3 = findViewById(R.id.radioButton3);
        EditText salario =  findViewById(R.id.salario);
        TextView resultado = findViewById(R.id.resultinho);
        double novo_salario = Double.parseDouble(salario.getText().toString());



        if(opcao1.isChecked())
            novo_salario += novo_salario * .4;
        if(opcao2.isChecked())
            novo_salario += novo_salario * .45;
        if(opcao3.isChecked())
            novo_salario += novo_salario * .50;

        resultado.setText(String.valueOf(novo_salario));

    }
}
