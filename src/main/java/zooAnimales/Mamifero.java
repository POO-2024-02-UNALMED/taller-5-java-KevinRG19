package zooAnimales;
import gestion.Zona;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private Boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, Boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }
    public Mamifero() {}

    public ArrayList<Mamifero> getListado() {
        return listado;
    }

    public void setListado(ArrayList<Mamifero> listado) {
        this.listado = listado;
    }

    public Boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(Boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);
    }

    public static Mamifero crearLeon (String nombre, int edad, String genero) {
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }

}
