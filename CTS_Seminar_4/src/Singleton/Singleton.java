package Singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(Singleton.instance == null) return new Singleton();
        return Singleton.instance;
    }

    public void doSomething() {
        System.out.println("Singleton.Singleton is doing something");
    }
}
