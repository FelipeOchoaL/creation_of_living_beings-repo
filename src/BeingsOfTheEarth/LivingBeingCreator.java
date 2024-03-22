package BeingsOfTheEarth;
import java.util.Scanner;

public class LivingBeingCreator implements Creator, EarthBein {
    Scanner sc = new Scanner(System.in);

    private String nombreCriatura;
    private int edad;

    void LivingBeings(String nombre_Ser, int edad){
        this.nombreCriatura = nombreCriatura;
        this.edad = edad;
    }

    public String getNombreCriatura() {
        return nombreCriatura;
    }

    public void setNombreCriatura(String nombreCriatura) {
        this.nombreCriatura = nombreCriatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // metodo implementado de creator
    @Override
    public String createLivingBeings() {
        System.out.println("Ingrese el nombre del ser Vivo: ");
        setNombreCriatura(sc.next());
        System.out.println("Ingrese la Edad del ser Vivo: ");
        setEdad(sc.nextInt());

        return null;
    }

    @Override
    public void walk() {

    }

    @Override
    public void born() {
        System.out.println("Hola, mi nombre es" + getNombreCriatura()  + " y Acabe de nacer");
    }

    @Override
    public void grow() {
        System.out.println("Mi nombre es " + getNombreCriatura() + "Tengo " + getEdad()+ " años estoy creciendo...");

    }

    @Override
    public void die() {
        System.out.println("Mi nombre es " + getNombreCriatura() + " Tengo " + getEdad()+ " ya mori :( ...");

    }


}
