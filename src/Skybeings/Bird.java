package Skybeings;
import BeingsOfTheEarth.LivingBeings;
import BeingsOfTheEarth.EarthBein;

public class Bird extends LivingBeings implements EarthBein, SkyBeing{
    @Override
    public void born() {
        System.out.println("Nacio un poyuelo...");
    }

    @Override
    public void grow() {
        System.out.println("ya es todo un pajarraco...");
    }


    @Override
    public void die() {
        System.out.println("Murio...");
    }

    @Override
    public void fly() {
        System.out.println("Puedo volar con mis alas...");
    }

    @Override
    public void changeDimensionChange() {

    }

    @Override
    public void respawn() {

    }

    @Override
    public void walk() {
        System.out.println("Caminando con dos patas...");
    }

    @Override
    public String createLivingBeings() {
        return null;
    }
}
