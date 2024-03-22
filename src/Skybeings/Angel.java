package Skybeings;

public class Angel implements SkyBeing{

    private String nombre;
    private int edad;

    public Angel(String nombre, int edad) {
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
    public String toString() {
        System.out.println("Nombre = " + getNombre() +
                "\nEdad = " + getEdad());
        return null;
    }
    @Override
    public void fly() {
        System.out.println("Soy un Angel mi nombre es: " + getNombre() + " mi edad es: " + getEdad()
                + "  y puedo volar" +
                "con mis alas...");
    }

    @Override
    public void changeDimensionChange() {
        System.out.println("Mi nombre es : " + getNombre() + " mi edad es: " + getEdad()
                + " y puedo cambiar de dimension...");

    }

    @Override
    public void respawn() {
        System.out.println("Mi nombre es : " + getNombre() + " mi edad es: " + getEdad()
                + " y puedo reenacer...");
    }
}
