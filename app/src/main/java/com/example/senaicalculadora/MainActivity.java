package com.example.senaicalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView display;
    String primeiroNumero = "";
    String segundoNumero = "";
    String operacao = "";
    Boolean resultadoClicado = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculadora Senai");
        display = findViewById(R.id.display_tv);
    }

    public void onClickBtn1(View v) {
        atualizarNumeroDigitado("1");
        atualizarDisplay("1");
    }

    public void onClickBtn2(View v) {
        atualizarNumeroDigitado("2");
        atualizarDisplay("2");
    }

    public void onClickBtn3(View v) {
        atualizarNumeroDigitado("3");
        atualizarDisplay("3");
    }

    public void onClickBtn4(View v) {
        atualizarNumeroDigitado("4");
        atualizarDisplay("4");
    }

    public void onClickBtn5(View v) {
        atualizarNumeroDigitado("5");
        atualizarDisplay("5");
    }

    public void onClickBtn6(View v) {
        atualizarNumeroDigitado("6");
        atualizarDisplay("6");
    }

    public void onClickBtn7(View v) {
        atualizarNumeroDigitado("7");
        atualizarDisplay("7");
    }

    public void onClickBtn8(View v) {
        atualizarNumeroDigitado("8");
        atualizarDisplay("8");
    }

    public void onClickBtn9(View v) {
        atualizarNumeroDigitado("9");
        atualizarDisplay("9");
    }

    public void onClickBtn0(View v) {
        atualizarNumeroDigitado("0");
        atualizarDisplay("0");
    }

    public void onClickBtnSomar(View v) {
        if (primeiroNumero.isEmpty()) {
            Toast.makeText(MainActivity.this, "Digite algum número primeiro", Toast.LENGTH_LONG).show();
        } else if (operacao.isEmpty()) {
            operacao = "+";
            atualizarDisplay("+");
        } else {
            Toast.makeText(MainActivity.this, "Operação já foi selecionada", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickBtnSubtrair(View v) {
        if (primeiroNumero.isEmpty()) {
            Toast.makeText(MainActivity.this, "Digite algum número primeiro", Toast.LENGTH_LONG).show();
        } else if (operacao.isEmpty()) {
            operacao = "-";
            atualizarDisplay("-");
        } else {
            Toast.makeText(MainActivity.this, "Operação já foi selecionada", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickBtnMultiplicar(View v) {
        if (primeiroNumero.isEmpty()) {
            Toast.makeText(MainActivity.this, "Digite algum número primeiro", Toast.LENGTH_LONG).show();
        } else if (operacao.isEmpty()) {
            operacao = "*";
            atualizarDisplay("*");
        } else {
            Toast.makeText(MainActivity.this, "Operação já foi selecionada", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickBtnDividir(View v) {
        if (primeiroNumero.isEmpty()) {
            Toast.makeText(MainActivity.this, "Digite algum número primeiro", Toast.LENGTH_LONG).show();
        } else if (operacao.isEmpty()) {
            operacao = "/";
            atualizarDisplay("/");
        } else {
            Toast.makeText(MainActivity.this, "Operação já foi selecionada", Toast.LENGTH_LONG).show();
        }
    }

    public void onClickBtnResultado(View v) {
        int numero1 = Integer.parseInt(primeiroNumero);
        int numero2 = Integer.parseInt(segundoNumero);
        int resultado;

        if (operacao == "/" && numero2 == 0) {
            Toast.makeText(MainActivity.this, "Não é possivel realizar divisão por zero", Toast.LENGTH_LONG).show();
        } else if (!operacao.isEmpty() && !primeiroNumero.isEmpty() && !segundoNumero.isEmpty()){
            resultadoClicado = true;
            switch (operacao) {
                case "+":
                    resultado = numero1 + numero2;
                    display.setText(String.valueOf(resultado));
                    break;
                case "-":
                    resultado = numero1 - numero2;
                    display.setText(String.valueOf(resultado));
                    break;
                case "/":
                    resultado = numero1 / numero2;
                    display.setText(String.valueOf(resultado));
                    break;
                case "*":
                    resultado = numero1 * numero2;
                    display.setText(String.valueOf(resultado));
                    break;
            }
        }



    }

    public void onClickBtnLimpar(View v) {
        display.setText("");
        primeiroNumero = "";
        segundoNumero = "";
        operacao = "";
    }

    private void limparValores() {
        display.setText("");
        primeiroNumero = "";
        segundoNumero = "";
        operacao = "";
    }

    private void atualizarDisplay(String texto) {
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }

    private void atualizarNumeroDigitado(String numero) {
        if (resultadoClicado) {
            limparValores();
            resultadoClicado = false;
        }
        
        if (operacao.isEmpty()) {
            primeiroNumero = primeiroNumero + numero;
        } else {
            segundoNumero = segundoNumero + numero;
        }
    }
}