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

    private int cardnumber;
    private String name;
    private double balance;

    public Tokens(int cardnumber, String name, double balance) {

        this.cardnumber = cardnumber;
        this.name = name;
        this.balance = balance;

    }

    public int cardnumber() {

        return cardnumber;
    }

    public String name() {

        return name;
    }

    public double balance() {

        return balance;
    }

    public boolean charge(int diff) {
        if ((balance - diff) > 0) {
            balance -= diff;
            return true;
        }
        return false;
    }
}
