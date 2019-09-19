package main.java.remote;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MainYServerApp {

    // Create the object and register with RMI Server
    public static void main(String[] args) {

        try {

            Registry registry = LocateRegistry.createRegistry( 1888);
            registry.rebind("YStudentServerImpl", new YStudentServerImpl());


        }
        catch (Exception ex){
            System.err.println("YStudentServerImpl exeption");
            ex.printStackTrace();
        }


    }


}
