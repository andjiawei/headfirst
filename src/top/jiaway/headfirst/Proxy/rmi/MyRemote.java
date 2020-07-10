package top.jiaway.headfirst.Proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {

    /**
     * 远程方法必须声明 RemoteException 异常
     * @return
     * @throws RemoteException
     */
     String sayHello() throws RemoteException;
}
