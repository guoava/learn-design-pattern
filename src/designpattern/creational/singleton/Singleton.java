package designpattern.creational.singleton;

/**
 * Using this approach, we rely on the JVM to create the unique instance of the Singleton when
 * the class is loaded. The JVM guarantees that the instance will be created before any thread
 * accesses the static uniqueInstance variable.
 */
public class Singleton {

    private static Singleton uniqueInstance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public void say() {
        System.out.println(this.toString());
    }
}
