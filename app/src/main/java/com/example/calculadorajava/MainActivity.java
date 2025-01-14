package com.example.calculadorajava;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextNumber1 = findViewById(R.id.editTextNumber1);
        EditText editTextNumber2 = findViewById(R.id.editTextNumber2);
        Button buttonAdd = findViewById(R.id.buttonAdd);
        TextView textViewResult = findViewById(R.id.textViewResult);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = editTextNumber1.getText().toString();
                String num2 = editTextNumber2.getText().toString();

                if (!num1.isEmpty() && !num2.isEmpty()) {
                    try {
                        double result = Double.parseDouble(num1) + Double.parseDouble(num2);
                        textViewResult.setText("Resultado: " + result);
                    } catch (NumberFormatException e){
                            textViewResult.setText("Por favor, ingrese numeros operables");
                    }
                } else {
                    textViewResult.setText("Por favor, ingresa ambos números.");
                }
            }
        });
    }
}

