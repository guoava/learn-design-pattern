package designpattern.behavioral.command.command.fan;

import designpattern.behavioral.command.command.ICommand;
import designpattern.behavioral.command.receiver.CeilingFan;

public class CeilingFanOnCommand implements ICommand {
    private CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        System.out.println(ceilingFan.getName() + " is on");
    }

    @Override
    public void undo() {
        System.out.println(ceilingFan.getName() + " is off (undo on)");
    }
}
