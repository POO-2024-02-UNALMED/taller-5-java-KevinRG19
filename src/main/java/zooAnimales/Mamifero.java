package zooAnimales;
import gestion.Zona;

import java.util.ArrayList;
import java.util.List;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public int caballos;
    public int leones;
    private Boolean pelaje;
    private int patas;

    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, Boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zona);
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

    public Boolean getPelaje() {
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
    public void crearCaballo(String nombre, int edad, String genero, Zona zona) {
        caballos++;
        new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
    }

    public void crearLeon (String nombre, int edad, String genero, Zona zona) {
        leones++;
        new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
    }

}
