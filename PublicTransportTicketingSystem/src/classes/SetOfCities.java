/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.Stations;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author shazan sattar
 */
public class SetOfCities implements Serializable{
    
    private Vector<Stations> stations;
    
    public SetOfCities(){
    
    stations=new Vector<>();
    }
    public void addStation(Stations station){
   
       stations.add(station);
       
   }
   
   public void removeStation(Stations station){
   
       stations.remove(station);
   }
   
   public SetOfCities getStationFromRNO(String routenumber){
       
       SetOfCities filerdstations=new SetOfCities();
       for(Stations station: stations){
       
       if(routenumber.equals(stations.toString())){
       
           filerdstations.addStation(station);
       
       }
       }
                    
       return filerdstations;
   }
   
   public SetOfCities FindStationFromRNO(String stationname){
      SetOfCities filerdstations=new SetOfCities();
       for(Stations station: stations){
       
       if(stationname.equals((stations.toString()))){
       
           filerdstations.addStation(station);
       
       }
       }
                    
       return filerdstations;
   
   }
   public Stations[] getAllStations() {
        return stations.toArray(new Stations[0]);
    }

    public int getSize() {
        return stations.size();
    }
    
}
