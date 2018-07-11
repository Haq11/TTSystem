/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author shazan sattar
 */
public class Routes implements Serializable {

    private int routenumber;
    private String startdestination;
    private String enddestination;
    private ArrayList<String> stops;

    public Routes(int routenumber, String startdestination, String enddestination, int stops) {

        this.routenumber = routenumber;
        this.startdestination = startdestination;
        this.enddestination = enddestination;
        this.stops = new ArrayList<>(stops);
    }

    public int routenumber() {

        return routenumber;
    }

    public String startdestination() {

        return startdestination;
    }

    public String enddestination() {

        return enddestination;
    }

    public ArrayList stops() {

        return stops;

    }

    @Override
    public String toString() {

        return startdestination + " " + enddestination;
    }

    public void addStop(String stopName) {
        stops.add(stopName);
    }

    public ArrayList<String> getStops() {
        return stops;
    }
    
    

    
}
