package designpattern.behavioral.observer.test;


import designpattern.behavioral.observer.test.buildin.BuildInPcDisplay;
import designpattern.behavioral.observer.test.buildin.BuildInWeatherStation;
import designpattern.behavioral.observer.weatherstation.WeatherStation;
import designpattern.behavioral.observer.weatherstation.devices.PcDisplay;
import designpattern.behavioral.observer.weatherstation.devices.PhoneDisplay;

/**
 * The Observer Pattern defines a one-to-many
 * dependency between objects so that when one
 * object changes state, all of its dependents are
 * notified and updated automatically.
 */
public class ObserverPatternTest {
    public static void main(String[] args) {

        // 1. use our observer
        // create a weather station
        WeatherStation weatherStation = new WeatherStation();

        // create some observers(use construct to register as an observer)
        PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);

        PcDisplay pcDisplay = new PcDisplay(weatherStation);

//        weatherStation.removeObserver(pcDisplay);

        // test if weather station data is updated
        weatherStation.setHumidity(155);
        weatherStation.notifyObservers();


        // 2. use jdk build in observer
        BuildInWeatherStation buildInWeatherStation = new BuildInWeatherStation();
        buildInWeatherStation.setHumidity(418);
        BuildInPcDisplay buildInPcDisplay = new BuildInPcDisplay(buildInWeatherStation);
        BuildInPcDisplay buildInPcDisplay02 = new BuildInPcDisplay(buildInWeatherStation);
        buildInWeatherStation.measurementsChanged();


    }
}
