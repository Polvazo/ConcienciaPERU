package com.polvazo.concienciaperu.Vista;

import android.app.Dialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.polvazo.concienciaperu.Modelo.Animales;
import com.polvazo.concienciaperu.Presentador.FirabaseClient;
import com.polvazo.concienciaperu.R;

import java.util.ArrayList;

public class principal extends AppCompatActivity {

    final static  String DB_URL= "https://concienciaperu-5868d.firebaseio.com/";

    ListView listView;
    FirabaseClient firebaseClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        listView=(ListView)findViewById(R.id.listview_animales);
        firebaseClient= new FirabaseClient(this, DB_URL,listView);
        firebaseClient.refreshdata();




    }

}
