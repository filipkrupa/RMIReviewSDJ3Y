package main.java.local;

import main.java.remote.IYStudentServer;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class YStudentServerClient {

    //public static Registry registry;

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(1888);
            IYStudentServer remoteComm =(IYStudentServer) registry.lookup("YStudentServerImpl");
            System.out.println("Martin uses: " + remoteComm.findMeans("Martin"));
            System.out.println("Poune uses: " + remoteComm.findMeans("Poune"));

        } catch (RemoteException | NotBoundException e) {
            e.printStackTrace();
        }


    }

}
