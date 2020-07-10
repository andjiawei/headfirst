package top.jiaway.headfirst.Proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {

    private static GumballMachine gumballMachine;

    public static void main(String[] args) throws RemoteException {
        GumballMachineRemote gumballMachineRemote = null ;
        int count;

        String[] location = { "rmi://santafe.mightygumball.com/gumballmachine" ,
                              "rmi://boulder.mightygumball.com/gumballmachine",
                              "rmi://santafe.mightygumball.com/gumballmachine"};
        GumballMonitor[] monitor = new GumballMonitor[location.length];

        for (int i = 0;i <location.length; i++){
            GumballMachineRemote machine = null;
            try {
                machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println( monitor[i] );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0;i < monitor.length; i++){
            monitor[i].report();
        }



//        if (args.length < 2){
//            System.out.println("GumballMachine");
//            System.exit(1);
//        }
//
//        try {
//            count = Integer.parseInt(args[1]);
//            gumballMachine = new GumballMachine(args[0],count);//location count
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }


}
