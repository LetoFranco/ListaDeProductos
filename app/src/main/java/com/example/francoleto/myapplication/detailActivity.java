package com.example.francoleto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class detailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter_producto);
        Bundle b = getIntent().getExtras();
        Producto producto = b.getParcelable("producto");

        TextView id = (TextView) findViewById(R.id.id);
        TextView nombre = (TextView) findViewById(R.id.nombre);
        TextView descripcion = (TextView) findViewById(R.id.descripcion);

        id.setText(String.valueOf(producto.getId()));
        nombre.setText(producto.getNombre());
        descripcion.setText(producto.getDescripcion());
    }
}
