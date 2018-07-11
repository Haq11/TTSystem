/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author shazan sattar
 */
public class Stations implements Serializable {

    private int stationnumber;
    private String stationname;
    private int routenumber;

    public Stations(int stationnumber, String stationname, int routenumber) {

        this.stationnumber = stationnumber;
        this.stationname = stationname;
        this.routenumber = routenumber;
    }

    public int getstationumber() {

        return stationnumber;

    }

    public String getstationname() {

        return stationname;
    }

    public int routenumber() {

        return routenumber;
    }
    @Override
    public String toString() {

        return stationname;
    }
    

    
}
