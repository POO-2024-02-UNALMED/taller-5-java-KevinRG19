package zooAnimales;
import gestion.Zona;

import java.util.ArrayList;
import java.util.List;

public class Pez extends Animal{
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(String nombre, int edad, String habitat, String genero, Zona zona,String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez() {}

    public String movimiento() {
        return "nadar";
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public void crearSalmon(String nombre, int edad, String genero, Zona zona){
        salmones++;
        new Pez(nombre, edad, "oceano", genero, zona, "rojo", 6);
    }

    public void crearBacalao(String nombre, int edad, String genero, Zona zona){
        bacalaos++;
        new Pez(nombre, edad, "oceano", genero, zona, "gris", 6);
    }
}
