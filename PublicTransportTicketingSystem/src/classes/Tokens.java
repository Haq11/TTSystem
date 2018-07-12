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
public class Tokens implements Serializable {

    private int tokennumber;
    private String name;
    private double balance;
    private String startdestination;
    private String enddestination;

    public Tokens(int tokennumber, String name, double balance, String startdestination, String enddestination) {

        this.tokennumber = tokennumber;
        
        
        this.startdestination=startdestination;
        this.enddestination=enddestination;
        

    }

    public int tokennumber() {

        return tokennumber;
    }

    public String name() {

        return name;
    }

    public double balance() {

        return balance;
    }

    public String startdestination() {

        return startdestination;
    }
    public String enddestination() {

        return enddestination;
    }
    
}
