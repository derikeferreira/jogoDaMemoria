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

public class Jogo2x2MainActivity extends AppCompatActivity {

    //static final - nunca vai mudar o valor
    private static final String dadosApp = "ArquivosDados";
    private TextView txtPontosAlcancados, txtTempo;
    private ImageView imagem_L1xC1, imagem_L1xC2;
    private ImageView imagem_L2xC1, imagem_L2xC2;
    private Button btnParar;
    private Button btnRecomecar;

    private Timer tempo;
    private int contaTempo = 0;
    private Integer[] arrayPosicoesImg = {101,102, 201, 202};
    //numero das imagens
    private int imagemJogo1, imagemJogo2, imagemJogo3,imagemJogo4;
    private int imagemEscolha1, imagemEscolha2;
    private int cliqueImagem1, cliqueImagem2;
    private int imagemNumero = 1;
    private int pontos = 0;

    private String exibirSom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_jogo2x2_main);

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
                            imagem_L2xC1.setEnabled(true);
                            imagem_L2xC2.setEnabled(true);

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
                            imagem_L2xC1.setEnabled(false);
                            imagem_L2xC2.setEnabled(false);

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
        txtTempo = findViewById(R.id.txtTempo);
        btnParar = findViewById(R.id.btnParar);
        btnRecomecar = findViewById(R.id.btnRecomecar);
        imagem_L1xC1 = findViewById(R.id.imgMatriz_2x2_L1xC1);
        imagem_L1xC2 = findViewById(R.id.imgMatriz_2x2_L1xC2);
        imagem_L2xC1 = findViewById(R.id.imgMatriz_2x2_L2xC1);
        imagem_L2xC2 = findViewById(R.id.imgMatriz_2x2_L2xC2);

        //Comeca a contar o tempo com 30 segundos
        contaTempo = 30;

        iniciarContagemTempo();

        //Define a ordem de cada imagem
        imagem_L1xC1.setTag("0");
        imagem_L1xC2.setTag("1");
        imagem_L2xC1.setTag("2");
        imagem_L2xC2.setTag("3");


        imagensParaOJogo();
        //shuffle - Embaralha as imagens
        Collections.shuffle(Arrays.asList(arrayPosicoesImg));

        //Deixa as imagens visiveis
        imagem_L1xC1.setVisibility(View.VISIBLE);
        imagem_L1xC2.setVisibility(View.VISIBLE);
        imagem_L2xC1.setVisibility(View.VISIBLE);
        imagem_L2xC2.setVisibility(View.VISIBLE);

        //Muda todas as imagens para o padrao
        imagem_L1xC1.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L1xC2.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L2xC1.setImageResource(R.drawable.ic_close_preto_24);
        imagem_L2xC2.setImageResource(R.drawable.ic_close_preto_24);


    }

    private void imagensParaOJogo(){
        //numero das imagens
        imagemJogo1 = R.drawable.animal1;
        imagemJogo2 = R.drawable.animal2;
        imagemJogo3 = R.drawable.animal1;
        imagemJogo4 = R.drawable.animal2;
    }

    private void trocarImagem(ImageView imagem, int posicao){

        if(arrayPosicoesImg[posicao] == 101){

            imagem.setImageResource(imagemJogo1);

        }else  if(arrayPosicoesImg[posicao] == 102){

            imagem.setImageResource(imagemJogo2);

        }else  if(arrayPosicoesImg[posicao] == 201){

            imagem.setImageResource(imagemJogo3);

        }else  if(arrayPosicoesImg[posicao] == 202){

            imagem.setImageResource(imagemJogo4);

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
            imagem_L2xC1.setEnabled(false);
            imagem_L2xC2.setEnabled(false);


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
                imagem_L2xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem1 == 3){
                imagem_L2xC2.setVisibility(View.INVISIBLE);
            }

            if(cliqueImagem2 == 0){
                imagem_L1xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 1){
                imagem_L1xC2.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 2){
                imagem_L2xC1.setVisibility(View.INVISIBLE);
            }else if(cliqueImagem2 == 3){
                imagem_L2xC2.setVisibility(View.INVISIBLE);
            }

            pontos++;

            txtPontosAlcancados.setText("Pontos: " + pontos);
            salvaPontos();

        }else {

            //Se as duas imagens nao forem iguais eu coloco icone do X
            imagem_L1xC1.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L1xC2.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L2xC1.setImageResource(R.drawable.ic_close_preto_24);
            imagem_L2xC2.setImageResource(R.drawable.ic_close_preto_24);


        }


        //Habilita a imagem para não ser clicada duas vezes
        imagem_L1xC1.setEnabled(true);
        imagem_L1xC2.setEnabled(true);
        imagem_L2xC1.setEnabled(true);
        imagem_L2xC2.setEnabled(true);

        //Verifica se o jogo terminou
        verificaSeTerminouJogo();


    }

    private void verificaSeTerminouJogo() {


        if(imagem_L1xC1.getVisibility() == View.INVISIBLE &&
                imagem_L1xC2.getVisibility() == View.INVISIBLE &&
                imagem_L2xC1.getVisibility() == View.INVISIBLE &&
                imagem_L2xC2.getVisibility() == View.INVISIBLE){

            //Zerar o contator de tempo
            contaTempo = 0;

            //Cancela a contagem de tempo
            tempo.cancel();

            //Se ganhar iniciando a segunda tela 3x2
            Intent trocaTela = new Intent(getApplication(), Jogo3x2_Activity.class);
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

                            Toast.makeText(Jogo2x2MainActivity.this, "Seu tempo acabou!", Toast.LENGTH_LONG).show();
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