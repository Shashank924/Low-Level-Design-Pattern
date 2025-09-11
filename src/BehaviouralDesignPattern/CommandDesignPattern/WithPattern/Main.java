package BehaviouralDesignPattern.CommandDesignPattern.WithPattern;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        TurnOnCommand turnOnCommand = new TurnOnCommand(tv);
        TurnOffCommand turnOffCommand = new TurnOffCommand(tv);

        RemoteControl remoteControl = new RemoteControl(turnOnCommand);
        remoteControl.exec();

        remoteControl.setCommand(turnOffCommand);
        remoteControl.exec();
    }
}
