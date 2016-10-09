/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fortunes;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Kris Hayes
 */
@Named
@RequestScoped
public class Printer {
    @Inject Fortune fortune;
    
    private String name;
    private String outlook;
    
    public void createOutlook(){
        this.outlook = fortune.tellFortune(name);
    }
    
    public String getOutlook(){
        return outlook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
