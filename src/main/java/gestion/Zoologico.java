package gestion;
import zooAnimales.Animal;

import java.util.ArrayList;


public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico (String nombre, String ubicacion, ArrayList<Zona> zonas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
    }

    public Zoologico() {}

    public int cantidadTotalAnimales () {
        int total = 0;
        for (Zona zona : zonas) {
            total += zona.cantidadAnimales();
        }
        return total;
    }

    public void agregarZonas (Zona zona) {
        zonas.add(zona);
        zona.setZoo(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
}