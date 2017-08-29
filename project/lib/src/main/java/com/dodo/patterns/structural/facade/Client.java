package com.dodo.patterns.structural.facade;


/**
 * 外观模式
 */

public class Client {

    public static void main(String[] args) {


        ComputerFacade computerFacade = new ComputerFacade(new Computer());
        computerFacade.turnOn(); // Ouch! Beep beep! Loading.. Ready to be used!
        computerFacade.turnOff(); // Bup bup buzzz! Haah! Zzzzz
    }
}
