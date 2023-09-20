package br.fmu.testesoma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private EditText result ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        result = findViewById(R.id.result);

    }

    public void somar(View view) {
    int num1, num2, conta;
    num1 = Integer.parseInt(n1.getText().toString());
    num2 = Integer.parseInt(n2.getText().toString());

    conta = num1 + num2;

    result.setText(Integer.toString(conta));
    }
}