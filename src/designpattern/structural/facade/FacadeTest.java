package designpattern.structural.facade;

import designpattern.structural.facade.facade.HomeDeviceFacade;

/**
 * Client
 */
public class FacadeTest {
    public static void main(String[] args) {
        HomeDeviceFacade homeDeviceFacade = new HomeDeviceFacade();
        homeDeviceFacade.watchDvd();
        homeDeviceFacade.listenMusic();
        homeDeviceFacade.watchTelevision();
    }
}
