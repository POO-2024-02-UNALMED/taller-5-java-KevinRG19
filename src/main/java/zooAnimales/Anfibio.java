package zooAnimales;
import gestion.Zona;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, Boolean venenoso) {
        super(nombre, edad, habitat, genero, zona);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public Anfibio() {}

    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Anfibio> listado) {
        this.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public Boolean getVenenoso() {
        return venenoso;
    }

    public void setVenenoso(Boolean venenoso) {
        this.venenoso = venenoso;
    }

    public String movimiento() {
        return "saltar";
    }
    public static int cantidadAnfibios() {
        return listado.size();
    }
    public void crearRana(String nombre, int edad, String genero, Zona zona){
        ranas++;
        new Anfibio(nombre, edad, "selva", genero, zona, "rojo", true);
    }
    public void Salamandra(String nombre, int edad, String genero, Zona zona){
        salamandras++;
        new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarillo", false);
    }


}
