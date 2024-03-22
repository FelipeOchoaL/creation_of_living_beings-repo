package BeingsOfTheEarth;
import Skybeings.SkyBeing;

public class Human extends LivingBeings implements EarthBein, SkyBeing {

    private String nombre;
    private int edad;

    public Human(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public void born() {
        System.out.println("Mi nombre es " + getNombre() + " Estoy naciendo...");

    }

    @Override
    public void grow() {
        System.out.println("Soy " + getNombre() + " Tengo " + getEdad() + " Estoy creciendo grande y fuerte :)...");
    }

    @Override
    public void die() {
        System.out.println(getNombre() + " Murio :( ...");

    }

    @Override
    public void walk() {
        System.out.println("Caminando en dos patas...");

    }
    public void perriar(){
        System.out.println("Estoy perriando...");
    }



    public String toString() {
        System.out.println(
                "Nombre = " + nombre +
                        "\nEdad = " + edad );
        return null;
    }
    @Override
    public void fly() {
        System.out.println("Construyo un avion con el que puede volar...");

    }

    @Override
    public void changeDimensionChange() {
        System.out.println("Obvio no puedo cambiar de dimension soy humano...");

    }
    @Override
    public void respawn() {
        System.out.println("No puedo renacer :( soy humano... ");

    }
    @Override
    public String createLivingBeings() {
        return null;
    }
    public void hablar(){
        System.out.println("Holaa narva, puedo hablar soy un humano...");
    }



}
