package designpattern.structural.adapter.adapter;

import designpattern.structural.adapter.adaptee.IAdaptee;
import designpattern.structural.adapter.target.ITarget;

public class Adapter implements ITarget {

    private IAdaptee adaptee;

    public Adapter(IAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        this.adaptee.specificRequest();
    }
}
