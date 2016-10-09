/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunes;

import javax.enterprise.inject.Default;

/**
 *
 * @author Kris Hayes
 */
@Default
public class Fortune implements java.io.Serializable{
    
    Fortune(){
    }
    public String tellFortune(String name){
        return "Hello, today will be a great day for you, " + name;
    }
}
