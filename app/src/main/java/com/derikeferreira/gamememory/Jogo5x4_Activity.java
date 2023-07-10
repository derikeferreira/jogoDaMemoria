package com.derikeferreira.gamememory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;

public class Jogo5x4_Activity extends AppCompatActivity {


    //static final - nunca vai mudar o valor
    private static final String dadosApp = "ArquivosDados";
    private TextView txtPontosAlcancados, txtTempo;
    private ImageView imagem_L1xC1, imagem_L1xC2, imagem_L1xC3, imagem_L1xC4;
    private ImageView imagem_L2xC1, imagem_L2xC2, imagem_L2xC3, imagem_L2xC4;
    private ImageView imagem_L3xC1, imagem_L3xC2, imagem_L3xC3, imagem_L3xC4;
    private ImageView imagem_L4xC1, imagem_L4xC2, imagem_L4xC3, imagem_L4xC4;
    private ImageView imagem_L5xC1, imagem_L5xC2, imagem_L5xC3, imagem_L5xC4;
    private Button btnParar;
    private Button btnRecomecar;
    private Timer tempo;
    private int contaTempo = 0;
    private int cliquesBomba = 0;
    private int abriuDuasImagens1 = 0,
            abriuDuasImagens2 = 0,
            abriuDuasImagens3 = 0,
            abriuDuasImagens4 = 0,
            abriuDuasImagens5 = 0,
            abriuDuasImagens6 = 0,
            abriuDuasImagens7 = 0,
            abriuDuasImagens8 = 0,
            abriuDuasImagens9 = 0,
            abriuDuasImagens10 = 0;


    private Integer[] arrayPosicoesImg = {101,102, 103, 104, 105, 106 ,107 ,108, 109, 110 , 201, 202, 203, 204, 205, 206,207 ,208, 209, 210};
    //numero das imagens
    private int imagemJogo1, imagemJogo2, imagemJogo3,imagemJogo4,
            imagemJogo5,imagemJogo6,imagemJogo7,imagemJogo8,
            imagemJogo9,imagemJogo10,imagemJogo11,imagemJogo12,
            imagemJogo13,imagemJogo14,imagemJogo15,imagemJogo16,
            imagemJogo17,imagemJogo18,imagemJogo19,imagemJogo20;
    private int imagemEscolha1, imagemEscolha2;
    private int cliqueImagem1, cliqueImagem2;
    private int imagemNumero = 1;
    private int pontos = 21;
    private String exibirSom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo5x4);

        configuracoesIniciais();

        imagem_L1xC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L1xC1, posicao);

            }
        });

        imagem_L1xC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L1xC2, posicao);

            }
        });

        imagem_L1xC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L1xC3, posicao);

            }
        });

        imagem_L1xC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L1xC4, posicao);

            }
        });

        imagem_L2xC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L2xC1, posicao);

            }
        });

        imagem_L2xC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L2xC2, posicao);

            }
        });


        imagem_L2xC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L2xC3, posicao);

            }
        });



        imagem_L2xC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L2xC4, posicao);

            }
        });

        imagem_L3xC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L3xC1, posicao);

            }
        });

        imagem_L3xC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L3xC2, posicao);

            }
        });


        imagem_L3xC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L3xC3, posicao);

            }
        });


        imagem_L3xC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L3xC4, posicao);

            }
        });

        imagem_L4xC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L4xC1, posicao);

            }
        });


        imagem_L4xC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L4xC2, posicao);

            }
        });

        imagem_L4xC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L4xC3, posicao);

            }
        });


        imagem_L4xC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L4xC4, posicao);

            }
        });


        imagem_L5xC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L5xC1, posicao);

            }
        });

        imagem_L5xC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L5xC2, posicao);

            }
        });

        imagem_L5xC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L5xC3, posicao);

            }
        });

        imagem_L5xC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Executa som ao clicar na imagem
                executarSom();

                // v - contém o número da Tag que foi passada
                //String - Cast que é uma conversão
                int posicao = Integer.parseInt((String)v.getTag());
                trocarImagem(imagem_L5xC4, posicao);

            }
        });


        btnParar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btnParar.getText().toString().equals("Continuar")){

                    if(contaTempo > 0){

                        if (tempo != null ){

                            btnParar.setText("Parar");
                            iniciarContagemTempo();

                            imagem_L1xC1.setEnabled(true);
                            imagem_L1xC2.setEnabled(true);
                            imagem_L1xC3.setEnabled(true);
                            imagem_L1xC4.setEnabled(true);

                            imagem_L2xC1.setEnabled(true);
                            imagem_L2xC2.setEnabled(true);
                            imagem_L2xC3.setEnabled(true);
                            imagem_L2xC4.setEnabled(true);

                            imagem_L3xC1.setEnabled(true);
                            imagem_L3xC2.setEnabled(true);
                            imagem_L3xC3.setEnabled(true);
                            imagem_L3xC4.setEnabled(true);

                            imagem_L4xC1.setEnabled(true);
                            imagem_L4xC2.setEnabled(true);
                            imagem_L4xC3.setEnabled(true);
                            imagem_L4xC4.setEnabled(true);

                            imagem_L5xC1.setEnabled(true);
                            imagem_L5xC2.setEnabled(true);
                            imagem_L5xC3.setEnabled(true);
                            imagem_L5xC4.setEnabled(true);

                        }

                    }

                }else {

                    if(contaTempo > 0){

                        if (tempo != null ){

                            tempo.cancel();
                            contaTempo = Integer.parseInt(txtTempo.getText().toString());
                            btnParar.setText("Continuar");

                            imagem_L1xC1.setEnabled(false);
                            imagem_L1xC2.setEnabled(false);
                            imagem_L1xC3.setEnabled(false);
                            imagem_L1xC4.setEnabled(false);

                            imagem_L2xC1.setEnabled(false);
                            imagem_L2xC2.setEnabled(false);
                            imagem_L2xC3.setEnabled(false);
                            imagem_L2xC4.setEnabled(false);

                            imagem_L3xC1.setEnabled(false);
                            imagem_L3xC2.setEnabled(false);
                            imagem_L3xC3.setEnabled(false);
                            imagem_L3xC4.setEnabled(false);

                            imagem_L4xC1.setEnabled(false);
                            imagem_L4xC2.setEnabled(false);
                            imagem_L4xC3.setEnabled(false);
                            imagem_L4xC4.setEnabled(false);

                            imagem_L5xC1.setEnabled(false);
                            imagem_L5xC2.setEnabled(false);
                            imagem_L5xC3.setEnabled(false);
                            imagem_L5xC4.setEnabled(false);

                        }

                    }

                }

            }
        });

        btnRecomecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Zera o contador
                contaTempo = 0;

                //cancelando o tempo
                tempo.cancel();

                //zerar a quantidade de tempo
                pontos = 0;

                txtPontosAlcancados.setText("Pontos: " + pontos);

                configuracoesIniciais();

            }
        });

    }

    private void executarSom(){

        if(exibirSom.equals("sim")){

            final MediaPlayer mediaPlayer = MediaPlayer.create(getApplication(), R.raw.som_click);
            mediaPlayer.start();

        }else {
            //faz nada
        }

    }

    private void gamerOver(){

        if(exibirSom.equals("sim")){

            final MediaPlayer mediaPlayer = MediaPlayer.create(getApplication(), R.raw.game_over);
            mediaPlayer.start();

        }else {
            //faz nada
        }

    }

    private void somTrocaTela(){

        if(exibirSom.equals("sim")){

            final MediaPlayer mediaPlayer = MediaPlayer.create(getApplication(), R.raw.level_completed);
            mediaPlayer.start();

        }else {
            //faz nada
        }

    }

    private void salvaPontos(){

        //SharedPreferences - para salvar os dados no celular do usuario
        //Cria um arquivo xml e dentro desse arquivo conseguimos salvar dados
        // mode 0 - significa que esse arquivo so vai ser lido por esse app
        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        if(arquivos.contains("pontos")){
            SharedPreferences.Editor editor = arquivos.edit();

            //Recupero a quantidade de pontos que tem na memoria do celular
            int qtdPontos = arquivos.getInt("pontos", 0);

            //Acrescento 1 na quantidade de pontos
            qtdPontos++;
            editor.putInt("pontos",qtdPontos);
            //Salvo a nova quantidade de pontos
            editor.commit();

        }

    }

    private void configuracoesIniciais(){

        //SharedPreferences - para salvar os dados no celular do usuario
        //Cria um arquivo xml e dentro desse arquivo conseguimos salvar dados
        // mode 0 - significa que esse arquivo so vai ser lido por esse app
        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        if(arquivos.contains("som")){

            //Recupero a informacao do som na memoria do celular
            //se é para exibir ou nao
            String resultado = arquivos.getString("som", "não");
            exibirSom = resultado;

        }else {

            exibirSom = "sim";
        }

        txtPontosAlcancados = findViewById(R.id.txtPontos);

        txtPontosAlcancados.setText("Pontos: " + pontos);

        txtTempo = findViewById(R.id.txtTempo);
        btnParar = findViewById(R.id.btnParar);
        btnRecomecar = findViewById(R.id.btnRecomecar);


        imagem_L1xC1 = findViewById(R.id.imgMatriz_5x4_L1xC1);
        imagem_L1xC2 = findViewById(R.id.imgMatriz_5x4_L1xC2);
        imagem_L1xC3 = findViewById(R.id.imgMatriz_5x4_L1xC3);
        imagem_L1xC4 = findViewById(R.id.imgMatriz_5x4_L1xC4);

        imagem_L2xC1 = findViewById(R.id.imgMatriz_5x4_L2xC1);
        imagem_L2xC2 = findViewById(R.id.imgMatriz_5x4_L2xC2);
        imagem_L2xC3 = findViewById(R.id.imgMatriz_5x4_L2xC3);
        imagem_L2xC4 = findViewById(R.id.imgMatriz_5x4_L2xC4);

        imagem_L3xC1 = findViewById(R.id.imgMatriz_5x4_L3xC1);
        imagem_L3xC2 = findViewById(R.id.imgMatriz_5x4_L3xC2);
        imagem_L3xC3 = findViewById(R.id.imgMatriz_5x4_L3xC3);
        imagem_L3xC4 = findViewById(R.id.imgMatriz_5x4_L3xC4);

        imagem_L4xC1 = findViewById(R.id.imgMatriz_5x4_L4xC1);
        imagem_L4xC2 = findViewById(R.id.imgMatriz_5x4_L4xC2);
        imagem_L4xC3 = findViewById(R.id.imgMatriz_5x4_L4xC3);
        imagem_L4xC4 = findViewById(R.id.imgMatriz_5x4_L4xC4);

        imagem_L5xC1 = findViewById(R.id.imgMatriz_5x4_L5xC1);
        imagem_L5xC2 = findViewById(R.id.imgMatriz_5x4_L5xC2);
        imagem_L5xC3 = findViewById(R.id.imgMatriz_5x4_L5xC3);
        imagem_L5xC4 = findViewById(R.id.imgMatriz_5x4_L5xC4);


        //Comeca a contar o tempo com 30 segundos
        contaTempo = 120;

        iniciarContagemTempo();

        //Define a ordem de cada imagem
        imagem_L1xC1.setTag("0");
        imagem_L1xC2.setTag("1");
        imagem_L1xC3.setTag("2");
        imagem_L1xC4.setTag("3");

        imagem_L2xC1.setTag("4");
        imagem_L2xC2.setTag("5");
        imagem_L2xC3.setTag("6");
        imagem_L2xC4.setTag("7");

        imagem_L3xC1.setTag("8");
        imagem_L3xC2.setTag("9");
        imagem_L3xC3.setTag("10");
        imagem_L3xC4.setTag("11");

        imagem_L4xC1.setTag("12");
        imagem_L4xC2.setTag("13");
        imagem_L4xC3.setTag("14");
        imagem_L4xC4.setTag("15");

        imagem_L5xC1.setTag("16");
        imagem_L5xC2.setTag("17");
        imagem_L5xC3.setTag("18");
        imagem_L5xC4.setTag("19");


        imagensParaOJogo();
        //shuffle - Embaralha as imagens
        Collections.shuffle(Arrays.asList(arrayPosicoesImg));

        //Deixa as imagens visiveis
        imagem_L1xC1.setVisibility(View.VISIBLE);
        imagem_L1xC2.setVisibility(View.VISIBLE);
        imagem_L1xC3.setVisibility(View.VISIBLE);
        imagem_L1xC4.setVisibility(View.VISIBLE);

        imagem_L2xC1.setVisibility(View.VISIBLE);
        imagem_L2xC2.setVisibility(View.VISIBLE);
        imagem_L2xC3.setVisibility(View.VISIBLE);
        imagem_L2xC4.setVisibility(View.VISIBLE);

        imagem_L3xC1.setVisibility(View.VISIBLE);
        imagem_L3xC2.setVisibility(View.VISIBLE);
        imagem_L3xC3.setVisibility(View.VISIBLE);
        imagem_L3xC4.setVisibility(View.VISIBLE);

        imagem_L4xC1.setVisibility(View.VISIBLE);
        imagem_L4xC2.setVisibility(View.VISIBLE);
        imagem_L4xC3.setVisibility(View.VISIBLE);
        imagem_L4xC4.setVisibility(View.VISIBLE);

        imagem_L5xC1.setVisibility(View.VISIBLE);
        imagem_L5xC2.setVisibility(View.VISIBLE);
        imagem_L5xC3.setVisibility(View.VISIBLE);
        imagem_L5xC4.setVisibility(View.VISIBLE);

        //Muda todas as imagens para o padrao
        imagem_L1xC1.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L1xC2.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L1xC3.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L1xC4.setImageResource(R.drawable.ic_close_preto_24);

        imagem_L2xC1.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L2xC2.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L2xC3.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L2xC4.setImageResource(R.drawable.ic_close_preto_24);

        imagem_L3xC1.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L3xC2.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L3xC3.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L3xC4.setImageResource(R.drawable.ic_close_preto_24);

        imagem_L4xC1.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L4xC2.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L4xC3.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L4xC4.setImageResource(R.drawable.ic_close_preto_24);

        imagem_L5xC1.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L5xC2.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L5xC3.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L5xC4.setImageResource(R.drawable.ic_close_preto_24);


    }

    private void imagensParaOJogo(){
        //numero das imagens
        imagemJogo1 = R.drawable.animal17;
        imagemJogo2 = R.drawable.bomba;
        imagemJogo3 = R.drawable.animal19;
        imagemJogo4 = R.drawable.animal20;
        imagemJogo5 = R.drawable.animal21;
        imagemJogo6 = R.drawable.animal22;
        imagemJogo7 = R.drawable.animal23;
        imagemJogo8 = R.drawable.animal24;
        imagemJogo9 = R.drawable.animal10;
        imagemJogo10 = R.drawable.animal11;

        imagemJogo11 = R.drawable.animal17;
        imagemJogo12 = R.drawable.bomba;
        imagemJogo13 = R.drawable.animal19;
        imagemJogo14 = R.drawable.animal20;
        imagemJogo15 = R.drawable.animal21;
        imagemJogo16 = R.drawable.animal22;
        imagemJogo17 = R.drawable.animal23;
        imagemJogo18 = R.drawable.animal24;
        imagemJogo19 = R.drawable.animal10;
        imagemJogo20 = R.drawable.animal11;

    }

    private void trocarImagem(ImageView imagem, int posicao){

        if(arrayPosicoesImg[posicao] == 101){

            imagem.setImageResource(imagemJogo1);

            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens1++;

        }else  if(arrayPosicoesImg[posicao] == 102){

            imagem.setImageResource(imagemJogo2);

            //COmo é uma bomba eu acrescento mais um cliques
            cliquesBomba++;

            if(cliquesBomba == 2){

                Toast.makeText(this, "Fim de jogo!", Toast.LENGTH_LONG).show();
                Intent abreTelaBomba = new Intent(getApplication(), Bomba_Activity.class);
                startActivity(abreTelaBomba);
                finish();

            }

        }else  if(arrayPosicoesImg[posicao] == 103){

            imagem.setImageResource(imagemJogo3);

            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens3++;

        }else  if(arrayPosicoesImg[posicao] == 104){

            imagem.setImageResource(imagemJogo4);

            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens4++;
        }else  if(arrayPosicoesImg[posicao] == 105){

            imagem.setImageResource(imagemJogo5);

            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens5++;

        }else  if(arrayPosicoesImg[posicao] == 106){

            imagem.setImageResource(imagemJogo6);

            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens6++;


        }else  if(arrayPosicoesImg[posicao] == 107){

            imagem.setImageResource(imagemJogo7);

            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens7++;


        }else  if(arrayPosicoesImg[posicao] == 108){

            imagem.setImageResource(imagemJogo8);

            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens8++;


        }else  if(arrayPosicoesImg[posicao] == 109){

            imagem.setImageResource(imagemJogo9);

            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens9++;


        }else  if(arrayPosicoesImg[posicao] == 110){

            imagem.setImageResource(imagemJogo10);

            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens10++;


        }else  if(arrayPosicoesImg[posicao] == 201){

            imagem.setImageResource(imagemJogo11);


            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens1++;

        }else  if(arrayPosicoesImg[posicao] == 202){

            imagem.setImageResource(imagemJogo12);


            //COmo é uma bomba eu acrescento mais um cliques
            cliquesBomba++;

            if(cliquesBomba == 2){

                Toast.makeText(this, "Fim de jogo!", Toast.LENGTH_LONG).show();
                Intent abreTelaBomba = new Intent(getApplication(), Bomba_Activity.class);
                startActivity(abreTelaBomba);
                finish();

            }

        }else  if(arrayPosicoesImg[posicao] == 203){

            imagem.setImageResource(imagemJogo13);


            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens3++;

        }else  if(arrayPosicoesImg[posicao] == 204){

            imagem.setImageResource(imagemJogo14);


            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens4++;

        }else  if(arrayPosicoesImg[posicao] == 205){

            imagem.setImageResource(imagemJogo15);


            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens5++;

        }else  if(arrayPosicoesImg[posicao] == 206){

            imagem.setImageResource(imagemJogo16);


            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens6++;

        }else  if(arrayPosicoesImg[posicao] == 207){

            imagem.setImageResource(imagemJogo17);


            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens7++;

        }else  if(arrayPosicoesImg[posicao] == 208){

            imagem.setImageResource(imagemJogo18);


            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens8++;

        }else  if(arrayPosicoesImg[posicao] == 209){

            imagem.setImageResource(imagemJogo19);


            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens9++;

        }else  if(arrayPosicoesImg[posicao] == 210){

            imagem.setImageResource(imagemJogo20);


            //COmo nao é uma bomba eu zero a quantidade de cliques
            cliquesBomba = 0;

            //Atribuiu um clique na imagem
            abriuDuasImagens10++;

        }


        // se clicarmos na primeira imagem
        if(imagemNumero == 1){


            //Pega o número da posição do array das imagens
            imagemEscolha1 = arrayPosicoesImg[posicao];


            //Verifica se o número do array que foi passado para a imagem é amior de 200
            if(imagemEscolha1 > 200){

                //Deixa o número com o mesmo número da imagem 1
                imagemEscolha1 = imagemEscolha1 - 100;
            }

            //troca o número da imagem para dois, por que a imagem já foi aberta
            imagemNumero = 2;

            //Adiciona o número / posicao da imagem que foi clicada
            cliqueImagem1 = posicao;

            //Desabilita a imagem para não ser clicada duas vezes
            imagem.setEnabled(false);

        }else if(imagemNumero == 2){  // se clicarmos na segunda imagem


            //Pega o número da posição do array das imagens
            imagemEscolha2 = arrayPosicoesImg[posicao];


            //Verifica se o número do array que foi passado para a imagem é amior de 200
            if(imagemEscolha2 > 200){

                //Deixa o número com o mesmo número da imagem 1
                imagemEscolha2 = imagemEscolha2 - 100;
            }

            //troca o número da imagem para dois, por que a imagem já foi aberta
            imagemNumero = 1;

            //Adiciona o número / posicao da imagem que foi clicada
            cliqueImagem2 = posicao;

            //Desabilita a imagem para não ser clicada duas vezes
            imagem_L1xC1.setEnabled(false);
            imagem_L1xC2.setEnabled(false);
            imagem_L1xC3.setEnabled(false);
            imagem_L1xC4.setEnabled(false);

            imagem_L2xC1.setEnabled(false);
            imagem_L2xC2.setEnabled(false);
            imagem_L2xC3.setEnabled(false);
            imagem_L2xC4.setEnabled(false);

            imagem_L3xC1.setEnabled(false);
            imagem_L3xC2.setEnabled(false);
            imagem_L3xC3.setEnabled(false);
            imagem_L3xC4.setEnabled(false);

            imagem_L4xC1.setEnabled(false);
            imagem_L4xC2.setEnabled(false);
            imagem_L4xC3.setEnabled(false);
            imagem_L4xC4.setEnabled(false);

            imagem_L5xC1.setEnabled(false);
            imagem_L5xC2.setEnabled(false);
            imagem_L5xC3.setEnabled(false);
            imagem_L5xC4.setEnabled(false);

            //Depois que clicar nas duas imagens, trava o clique por um segundo
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {

                    //Verifica se as duas imagens são iguais
                    verificaImagensIguais();


                }
            }, 1000); // 1000 é 1 segundo
        }

    }

    private void verificaImagensIguais(){

        if(imagemEscolha1 == imagemEscolha2){

            if(cliqueImagem1 == 0){
                imagem_L1xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 1){
                imagem_L1xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 2){
                imagem_L1xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 3){
                imagem_L1xC4.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 4){
                imagem_L2xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 5){
                imagem_L2xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 6){
                imagem_L2xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 7){
                imagem_L2xC4.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 8){
                imagem_L3xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 9){
                imagem_L3xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 10){
                imagem_L3xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 11){
                imagem_L3xC4.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 12){
                imagem_L4xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 13){
                imagem_L4xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 14){
                imagem_L4xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 15){
                imagem_L4xC4.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 16){
                imagem_L5xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 17){
                imagem_L5xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 18){
                imagem_L5xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 19){
                imagem_L5xC4.setVisibility(View.INVISIBLE);
            }

            if(cliqueImagem2 == 0){
                imagem_L1xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 1){
                imagem_L1xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 2){
                imagem_L1xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 3){
                imagem_L1xC4.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 4){
                imagem_L2xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 5){
                imagem_L2xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 6){
                imagem_L2xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 7){
                imagem_L2xC4.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 8){
                imagem_L3xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 9){
                imagem_L3xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 10){
                imagem_L3xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 11){
                imagem_L3xC4.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 12){
                imagem_L4xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 13){
                imagem_L4xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 14){
                imagem_L4xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 15){
                imagem_L4xC4.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 16){
                imagem_L5xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 17){
                imagem_L5xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 18){
                imagem_L5xC3.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 19){
                imagem_L5xC4.setVisibility(View.INVISIBLE);
            }

            pontos++;

            txtPontosAlcancados.setText("Pontos: " + pontos);
            salvaPontos();

        }else {

            zeraCliques();

            //Se as duas imagens nao forem iguais eu coloco icone do X
            imagem_L1xC1.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L1xC2.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L1xC3.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L1xC4.setImageResource(R.drawable.ic_close_preto_24);

            imagem_L2xC1.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L2xC2.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L2xC3.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L2xC4.setImageResource(R.drawable.ic_close_preto_24);

            imagem_L3xC1.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L3xC2.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L3xC3.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L3xC4.setImageResource(R.drawable.ic_close_preto_24);

            imagem_L4xC1.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L4xC2.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L4xC3.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L4xC4.setImageResource(R.drawable.ic_close_preto_24);

            imagem_L5xC1.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L5xC2.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L5xC3.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L5xC4.setImageResource(R.drawable.ic_close_preto_24);

        }


        //Habilita a imagem para não ser clicada duas vezes
        imagem_L1xC1.setEnabled(true);
        imagem_L1xC2.setEnabled(true);
        imagem_L1xC3.setEnabled(true);
        imagem_L1xC4.setEnabled(true);

        imagem_L2xC1.setEnabled(true);
        imagem_L2xC2.setEnabled(true);
        imagem_L2xC3.setEnabled(true);
        imagem_L2xC4.setEnabled(true);

        imagem_L3xC1.setEnabled(true);
        imagem_L3xC2.setEnabled(true);
        imagem_L3xC3.setEnabled(true);
        imagem_L3xC4.setEnabled(true);

        imagem_L4xC1.setEnabled(true);
        imagem_L4xC2.setEnabled(true);
        imagem_L4xC3.setEnabled(true);
        imagem_L4xC4.setEnabled(true);

        imagem_L5xC1.setEnabled(true);
        imagem_L5xC2.setEnabled(true);
        imagem_L5xC3.setEnabled(true);
        imagem_L5xC4.setEnabled(true);

        //Verifica se o jogo terminou
        verificaSeTerminouJogo();


    }

    private void zeraCliques(){

        if (abriuDuasImagens1 == 2){

        }else {
            abriuDuasImagens1 = 0;
        }

        if (abriuDuasImagens2 == 2){

        }else {
            abriuDuasImagens2 = 0;
        }

        if (abriuDuasImagens3 == 2){

        }else {
            abriuDuasImagens3 = 0;
        }

        if (abriuDuasImagens4 == 2){

        }else {
            abriuDuasImagens4 = 0;
        }

        if (abriuDuasImagens5 == 2){

        }else {
            abriuDuasImagens5 = 0;
        }

        if (abriuDuasImagens6 == 2){

        }else {
            abriuDuasImagens6 = 0;
        }

        if (abriuDuasImagens7 == 2){

        }else {
            abriuDuasImagens7 = 0;
        }

        if (abriuDuasImagens8 == 2){

        }else {
            abriuDuasImagens8 = 0;
        }

        if (abriuDuasImagens9 == 2){

        }else {
            abriuDuasImagens9 = 0;
        }

        if (abriuDuasImagens10 == 2){

        }else {
            abriuDuasImagens10 = 0;
        }

        cliquesBomba = 0;

    }

    private void verificaSeTerminouJogo() {



        if(abriuDuasImagens1 == 2 &&
                abriuDuasImagens3 == 2 &&abriuDuasImagens4 == 2 &&
                abriuDuasImagens5 == 2 && abriuDuasImagens6 == 2 &&
                abriuDuasImagens7 == 2 && abriuDuasImagens8 == 2 &&
                abriuDuasImagens9 == 2 && abriuDuasImagens10 == 2){

            //Zerar o contator de tempo
            contaTempo = 0;

            //Cancela a contagem de tempo
            tempo.cancel();

            //Se ganhar iniciando a segunda tela 3x2
            Intent trocaTela = new Intent(getApplication(), Jogo5x4_Activity.class);
            startActivity(trocaTela);

            //Verifica se o som esta ligado para executar o som de nivel completado
            somTrocaTela();

            //Encerra a tela dessa fase
            finish();

        }

    }

    public void iniciarContagemTempo() {

        tempo = new Timer();
        tempo.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        if(contaTempo > 0) {
                            contaTempo--;  // subtraindo tempo
                            txtTempo.setText(String.valueOf(contaTempo));
                        }else {

                            tempo.cancel(); // Para r a subtração
                            //Som do fim de jogo
                            gamerOver();

                            Toast.makeText(getApplication(), "Seu tempo acabou!", Toast.LENGTH_LONG).show();
                            finish();

                        }

                    }
                });
            }
        }, 1000, 1000);

    }

    @Override
    protected void onStop() {
        super.onStop();
        tempo.cancel();
    }
}