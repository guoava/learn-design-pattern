package designpattern.behavioral.observer.observerable;


import designpattern.behavioral.observer.observer.IObserver;

public interface IObserverable {

    /**
     * register to observer
     *
     * @param iObserver
     */
    public void registerObserver(IObserver iObserver);


    /**
     * unsubscribe
     *
     * @param iObserver
     */
    public void removeObserver(IObserver iObserver);

    /**
     * notify all observres
     */
    public void notifyObservers();

}
