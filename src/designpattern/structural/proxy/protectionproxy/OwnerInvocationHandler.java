package designpattern.structural.proxy.protectionproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {

    IPersonBean personBean;

    public OwnerInvocationHandler(IPersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException("Cant set rating ");
            } else if (method.getName().startsWith("set")) {
                return method.invoke(personBean, args);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
