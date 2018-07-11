/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author shazan sattar
 */
public class SetOfRoutes  implements Serializable{
    private Vector<Routes> routes;
    
    public SetOfRoutes(){
    
    routes=new Vector<>();
    }
    public void addRoute(Routes route){
   
       routes.add(route);
       
   }
   
   public void removeRoute(Routes route){
   
       routes.remove(route);
   }
   
   public SetOfRoutes getRoutesFromRNO(String routenumber){
       
       SetOfRoutes filerdroutes=new SetOfRoutes();
       for(Routes route: routes){
       
       if(routenumber.equals(routes.toString())){
       
           filerdroutes.addRoute(route);
       
       }
       }
                    
       return filerdroutes;
   }
   
   public SetOfRoutes FindRoutesFromRNO(String routenumber){
      SetOfRoutes filerdroutes=new SetOfRoutes();
       for(Routes route: routes){
       
       if(routenumber.equals((routes.toString()))){
       
           filerdroutes.addRoute(route);
       
       }
       }
                    
       return filerdroutes;
   
   }
   public Routes[] getAllRoutes() {
        return routes.toArray(new Routes[0]);
    }

    public int getSize() {
        return routes.size();
    }
    

    
}
