package com.example.memory;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    /*int numhomem = 0;
    int nummulher = 0;
    int numPessoas = 0;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*final TextView textoPessoas = (TextView) findViewById(R.id.textoPessoas);
        final Button bHomem = (Button) findViewById(R.id.bhomem);
        final Button bMulher = (Button) findViewById(R.id.bmulher);
        final Button bReset = (Button) findViewById(R.id.breset);

        bHomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numhomem++;
                numPessoas++;
                String msg = Integer.toString(numPessoas);
                textoPessoas.setText("Total" + msg + " pessoas.");
                bHomem.setText(Integer.toString(numhomem));
            }
        });*/

        Button bcont = (Button) findViewById(R.id.bcont);
        bcont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main2);
            }
        });
        Button balfa = (Button) findViewById(R.id.balf);
        balfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_terceira_tela);
            }
        });
        }
}
