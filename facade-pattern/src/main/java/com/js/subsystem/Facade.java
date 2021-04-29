package com.js.subsystem;

public class Facade {
    private SubSystemA subSystemA = new SubSystemA();
    private SubSystemB subSystemB = new SubSystemB();
    private SubSystemC subSystemC = new SubSystemC();

    public void doA() {
        this.subSystemA.doA();
    }

    public void doB() {
        this.subSystemB.doB();
    }

    public void doC() {
        this.subSystemC.doC();
    }
}
