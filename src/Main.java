public class Main {
    public static void main(String[] args) {
        Animal elephant = new Elephant();
        elephant.move();
        elephant.makeNoise();
        elephant.sleep();
        Animal.breathes();
        Erbivor elephant2 = new Elephant();
        elephant2.eat();
        elephant2.runs();
    }
}