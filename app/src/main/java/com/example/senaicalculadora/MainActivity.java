package com.example.senaicalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculadora Senai");
        display = findViewById(R.id.display_tv);
    }

    public void onClickBtn1(View v) {
        atualizarDisplay("1");
    }

    public void onClickBtn2(View v) {
        atualizarDisplay("2");
    }

    public void onClickBtn3(View v) {
        atualizarDisplay("3");
    }

    public void onClickBtn4(View v) {
        atualizarDisplay("4");
    }

    public void onClickBtn5(View v) {
        atualizarDisplay("5");
    }

    public void onClickBtn6(View v) {
        atualizarDisplay("6");
    }

    public void onClickBtn7(View v) {
        atualizarDisplay("7");
    }

    public void onClickBtn8(View v) {
        atualizarDisplay("8");
    }

    public void onClickBtn9(View v) {
        atualizarDisplay("9");
    }

    public void onClickBtn0(View v) {
        atualizarDisplay("0");
    }

    public void onClickBtnSomar(View v) {
        atualizarDisplay("+");
    }

    public void onClickBtnSubtrair(View v) {
        atualizarDisplay("-");
    }

    private void atualizarDisplay(String texto) {
        String textoDisplay = display.getText().toString();
        textoDisplay = textoDisplay + texto;
        display.setText(textoDisplay);
    }


}