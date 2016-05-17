package com.example.francoleto.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AgregarProductoActivity extends AppCompatActivity {

    private Button agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_producto);

        agregar =(Button) findViewById(R.id.btn_agregar);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Crear el producto y agregarlo a la lista.
                EditText et_id = (EditText) findViewById(R.id.et_id);
                int id = Integer.parseInt(et_id.getText().toString());
                EditText et_nombre = (EditText) findViewById(R.id.et_nombre);
                String nombre = et_nombre.getText().toString();
                EditText et_descripcion = (EditText) findViewById(R.id.et_descripcion);
                String descripcion = et_descripcion.getText().toString();
                Producto producto = new Producto(id , nombre, descripcion);
                ProductoFactory.getInstance().agregarProducto(producto);
                onBackPressed();
            }
        });
    }
}
