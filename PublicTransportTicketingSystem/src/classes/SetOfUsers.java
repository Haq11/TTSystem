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
 * @author HaqHfz
 */
public class SetOfUsers implements Serializable{
     private Vector<Users> users;
    
    public SetOfUsers(){
    
    users=new Vector<>();
    }
    public void addUsers(Users user){
   
       users.add(user);
       
   }
   
   public void removeRoute(Users user){
   
       users.remove(user);
   }
   
   public SetOfUsers getUsersFromUsername(String username){
       
       SetOfUsers filerdusername=new SetOfUsers();
       for(Users user: users){
       
       if(username.equals(user)){
       
           filerdusername.addUsers(user);
       
       }
       }
                    
       return filerdusername;
   }
   
   
   public Users[] getAllUsers() {
        return users.toArray(new Users[0]);
    }

    public int getSize() {
        return users.size();
    }
    

    
     
}

    

