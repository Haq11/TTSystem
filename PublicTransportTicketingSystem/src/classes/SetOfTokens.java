/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import classes.Tokens;
import java.io.Serializable;
import java.util.Vector;

/**
 *
 * @author shazan sattar
 */
public class SetOfTokens implements Serializable{
     private Vector<Tokens> tokens;
    
    public SetOfTokens(){
    
    tokens=new Vector<>();
    }
    public void addToken(Tokens token){
   
       tokens.add(token);
       
   }
   
   public void removeRoute(Tokens token){
   
       tokens.remove(token);
   }
   
   public SetOfTokens getRoutesFromTokenNo(String tokennumber){
       
       SetOfTokens filerdtoken=new SetOfTokens();
       for(Tokens token: tokens){
       
       if(tokennumber.equals(tokens.toString())){
       
           filerdtoken.addToken(token);
       
       }
       }
                    
       return filerdtoken;
   }
   
   
   public Tokens[] getAllTokens() {
        return tokens.toArray(new Tokens[0]);
    }

    public int getSize() {
        return tokens.size();
    }
    
}

