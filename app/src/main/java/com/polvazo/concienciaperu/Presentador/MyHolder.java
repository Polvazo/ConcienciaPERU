package com.polvazo.concienciaperu.Presentador;

import android.view.View;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;

import com.polvazo.concienciaperu.R;

/**
 * Created by USUARIO on 19/07/2017.
 */

public class MyHolder {
    TextView titulo;
    TextView descripcion;
    ImageView imagen;

    public MyHolder(View itemView) {


        titulo = (TextView)itemView.findViewById(R.id.txt_animales_nombre);
        descripcion = (TextView)itemView.findViewById(R.id.txt_animales_descripcion);
        imagen =(ImageView)itemView.findViewById(R.id.img_animales_photo);

    }
}
