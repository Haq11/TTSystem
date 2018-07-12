/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 *
 * @author HaqHfz
 */
public class Users  implements Serializable {

    private String fullname;
    private String email;
    private String city;
    private String username;
    private String password;
    private String type;
    private Double balance;

    public Users(String fullname, String email, String city, String username, String password, String type, Double balance) {

        this.fullname = fullname;
        this.email = email;
        this.city = city;
        this.username=username;
        this.password=password;
        this.type=type;
        this.balance=balance;

    }

    public String fullname() {

        return fullname;
    }

    public String email() {

        return email;
    }

    public String city() {

        return city;
    }
    public String username() {

        return username;
    }
     public String password() {

        return password;
    }
     public String type() {

        return type;
    }
     public Double balance(){
     
         return balance;
     }
    
     public boolean checkPassword(String password){
        return (this.password.equals(password));
    }





    
}
