package Controller;
import java.util.*;
import BeingsOfTheEarth.*;
import Skybeings.*;

public class Main {
    public static void main(String[] args) {
        boolean state = true;

        Scanner sc = new Scanner(System.in);
        Human humano = new Human("", 0);
        Angel angel = new Angel("", 0);
        Dog perro = new Dog();
        Bird pajaro = new Bird();
        LivingBeingCreator newCriature = new LivingBeingCreator();

        do{
            System.out.println("---------------BIENVENIDO--------------");
            System.out.println("------Creation of living beings--------");
            System.out.println("---------------------------------------");
            System.out.println("Selecciona: \n1. Si quieres Ser Humano" +
                    "\n2. Si quieres ser Angel " +
                    "\n3. Si quieres ser un perro" +
                    "\n4. Si quieres ser un pajaro" +
                    "\n5. Si quieres crear un ser vivo");
            int eleccion = sc.nextInt();
            if(eleccion == 1){
                System.out.println("Elige tu nombre: ");
                humano.setNombre(sc.next());
                System.out.println("Elige tu edad: ");
                humano.setEdad(sc.nextInt());
                humano.toString();
                humano.born();
                humano.grow();
                humano.hablar();
                humano.walk();
                humano.perriar();
                humano.fly();
                humano.changeDimensionChange();
                humano.respawn();
                humano.die();


            }
            else if(eleccion == 2){
                System.out.println("Elige tu nombre: ");
                angel.setNombre(sc.next());
                System.out.println("Elige tu edad: ");
                angel.setEdad(sc.nextInt());
                angel.toString();
                angel.fly();
                angel.changeDimensionChange();
                angel.respawn();

            }
            else if (eleccion == 3){
                System.out.println("Soy un perrito ");
                perro.born();
                perro.grow();
                perro.ladrar();
                perro.reproduce();
                perro.die();

            } else if (eleccion == 4) {
                System.out.println("Soy un pajarito");
                pajaro.born();
                pajaro.grow();
                pajaro.fly();
                pajaro.walk();
                pajaro.die();



            } else if (eleccion == 5) {
                System.out.println("Elige el ser de la tierra que quieres crear: ");
                newCriature.setNombreCriatura(sc.next());
                System.out.println("Elige la edad del ser : ");
                newCriature.setEdad(sc.nextInt());
                newCriature.born();
                newCriature.grow();
                newCriature.die();
            }
            else {
                state = false;
                System.out.println("Programa Cerrado");
            }
        }
        while (state);
    }

}
