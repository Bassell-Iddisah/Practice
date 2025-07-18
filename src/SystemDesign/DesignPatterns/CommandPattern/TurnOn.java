package SystemDesign.DesignPatterns.CommandPattern;

public class TurnOn implements Command {
    private Bulb bulb;

    public TurnOn(Bulb bulb) {
        this.bulb = bulb;
    }

    public void execute() {
        bulb.turnOn();
    }

    public void undo() {
        bulb.turnOff();
    }

    public void redo() {
        execute();
    }
}
