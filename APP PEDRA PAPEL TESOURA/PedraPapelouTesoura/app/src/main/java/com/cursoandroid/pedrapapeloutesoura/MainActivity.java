package com.cursoandroid.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

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

    public void selecionadoPedra(View view)
    {
        this.opcaoSelecionada("PEDRA");
    }

    public void selecionadoPapel(View view)
    {
        this.opcaoSelecionada("PAPEL");
    }

    public void selecionadoTesoura(View view)
    {
        this.opcaoSelecionada("TESOURA");
    }

    public  void opcaoSelecionada(String opcaoSelecionada) {
        ImageView imagemResultado = findViewById(R.id.imagemResultado);
        ImageView imagemResultado2 = findViewById(R.id.imagemResultado2);
        TextView textoResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(3); //0,1,2
        String[] opcoes = {"PEDRA", "PAPEL", "TESOURA"};
        String opcaoApp = opcoes[numero];


        switch (opcaoApp) {
            case "PEDRA":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "PAPEL":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "TESOURA":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        switch (opcaoSelecionada) {
            case "PEDRA":
                imagemResultado2.setImageResource(R.drawable.pedra);
                break;
            case "PAPEL":
                imagemResultado2.setImageResource(R.drawable.papel);
                break;
            case "TESOURA":
                imagemResultado2.setImageResource(R.drawable.tesoura);
                break;
        }
        //app ganhador
        if
        (
                (opcaoApp == "TESOURA" && opcaoSelecionada =="PAPEL")||
                (opcaoApp == "PAPEL" && opcaoSelecionada =="PEDRA")||
                (opcaoApp == "PEDRA" && opcaoSelecionada =="TESOURA")

        )

        {
                textoResultado.setText("Voce PERDEUUUU :( ");
        }
        else if((opcaoApp == "PAPEL" && opcaoSelecionada =="TESOURA")||
                (opcaoApp == "PEDRA" && opcaoSelecionada =="PAPEL")||
                (opcaoApp == "TESOURA" && opcaoSelecionada =="PAPEL"))
        {
               textoResultado.setText("PARABÉNSSSS, VOCE GANHOU!! :D ");
        }
        else
        {
            textoResultado.setText("EMPATOU :| ");
        } //EMPATE


        System.out.println("Opcao Selecionada: " + opcaoSelecionada);


    }}
