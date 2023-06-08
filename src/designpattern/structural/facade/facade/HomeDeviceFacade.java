package designpattern.structural.facade.facade;

import designpattern.structural.facade.subsystem.DvdPlayer;
import designpattern.structural.facade.subsystem.MusicCdPlayer;
import designpattern.structural.facade.subsystem.Television;

public class HomeDeviceFacade {

    public void watchDvd() {
        DvdPlayer dvdPlayer = new DvdPlayer();
        dvdPlayer.play();
    }

    public void watchTelevision() {
        Television television = new Television();
        television.play();
    }

    public void listenMusic() {
        MusicCdPlayer musicCdPlayer = new MusicCdPlayer();
        musicCdPlayer.play();
    }

}
