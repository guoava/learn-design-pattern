package designpattern.behavioral.command.command.light;

import designpattern.behavioral.command.command.ICommand;
import designpattern.behavioral.command.receiver.Light;

public class LightOffCommand implements ICommand {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println(light.getName() + " is off");
    }

    @Override
    public void undo() {
        System.out.println(light.getName() + " is on (undo off)");
    }
}
