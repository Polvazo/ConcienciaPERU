package com.polvazo.concienciaperu.Presentador;


import android.content.Context;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


import com.polvazo.concienciaperu.Modelo.Animales;
import com.firebase.client.ChildEventListener;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import java.util.ArrayList;




public class FirabaseClient {
    Context c;
    String DB_URL;
    ListView listView;
    Firebase firebase;
    ArrayList<Animales> dogies= new ArrayList<>();
    ListViewAdapter customAdapter;


    public FirabaseClient(Context c, String DB_URL, ListView listView)
    {
        this.c= c;
        this.DB_URL= DB_URL;
        this.listView= listView;


        Firebase.setAndroidContext(c);
        firebase=new Firebase(DB_URL);
    }


    public  void refreshdata()
    {
        firebase.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                for(DataSnapshot ds :dataSnapshot.getChildren()){

                    ds.child("animales").getValue(Animales.class).getNombre();
                    ds.child("animales").getValue(Animales.class).getDescripcion();




                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }


        });
    }


}
