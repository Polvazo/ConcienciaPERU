package com.polvazo.concienciaperu.Presentador;

import android.content.Context;
import android.widget.ImageView;

import com.polvazo.concienciaperu.R;
import com.squareup.picasso.Picasso;

/**
 * Created by USUARIO on 19/07/2017.
 */

public class PicassoClient {


    public  static  void downloadimg(Context c, String url, ImageView img)
    {
        if (url!=null && url.length()>0)
        {
            Picasso.with(c).load(url).placeholder(R.drawable.placeholder).into(img);

        }else
        {
            Picasso.with(c).load(R.drawable.placeholder).into(img);
        }
    }
}
