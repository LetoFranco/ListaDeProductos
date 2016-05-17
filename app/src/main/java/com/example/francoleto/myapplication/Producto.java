package com.example.francoleto.myapplication;


import android.os.Parcel;
import android.os.Parcelable;

public class Producto implements Parcelable{

    //Usaremos este atributo como id para cada Producto
    private int id;

    private String nombre;

    private String descripcion;

    public Producto(int id, String nombre, String descripcion){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nombre);
        dest.writeString(this.descripcion);
    }

    protected Producto(Parcel in) {
        this.id = in.readInt();
        this.nombre = in.readString();
        this.descripcion = in.readString();
    }

    public static final Parcelable.Creator<Producto> CREATOR = new Parcelable.Creator<Producto>() {
        public Producto createFromParcel(Parcel source) {
            return new Producto(source);
        }

        public Producto[] newArray(int size) {
            return new Producto[size];
        }
    };



}
