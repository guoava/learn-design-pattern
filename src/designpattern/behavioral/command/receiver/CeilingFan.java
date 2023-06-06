package designpattern.behavioral.command.receiver;

public class CeilingFan {
    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
