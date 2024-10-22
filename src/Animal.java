public interface Animal {
    abstract void move();
    default void sleep(){
        System.out.println("Animal sleeps");
    }
    static void breathes(){
        System.out.println("Animal breathes");
    }
    abstract void makeNoise();
}
