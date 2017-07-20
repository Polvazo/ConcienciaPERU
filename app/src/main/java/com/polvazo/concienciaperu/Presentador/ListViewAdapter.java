package com.polvazo.concienciaperu.Presentador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.polvazo.concienciaperu.Modelo.Animales;
import com.polvazo.concienciaperu.R;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter {


    Context contexto;
    ArrayList<Animales> animal;
    LayoutInflater inflater;




    public ListViewAdapter(Context contexto,  ArrayList<Animales> animal) {

        this.animal = animal;
        this.contexto=contexto;

    }
    @Override
    public int getCount() {
        return animal.size();
    }
    @Override
    public Object getItem(int position) {
        return animal.get(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {

        if (inflater== null)
        {
            inflater=(LayoutInflater)contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        } if(view==null)
        {
            view= inflater.inflate(R.layout.adaptadoranimales,parent,false);

        }

        MyHolder holder= new MyHolder(view);
        holder.titulo.setText(animal.get(position).getNombre());
        holder.descripcion.setText(animal.get(position).getDescripcion());

        PicassoClient.downloadimg(contexto,animal.get(position).getPhoto(),holder.imagen);

        return view;

         }

}
