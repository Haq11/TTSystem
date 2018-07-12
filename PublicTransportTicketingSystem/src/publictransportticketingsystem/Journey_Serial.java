/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketingsystem;

import classes.SetOfCities;
import classes.SetOfRoutes;
import classes.SetOfTokens;
import classes.SetOfUsers;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author shazan sattar
 */
public class Journey_Serial implements Serializable {

    private SetOfCities cities;
    private SetOfRoutes routes;
    private SetOfTokens tokens;
    private SetOfUsers users;

    private static Journey_Serial journey;
    private static final String Serial_FILE = "./Journey.object";

    private Journey_Serial() {
        cities = new SetOfCities();
        routes = new SetOfRoutes();
        tokens = new SetOfTokens();
        users= new SetOfUsers();
    }

    public SetOfCities getCities() {
        return cities;
    }

    public SetOfRoutes getRoutes() {
        return routes;
    }

    public SetOfTokens getTokens() {
        return tokens;
    }
    
    public SetOfUsers getUsers(){
        return users;
    }

    public static Journey_Serial getJourney() {
        return journey;
    }

    public static boolean saveJourney() {
        try {
            FileOutputStream SerialFile = new FileOutputStream(Serial_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(SerialFile);
            oos.writeObject(journey);
            return true;
        } catch (IOException ex) {
        }
        return false;
    }

    public static boolean loadJourney() {
        try {
            FileInputStream SerialFile = new FileInputStream(Serial_FILE);
            ObjectInputStream ois = new ObjectInputStream(SerialFile);
            Object obj = ois.readObject();
            if (Journey_Serial.class.equals(obj.getClass())) {
                journey = (Journey_Serial) obj;
                return true;
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
        journey = new Journey_Serial();
        return false;
    }

}
