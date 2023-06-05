package designpattern.creational.singleton;

public class SingletonTest {

    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        instance.say();


        Singleton instance2 = Singleton.getInstance();
        instance2.say();

    }

}




