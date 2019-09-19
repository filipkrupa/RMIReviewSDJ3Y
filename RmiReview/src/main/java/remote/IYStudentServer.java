package main.java.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IYStudentServer extends Remote {
    /**
     * Return the means of movement given a specific name
     */
    public String findMeans(String name) throws RemoteException;
}
