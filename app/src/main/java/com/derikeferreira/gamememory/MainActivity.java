package com.derikeferreira.gamememory;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String dadosApp = "ArquivosDados";
    private Button jogar;
    private ImageView imgSom;

    private String exibirSom = "sim";
    private TextView txtQtdPontos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jogar = findViewById(R.id.btnJogar);
        imgSom = findViewById(R.id.imgAudioMain);
        txtQtdPontos = findViewById(R.id.txtQtdPontos);

        jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(exibirSom.equals("sim")){

                    final MediaPlayer mediaPlayer = MediaPlayer.create(getApplication(), R.raw.level_completed);
                    mediaPlayer.start();

                }else {
                    //faz nada
                }

                Intent abreTela = new Intent(getApplication(), Jogo2x2MainActivity.class);
                startActivity(abreTela);

            }
        });

        imgSom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //SharedPreferences - para salvar os dados no celular do usuario
                //Cria um arquivo xml e dentro desse arquivo conseguimos salvar dados
                // mode 0 - significa que esse arquivo so vai ser lido por esse app
                SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

                if(arquivos.contains("som")){

                    //Recupero a informacao do som na memoria do celular
                    //se é para exibir ou nao
                    String resultado = arquivos.getString("som", "não");

                    //Desligo o som
                    if(resultado.equals("sim")){

                        SharedPreferences.Editor editor = arquivos.edit();
                        //Se nao existe a coluna som eu crio ela e coloco sim
                        editor.putString("som", "não");
                        //Salvo
                        editor.commit();
                        exibirSom = "não";
                        Toast.makeText(MainActivity.this, "Som desligado com sucesso!", Toast.LENGTH_LONG).show();

                    }else {

                        SharedPreferences.Editor editor = arquivos.edit();

                        //Se nao existe a coluna som eu crio ela e coloco sim
                        editor.putString("som", "sim");
                        //Salvo
                        editor.commit();
                        exibirSom = "sim";

                        Toast.makeText(MainActivity.this, "Som ligado com sucesso!", Toast.LENGTH_LONG).show();

                    }

                }else {

                    SharedPreferences.Editor editor = arquivos.edit();

                    //Se nao existe a coluna som eu crio ela e coloco sim
                    editor.putString("som", "sim");
                    //Salvo
                    editor.commit();
                    exibirSom = "sim";
                    Toast.makeText(MainActivity.this, "Som ligado com sucesso!", Toast.LENGTH_LONG).show();

                }

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        SharedPreferences arquivos = getSharedPreferences(dadosApp, 0);

        if(arquivos.contains("pontos")){

            //Recupero a quantidade de pontos que tem na memoria do celular
            int pontosRecuperados = arquivos.getInt("pontos", 0);
            txtQtdPontos.setText("Pontos: " + pontosRecuperados );

        }else {

            SharedPreferences.Editor editor = arquivos.edit();
            //Se nao existe a coluna pontos eu crio ela e coloco zero
            editor.putInt("pontos", 0);
            //Salvo a nova quantidade de pontos
            editor.commit();

        }

        if(arquivos.contains("som")){

            //Recupero a informacao do som na memoria do celular
            //se é para exibir ou nao
            String resultado = arquivos.getString("som", "não");
            exibirSom = resultado;

        }else {

            SharedPreferences.Editor editor = arquivos.edit();
            //Se nao existe a coluna som eu crio ela e coloco sim
            editor.putString("som", "sim");
            //Salvo
            editor.commit();
            exibirSom = "sim";

        }

    }

}