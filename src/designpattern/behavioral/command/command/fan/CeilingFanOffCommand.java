package designpattern.behavioral.command.command.fan;

import designpattern.behavioral.command.command.ICommand;
import designpattern.behavioral.command.receiver.CeilingFan;

public class CeilingFanOffCommand implements ICommand {

    private CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        System.out.println(ceilingFan.getName() + " is off");
    }

    @Override
    public void undo() {
        System.out.println(ceilingFan.getName() + " is on (undo off)");
    }
}
