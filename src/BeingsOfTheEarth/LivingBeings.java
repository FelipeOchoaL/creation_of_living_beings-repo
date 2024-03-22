package BeingsOfTheEarth;
import BeingsOfTheEarth.*;
import Skybeings.*;
import java.util.Scanner;

public abstract class LivingBeings implements EarthBein, Creator{
    Scanner sc = new Scanner(System.in);
    @java.lang.Override
    public void born() {
        System.out.println("Naciendo, soy un ser de la tierra...");

    }

    @java.lang.Override
    public void grow() {
        System.out.println("Creciendo, soy un ser de la tierra");

    }

    @java.lang.Override
    public void die() {
        System.out.println("Mori :(...");

    }

}