package com.example.memory;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends Activity {

    int numeroHomem = 0;
    int numeroMulher = 0;
    int numeroPessoas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView campoTexto = (TextView) findViewById(R.id.textoPessoas);
        final Button botaoHomem = (Button) findViewById(R.id.bHomem);
        final Button botaoMulher = (Button) findViewById(R.id.bMulher);
        final Button botaoReset = (Button) findViewById(R.id.bReset);

        botaoHomem.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroHomem++;
                numeroPessoas++;
                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoHomem.setText(Integer.toString(numeroHomem));
            }
        });
        botaoMulher.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                numeroMulher++;
                numeroPessoas++;
                String mensagem = Integer.toString(numeroPessoas);
                campoTexto.setText("Total: " + mensagem + " pessoas");
                botaoMulher.setText(Integer.toString(numeroMulher));
            }
        });
        botaoReset.setOnClickListener(new View.OnClickListener() {
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