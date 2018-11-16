package com.example.ruan.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

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


    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        ItensHolder holder = null;

        if (row == null){
            LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
            row = layoutInflater.inflate(this.layoutResourceId, parent, false);

            holder = new ItensHolder();
            holder.imageView = (ImageView)row.findViewById(R.id.imageView);
            holder.textView = (TextView)row.findViewById(R.id.txt_nome);

            row.setTag(holder);
        }else {
            holder = (ItensHolder)row.getTag();
        }

        return null;
    }

    static class ItensHolder{
        public ImageView imageView;
        public TextView textView;
    }
}
