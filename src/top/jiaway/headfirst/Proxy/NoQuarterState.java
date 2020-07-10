package top.jiaway.headfirst.Proxy;

import top.jiaway.headfirst.State.GumballMachine;

public class NoQuarterState implements State   {

    transient GumballMachine gumballMachine;

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void turnCrank() {

    }

    @Override
    public void dispense() {

    }
}
