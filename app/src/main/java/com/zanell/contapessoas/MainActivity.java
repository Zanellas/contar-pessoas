package com.zanell.contapessoas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int numeroHomem = 0;
    int numeroMulher = 0;
    int numeroPessoas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView campoTexto = findViewById(R.id.textoPessoas);

        final Button botaoHomem = findViewById(R.id.botaoHomem);
        final Button botaoMulher = findViewById(R.id.botaoMulher);
        final Button botaoReset = findViewById(R.id.botaoReset);

        botaoHomem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numeroHomem++;
                numeroPessoas++;

                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoHomem.setText(Integer.toString(numeroHomem));


            }
        });

        botaoMulher.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numeroMulher++;
                numeroPessoas++;

                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoMulher.setText(Integer.toString(numeroMulher));


            }
        });

        botaoReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroHomem = 0;
                numeroMulher = 0;
                numeroPessoas = 0;

                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoHomem.setText(Integer.toString(numeroHomem));
                botaoMulher.setText(Integer.toString(numeroMulher));
            }
        });
    }

}