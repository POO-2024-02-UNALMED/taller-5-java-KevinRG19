package zooAnimales;
import gestion.*;
import java.util.ArrayList;

public class Animal {
    private int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }
    public Animal(){}

    public String toString() {
        return ("Mi nombre es " + this.nombre + " tengo de edad " + this.edad + " habito en " + this.habitat + " y mi genero es " + this.genero
        + " la zona en que me ubico es " + this.zona + ", en el " + this.zona.getZoo());
    }

    public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public String totalPorTipo() {
        return ("Mamiferos: " + Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: " + Reptil.cantidadReptiles()
        + "\nPeces: " + Pez.cantidadPeces() + "\nAnficios: " + Anfibio.cantidadAnfibios());
    }
}
