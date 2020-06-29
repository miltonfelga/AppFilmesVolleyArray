package com.demotxt.myapp.myapplication.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.demotxt.myapp.myapplication.activities.AnimeActivity;
import com.demotxt.myapp.myapplication.modelo.Anime;
import com.demotxt.myapp.myapplication.R ;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext ;
    private List<Anime> mData ;
    RequestOptions option;

    public RecyclerViewAdapter(Context mContext, List<Anime> mData) {
        this.mContext = mContext;
        this.mData = mData;

        option = new RequestOptions().centerCrop().placeholder(R.drawable.loading_shape).error(R.drawable.loading_shape);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.anime_row_item,parent,false) ;
        final MyViewHolder viewHolder = new MyViewHolder(view) ;
        viewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(mContext, AnimeActivity.class);
                i.putExtra("anime_nome",mData.get(viewHolder.getAdapterPosition()).getNome());
                i.putExtra("anime_descricao",mData.get(viewHolder.getAdapterPosition()).getDescricao());
                i.putExtra("anime_estudio",mData.get(viewHolder.getAdapterPosition()).getEstudio());
                i.putExtra("anime_categoria",mData.get(viewHolder.getAdapterPosition()).getCategoria());
                i.putExtra("anime_n_episodio",mData.get(viewHolder.getAdapterPosition()).getN_episodio());
                i.putExtra("anime_nota",mData.get(viewHolder.getAdapterPosition()).getNota());
                i.putExtra("anime_img",mData.get(viewHolder.getAdapterPosition()).getImagem_url());

                mContext.startActivity(i);
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tv_nome.setText(mData.get(position).getNome());
        holder.tv_nota.setText(mData.get(position).getNota());
        holder.tv_estudio.setText(mData.get(position).getEstudio());
        holder.tv_categoria.setText(mData.get(position).getCategoria());

        Glide.with(mContext).load(mData.get(position).getImagem_url()).apply(option).into(holder.img_thumbnail);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tv_nome;
        TextView tv_nota;
        TextView tv_estudio;
        TextView tv_categoria;
        ImageView img_thumbnail;
        LinearLayout view_container;

        public MyViewHolder(View itemView) {
            super(itemView);

            view_container = itemView.findViewById(R.id.container);
            tv_nome = itemView.findViewById(R.id.anime_nome);
            tv_categoria = itemView.findViewById(R.id.categoria);
            tv_nota = itemView.findViewById(R.id.nota);
            tv_estudio = itemView.findViewById(R.id.estudio);
            img_thumbnail = itemView.findViewById(R.id.thumbnail);

        }
    }

}
