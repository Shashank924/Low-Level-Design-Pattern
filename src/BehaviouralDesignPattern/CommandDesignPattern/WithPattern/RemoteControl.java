package BehaviouralDesignPattern.CommandDesignPattern.WithPattern;

public class RemoteControl {

    private Command command;

    public RemoteControl(Command command) {
        this.command = command;
    }

    public void exec() {
        command.execute();
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
