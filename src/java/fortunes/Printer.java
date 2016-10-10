package fortunes;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="printer")
@SessionScoped
public class Printer implements Fortune, java.io.Serializable {
    
    private String name;
    private String outlook;
    
    @Override
    public void tellFortune() {
        this.outlook = "Here is your fortune " + this.name;
    }
    
    public String getOutlook(){
        return this.outlook;
    }
    
    public void setOutlook(String outlook) {
        this.outlook = outlook;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
