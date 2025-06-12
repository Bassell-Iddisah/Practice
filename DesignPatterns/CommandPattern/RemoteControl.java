package DesignPatterns.CommandPattern;

/* This is our invoker that takes commands and executes them without knowing how they are executed.*/

public class RemoteControl {
    public void submit(Command command) {
        command.execute();
    }
}