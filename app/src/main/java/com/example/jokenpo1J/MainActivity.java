package com.example.jokenpo1J;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void selecionadopedra(View view) {
        this.opcaoSelecionado("pedra");
    }

    public void selecionadopapel(View view) {
        this.opcaoSelecionado("papel");
    }

    public void selecionadotesoura(View view) {
        this.opcaoSelecionado("tesoura");
    }

    public void opcaoSelecionado(String opcaoSelecionada) {

        ImageView ImagenResultado = findViewById(R.id.ImagenResultado);
        TextView TextResultado = findViewById(R.id.TextResultado);

        int numero = new Random().nextInt(3);//0 1 2
        String[] opcao = {"pedra", "papel", "tesoura"};
        String opcaoapp = opcao[numero];

        switch (opcaoapp) {
            case "pedra":
                ImagenResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                ImagenResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                ImagenResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if ((opcaoapp == "tesoura" && opcaoSelecionada == "papel") ||
                (opcaoapp == "papel" && opcaoSelecionada == "pedra") ||
                (opcaoapp == "pedra" && opcaoSelecionada == "tesoura")

        ) {
            TextResultado.setText("Você foi derrotado");

        } else if (
                (opcaoSelecionada == "tesoura" && opcaoapp == "papel") ||
                        (opcaoSelecionada == "papel" && opcaoapp == "pedra") ||
                        (opcaoSelecionada == "pedra" && opcaoapp == "tesoura")

        ) {
            TextResultado.setText("Você Ganhou");

        } else {
            TextResultado.setText("Empatamos");

        }


    }


}