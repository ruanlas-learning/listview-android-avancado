package com.example.ruan.listview;

import android.content.Context;
import android.widget.ArrayAdapter;

/*
* Quando trabalhamos com componentes do tipo listView, os dados que serão exibidos na listagem
* deste componente devem pertencer a uma coleção do tipo ArrayAdapter. Quando queremos que os dados
* sejam exibidos de forma customizada, devemos criar um ArrayAdapter personalizado para passar
* para o listView da forma que for mais conveniente.
* */
public class ItensAdapter extends ArrayAdapter<Item> {

    private Context context;
    private int layoutResourceId;
    private Item[] items;

    public ItensAdapter(Context context, int layoutResourceId, Item[] listItens){
        super(context, layoutResourceId, listItens);

        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.items = listItens;
    }
}
