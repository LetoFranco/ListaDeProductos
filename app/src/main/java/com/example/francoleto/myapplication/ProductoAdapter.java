package com.example.francoleto.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class ProductoAdapter extends BaseAdapter {

    private List<Producto> productos;

    public ProductoAdapter(List<Producto> productos){
        this.productos = productos;
    }

    @Override
    public int getCount() {
        return productos.size();
    }

    @Override
    public Object getItem(int position) {
        return productos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return productos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view;

        if(convertView == null)
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_producto, parent, false);
        else
            view = convertView;

        Producto producto = (Producto) getItem(position);

        TextView id = (TextView) view.findViewById(R.id.id);
        TextView nombre = (TextView) view.findViewById(R.id.nombre);

        id.setText(String.valueOf(producto.getId()));
        nombre.setText(producto.getNombre());

        return view;
    }
}
