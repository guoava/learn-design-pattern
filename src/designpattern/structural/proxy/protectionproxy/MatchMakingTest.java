package designpattern.structural.proxy.protectionproxy;

import java.lang.reflect.Proxy;

public class MatchMakingTest {

    public static void main(String[] args) {

        PersonBean personBean = new PersonBean();
        personBean.setName("Jack");

        IPersonBean personBeanProxy = getOwnerProxy(personBean);
        personBeanProxy.setHotOrNotRating(10);


    }

    static IPersonBean getOwnerProxy(IPersonBean personBean) {
        return (IPersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

}
