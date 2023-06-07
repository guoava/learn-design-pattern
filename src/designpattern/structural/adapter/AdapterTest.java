package designpattern.structural.adapter;

import designpattern.structural.adapter.adaptee.AdapteeOne;
import designpattern.structural.adapter.adapter.Adapter;
import designpattern.structural.adapter.target.ITarget;

/**
 * Client
 */
public class AdapterTest {

    public static void main(String[] args) {
        // call adapter request, actually call the Adaptee specificRequest
        ITarget adapter = new Adapter(new AdapteeOne());
        adapter.request();
    }

}
