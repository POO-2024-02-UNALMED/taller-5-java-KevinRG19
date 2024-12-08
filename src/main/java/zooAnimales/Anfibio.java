package zooAnimales;
import gestion.Zona;

import java.util.ArrayList;
import java.util.List;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado = new ArrayList<>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private Boolean venenoso;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, Boolean venenoso) {
        super(nombre, edad, habitat, genero);
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

    public Boolean isVenenoso() {
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
    public static Anfibio crearRana(String nombre, int edad, String genero){
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }
    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }


}
