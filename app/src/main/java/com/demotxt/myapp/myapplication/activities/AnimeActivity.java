package com.demotxt.myapp.myapplication.activities;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.demotxt.myapp.myapplication.R ;

public class AnimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anime);

        getSupportActionBar().hide();

        String nome  = getIntent().getExtras().getString("anime_nome");
        String descricao = getIntent().getExtras().getString("anime_descricao");
        String estudio = getIntent().getExtras().getString("anime_estudio") ;
        String categoria = getIntent().getExtras().getString("anime_categoria");
        int n_episodio = getIntent().getExtras().getInt("anime_n_episodio") ;
        String nota = getIntent().getExtras().getString("anime_nota") ;
        String imagem_url = getIntent().getExtras().getString("anime_img") ;

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar_id);
        collapsingToolbarLayout.setTitleEnabled(true);

        TextView tv_nome = findViewById(R.id.aa_anime_nome);
        TextView tv_estudio = findViewById(R.id.aa_estudio);
        TextView tv_categoria = findViewById(R.id.aa_categoria) ;
        TextView tv_descricao = findViewById(R.id.aa_descricao);
        TextView tv_nota  = findViewById(R.id.aa_nota) ;
        ImageView img = findViewById(R.id.aa_thumbnail);

        tv_nome.setText(nome);
        tv_categoria.setText(categoria);
        tv_descricao.setText(descricao);
        tv_nota.setText(nota);
        tv_estudio.setText(estudio);

        collapsingToolbarLayout.setTitle(nome);

        RequestOptions requestOptions = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);

        Glide.with(this).load(imagem_url).apply(requestOptions).into(img);





    }
}
