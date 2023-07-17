package designpattern.structural.proxy;

public class ProxyTest {
    public static void main(String[] args) {

        RealSubject realSubject = new RealSubject();
        System.out.println(realSubject.cost());

        SubjectProxy subjectProxy = new SubjectProxy();
        System.out.println(subjectProxy.cost());

    }
}
