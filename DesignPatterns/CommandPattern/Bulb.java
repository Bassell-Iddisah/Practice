package DesignPatterns.CommandPattern;

/* This is the receiver object, which actually performs the action */

public class Bulb {
    public void turnOn() {
        System.out.println("F)cho.... ON!");
    }

    public void turnOff() {
        System.out.println("F)cho.... OFF!");
    }
}
