package designpattern.behavioral.command.invoker;

import designpattern.behavioral.command.command.ICommand;
import designpattern.behavioral.command.command.NoCommand;

public class RemoteControl {

    ICommand[] onCommands;
    ICommand[] offCommands;

    public RemoteControl() {
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }


}
