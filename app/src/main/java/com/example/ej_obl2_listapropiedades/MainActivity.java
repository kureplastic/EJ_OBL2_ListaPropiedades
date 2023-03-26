package com.example.ej_obl2_listapropiedades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    //usaremos
    private ArrayList<Inmueble> inmuebles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarLV();
    }

    public void cargarDatos(){
        inmuebles.add(new Inmueble(R.drawable.prop1,"El Morro",3000000));
        inmuebles.add(new Inmueble(R.drawable.prop2,"Juana Koslay",4500000));
        inmuebles.add(new Inmueble(R.drawable.prop3,"Las Lajas",7200000));
        inmuebles.add(new Inmueble(R.drawable.prop4,"Merlo",6000000));
    }

    public void generarLV(){
        ArrayAdapter<Inmueble> adapter  = new InmuebleAdapter(this,R.layout.item_propiedad,inmuebles,getLayoutInflater());

        ListView lv = findViewById(R.id.lvListaPropiedades);
        lv.setAdapter(adapter);
    }
}