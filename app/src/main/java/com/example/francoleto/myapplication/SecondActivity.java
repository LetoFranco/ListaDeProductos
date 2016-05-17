package com.example.francoleto.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lista = (ListView) findViewById(R.id.lista);

        List<Producto> productos = new ArrayList<>();
        //productos.add(new Producto(1, "Monitor", "14 pulgadas, blanco"));
        //productos.add(new Producto(2, "Teclado", "Español, negro"));
        //productos.add(new Producto(3, "Memoria Ram Kingston", " 16 Gb, rojo"));
        lista.setAdapter(new ProductoAdapter(ProductoFactory.getInstance().obtenerProductos()));

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Producto producto = (Producto) lista.getItemAtPosition(position);
                Intent intent = new Intent(SecondActivity.this , detailActivity.class);
                intent.putExtra("producto",producto);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        ((BaseAdapter)lista.getAdapter()).notifyDataSetChanged();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mi_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.agregar:
                Intent intent = new Intent(SecondActivity.this, AgregarProductoActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
