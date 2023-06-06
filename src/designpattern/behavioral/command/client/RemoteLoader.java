package designpattern.behavioral.command.client;

import designpattern.behavioral.command.command.fan.CeilingFanOffCommand;
import designpattern.behavioral.command.command.fan.CeilingFanOnCommand;
import designpattern.behavioral.command.command.light.LightOffCommand;
import designpattern.behavioral.command.command.light.LightOnCommand;
import designpattern.behavioral.command.invoker.RemoteControl;
import designpattern.behavioral.command.receiver.CeilingFan;
import designpattern.behavioral.command.receiver.Light;

public class RemoteLoader {

    private RemoteLoader() {
    }

    public static RemoteControl loadRemoteControl() {
        // 1. create a remote controller
        RemoteControl remoteControl = new RemoteControl();

        // 2. create some devices
        Light livingRoomLight = new Light("Living Room Light");
        Light bedroomLight = new Light("Bedroom Light");

        CeilingFan livingRoomCeilingFan = new CeilingFan("Living Room CeilingFan");
        CeilingFan bedroomCeilingFan = new CeilingFan("Bedroom CeilingFan");

        // 3. create commands for every devices
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        LightOnCommand lightOnCommand1 = new LightOnCommand(bedroomLight);
        LightOffCommand lightOffCommand1 = new LightOffCommand(bedroomLight);

        CeilingFanOnCommand ceilingFanOnCommand = new CeilingFanOnCommand(livingRoomCeilingFan);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);

        CeilingFanOnCommand ceilingFanOnCommand1 = new CeilingFanOnCommand(bedroomCeilingFan);
        CeilingFanOffCommand ceilingFanOffCommand1 = new CeilingFanOffCommand(bedroomCeilingFan);

        // 4. set those commands to remote controller
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.setCommand(1, lightOnCommand1, lightOffCommand1);
        remoteControl.setCommand(2, ceilingFanOnCommand, ceilingFanOffCommand);
        remoteControl.setCommand(3, ceilingFanOnCommand1, ceilingFanOffCommand1);

        return remoteControl;
    }

}
