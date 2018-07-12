/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publictransportticketingsystem;

import classes.Routes;
import classes.SetOfCities;
import classes.SetOfRoutes;
import classes.SetOfTokens;
import classes.Stations;
import classes.Tokens;
import interfaces.DynamicTravel;
import publictransportticketingsystem.Journey_Serial;
import javax.swing.JFrame;

/**
 *
 * @author shazan sattar
 */
public class Journey_Final {

    public static void main(String[] args) {
        
        Journey_Serial.loadJourney();
        testsetofcities(); 
        
        Journey_Serial.saveJourney();
        
       //new DynamicTravel().setVisible(true);
        //testsetofBooks();
        //Library_Serial.saveLibrary();
    }

    private static void testsetofcities() {

        SetOfCities cities = Journey_Serial.getJourney().getCities();

        Stations s1 = new Stations(1, "Colombo Fort", 100);
        Stations s2 = new Stations(2, "Slave Island", 100);
        Stations s3 = new Stations(3, "Kollupity", 100);
        Stations s4 = new Stations(4, "Bambalapity", 100);
        Stations s5 = new Stations(5, "Wellawatte", 100);
        Stations s6 = new Stations(6, "Dehiwala", 100);
        Stations s7 = new Stations(7, "Mount Lavinia", 100);
        Stations s8 = new Stations(8, "Rathmalana", 100);
        Stations s9 = new Stations(1, "Angulana", 100);
        Stations s10 = new Stations(1, "Lunawa", 100);
        Stations s11 = new Stations(1, "Moratuwa", 100);

        cities.addStation(s1);
        cities.addStation(s2);
        cities.addStation(s3);
        cities.addStation(s4);
        cities.addStation(s5);
        cities.addStation(s6);
        cities.addStation(s7);
        cities.addStation(s8);
        cities.addStation(s9);
        cities.addStation(s10);
        cities.addStation(s11);
        
        SetOfTokens tokens = Journey_Serial.getJourney().getTokens();

        Tokens t1 = new Tokens(1000, "Shazan Satthar", 100, "Colombo Fort","Moratuwa");
        Tokens t2 = new Tokens(1001, "Shazan Satthar", 100, "Colombo Fort","Panadura");
        Tokens t3 = new Tokens(1002, "Shazan Satthar", 100, "Colombo Fort","Matara");
        Tokens t4 = new Tokens(1003, "Shazan Satthar", 100, "Colombo Fort","Moratuwa");
       

        tokens.addToken(t1);
        tokens.addToken(t2);
        tokens.addToken(t3);
        tokens.addToken(t4);
        

        SetOfRoutes routes = Journey_Serial.getJourney().getRoutes();

        Routes bb1 = new Routes(100, "Colombo Fort", "Moratuwa", 12);
        bb1.addStop("Colombo Fort");
        bb1.addStop("Slave Island");
        bb1.addStop("Kollupity");
        bb1.addStop("Bambalapity");
        bb1.addStop("Wellawatte");
        bb1.addStop("Dehiwala");
        bb1.addStop("Mount Lavinia");
        bb1.addStop("Rathmalana");
        bb1.addStop("Angulana");
        bb1.addStop("Lunawa");
        bb1.addStop("Moratuwa");
        

        routes.addRoute(bb1);

        Routes[] arr1 = routes.getAllRoutes();

        for (Routes route : arr1) {
            System.out.println(route.toString());
        }

        Stations[] arr2 = cities.getAllStations();

        for (Stations station : arr2) {
            System.out.println(station.toString());
        }

    }
}
