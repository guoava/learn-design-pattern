package designpattern.structural.proxy;

/**
 * The Proxy often instantiates or handles the creation of the RealSubject
 */
public class SubjectProxy implements ISubject {
    @Override
    public int cost() {
        RealSubject realSubject = new RealSubject();
        return realSubject.cost() + 20;
    }
}
