package com.example.ej_obl2_listapropiedades;

import android.content.Context;
import android.renderscript.ScriptGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import javax.net.ssl.SSLSessionBindingEvent;

public class InmuebleAdapter extends ArrayAdapter<Inmueble> {

    //necesitamos
    private Context context;
    private List<Inmueble> inmuebles;
    private LayoutInflater li;


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if(itemView == null){
            itemView = li.inflate(R.layout.item_propiedad,parent,false);
        }
        Inmueble inmueble = inmuebles.get(position);

        ImageView imgPropiedad = itemView.findViewById(R.id.imgPropiedad);
        TextView tvDireccion = itemView.findViewById(R.id.tvDireccion);
        TextView tvPrecio = itemView.findViewById(R.id.tvPrecio);

        imgPropiedad.setImageResource(inmueble.getFoto());
        tvDireccion.setText(inmueble.getDireccion());
        tvPrecio.setText(inmueble.getPrecio() + "");

        return itemView;
    }

    public InmuebleAdapter(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.context = context;
        this.inmuebles = objects;
        this.li = li;


    }
}
