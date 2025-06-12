import DesignPatterns.CommandPattern.*;

public class App {
    public static void main(String[] args) {
        // Create bulb object
        Bulb bulb = new Bulb();

        // Create commands buttons
        Command goTo = new TurnOn(bulb);
//        Command turnOff = new TurnOff(bulb);

        // Create remote object
        RemoteControl remote = new RemoteControl();

        // Send commands to do action
        remote.submit(goTo);
//        remote.submit(turnOn);
//        remote.submit(turnOff);
    }
}
