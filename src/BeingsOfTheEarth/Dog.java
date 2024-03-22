package BeingsOfTheEarth;

public class Dog extends LivingBeings implements EarthBein{
    public void reproduce() {
        System.out.println("Se esta reproduciendo ;) ...");

    }
    public void ladrar(){
        System.out.println("wof wof");
    }
    @Override
    public void born() {
        System.out.println("Naci con 5 hermanitos cachorros...");

    }

    @Override
    public void grow() {
        System.out.println("Estoy creciendo wof wof...");
    }


    @Override
    public void die() {
        System.out.println("Murio firulais :( ...");
    }

    @Override
    public void walk() {
        System.out.println("Esta caminando en 4 patas...");
        System.out.println("esta perriando");

    }

    @Override
    public String createLivingBeings() {
        return null;
    }
}
