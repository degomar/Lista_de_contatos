package com.androidexpress.exerciciodeaplicacaorecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListaContatoAdapter extends RecyclerView.Adapter<ListaContatoAdapter.listaContatoViewHolder> {
    private int img_perfil;
    private int color_on;
    private String nome;
    private String ultima_msg;

    public ListaContatoAdapter(List<itemGeSet> listaContatos) {
        this.listaContatos = listaContatos;
    }

    public List<itemGeSet> listaContatos;



    @NonNull
    @Override
    public listaContatoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new listaContatoViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull listaContatoViewHolder holder, int position) {

    itemGeSet item_atual = listaContatos.get(position);
    holder.bind(item_atual);



    }

    @Override
    public int getItemCount() {
       return listaContatos.size();
    }

    public class listaContatoViewHolder extends RecyclerView.ViewHolder {
        public listaContatoViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(itemGeSet item){
            ImageView imagem    = itemView.findViewById(R.id.img_perfil);
            TextView nome       = itemView.findViewById(R.id.nome_contato);
            TextView ultima_msg = itemView.findViewById(R.id.ultima_msg);
            ImageView color_on  = itemView.findViewById(R.id.seta_status);

            imagem.setImageResource(item.getImg_perfil());
            nome.setText(item.getName());
            ultima_msg.setText(item.getTxt_msg());

            /*
            color_on.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //aqui vai ação ao clicar na seta
                }
            }); */

        }
    }
}
