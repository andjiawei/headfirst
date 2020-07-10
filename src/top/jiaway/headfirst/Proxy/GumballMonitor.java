package top.jiaway.headfirst.Proxy;

import java.rmi.RemoteException;

public class GumballMonitor {

    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() throws RemoteException {
        System.out.println("gumball machine: " + machine.getLocation());
        System.out.println("current inventory: " + machine.getCount());
        System.out.println("current state: " + machine.getState());
    }
}
