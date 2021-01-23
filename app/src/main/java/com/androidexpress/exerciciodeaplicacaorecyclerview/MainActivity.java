package com.androidexpress.exerciciodeaplicacaorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public ListaContatoFragment lista_contato_fragment;
    public List<itemGeSet> lista_dos_contatos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lista_contato_fragment = new ListaContatoFragment();

        //fragmentListaContatos();

        FragmentTransaction apresentation = getSupportFragmentManager().beginTransaction();
        apresentation.replace(R.id.fragment_apresentation, new ListaContatoFragment()).commit();

    }

public void fragmentListaContatos(){

    //lista_dos_contatos = Lista_dos_contatos.listaContatos();
    FragmentTransaction apresentation = getSupportFragmentManager().beginTransaction();
    apresentation.replace(R.id.fragment_apresentation, new ListaContatoFragment()).commit();
}

}