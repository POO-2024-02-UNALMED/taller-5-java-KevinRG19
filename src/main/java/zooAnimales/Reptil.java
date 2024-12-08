package zooAnimales;
import gestion.Zona;

import java.util.ArrayList;
import java.util.List;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zona,String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }
    public Reptil() {}

    public String movimiento() {
        return "reptar";
    }

    public static int cantidadReptiles() {
        return listado.size();
    }

    public void crearIguana(String nombre, int edad,String genero, Zona zona) {
        iguanas++;
        new Reptil(nombre, edad, "humedal", genero, zona, "verde", 3);
    }

    public void crearSerpiente(String nombre, int edad,String genero, Zona zona) {
        serpientes++;
        new Reptil(nombre, edad, "jungla", genero, zona, "blanco", 1);
    }

    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}