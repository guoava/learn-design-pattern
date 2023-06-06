package designpattern.behavioral.command.command;

/**
 * The NoCommand object is an example of a null object. A null object is useful
 * when you don’t have a meaningful object to return, and yet you want to remove
 * the responsibility for handling null from the client. For instance, in our remote
 * control we didn’t have a meaningful object to assign to each slot out of the box,
 * so we provided a NoCommand object that acts as a surrogate and does nothing
 * when its execute method is called.
 * You’ll find uses for Null Objects in conjunction with many Design Patterns and
 * sometimes you’ll even see Null Object listed as a Design Pattern.
 */
public class NoCommand implements ICommand{
    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
