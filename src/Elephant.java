public class Elephant extends Erbivor implements Animal{
    @Override
    public void move(){
        System.out.println("Elephant walks on four legs");
    }
    @Override
    public void makeNoise(){
        System.out.println("Trumpet sound...");
    }
    @Override
    public void eat(){
        System.out.println("Elephant eats grass");
    }
}
