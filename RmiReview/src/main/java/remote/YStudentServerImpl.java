package main.java.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

public class YStudentServerImpl extends UnicastRemoteObject implements IYStudentServer{

    //Store means of movement in a map and index by name
    private HashMap<String,String> memove = new HashMap<>();
    public YStudentServerImpl() throws RemoteException {

       initStudentData();

    }

    protected void initStudentData() {

        memove.put("Martin", "LADA");
        memove.put("Boris","Camaro");
        memove.put("Poune","Tesla");
        memove.put("Louis","El-scooter");

    }

    @Override
    public String findMeans(String name) throws RuntimeException {

        String means = memove.get(name);
        if (means==null){
            System.out.println("Student "+name+" not found");
            return "Consider walking to save planet";
        }
        else {
            System.out.println(name + " s means of movement is" + means);
            return means;
        }

    }
}
