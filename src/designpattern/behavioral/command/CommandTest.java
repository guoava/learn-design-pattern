package designpattern.behavioral.command;

import designpattern.behavioral.command.client.RemoteLoader;
import designpattern.behavioral.command.invoker.RemoteControl;

public class CommandTest {
    public static void main(String[] args) {
        // 1. load a remote controller
        RemoteControl remoteControl = RemoteLoader.loadRemoteControl();

        // 2. try press some button on remote controller
        remoteControl.onButtonWasPushed(0);
        remoteControl.onButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(0);
        remoteControl.offButtonWasPushed(1);
        remoteControl.offButtonWasPushed(2);
    }
}
