package zooAnimales;
import gestion.Zona;

import java.util.ArrayList;
import java.util.List;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave(){}

    public String movimiento() {
        return "volar";
    }
    public static int cantidadAves() {
        return listado.size();
    }

    public static void crearHalcon(String nombre, int edad, String genero) {
        halcones++;
        new Ave(nombre, edad, "montañas", genero, "cafe glorioso");
    }

    public static void crearAguila(String nombre, int edad, String genero) {
        halcones++;
        new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
