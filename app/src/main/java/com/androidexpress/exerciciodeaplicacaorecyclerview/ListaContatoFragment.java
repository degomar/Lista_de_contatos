package com.androidexpress.exerciciodeaplicacaorecyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ListaContatoFragment extends Fragment {

    RecyclerView rv_contatos;
    ListaContatoAdapter adapter;
    ListaDosContatos listaDosContatos;
    List<itemGeSet> itens;
    View fragmentbg;



    public static ListaContatoFragment newInstance(String param1, String param2) {

        ListaContatoFragment fragment = new ListaContatoFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rv_contatos = view.findViewById(R.id.recyclerView_lista);

        itens = new ArrayList<itemGeSet>();
        itens.add(new itemGeSet(1,true,R.drawable.circle_img_celula,"Leonardo","Recycler realizada com sucesso"));
        itens.add(new itemGeSet(2,false,R.drawable.circle_img_celula,"Ellen","conhecimento é tudo"));
        itens.add(new itemGeSet(3,false,R.drawable.circle_img_celula,"Elaine","não se pode desanimar"));
        itens.add(new itemGeSet(4,false,R.drawable.circle_img_celula,"Zeck","tem que arriscar"));
        itens.add(new itemGeSet(5,true,R.drawable.circle_img_celula,"Micka","o desafio amadurece"));
        itens.add(new itemGeSet(6,true,R.drawable.circle_img_celula,"yuri","expor a si mesmo"));
        itens.add(new itemGeSet(7,false,R.drawable.circle_img_celula,"Eric","Esforço e estudo"));
        itens.add(new itemGeSet(8,true,R.drawable.circle_img_celula,"Angelo","são as ferramentas p/ chegar longe"));
        itens.add(new itemGeSet(9,false,R.drawable.circle_img_celula,"Camila","numa melhoria continua"));
        itens.add(new itemGeSet(10,true,R.drawable.circle_img_celula,"Anderson","se aperfeiçoando"));
        itens.add(new itemGeSet(11,true,R.drawable.circle_img_celula,"Peter","sempre crescendo"));


        adapter = new ListaContatoAdapter(itens);
        rv_contatos.setLayoutManager(new LinearLayoutManager(getContext()));
        rv_contatos.setAdapter(adapter);

    }

    public ListaContatoFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_lista_contato_fragment, container, false);
        rv_contatos = view.findViewById(R.id.recyclerView_lista);
        // Inflate the layout for this fragment
        return view;



        }

}