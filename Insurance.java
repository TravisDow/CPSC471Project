import java.util.ArrayList;

public class Insurance
{

    private String name; 
    private String location;
    
    Insurance(String name, String location){
        setName(name);
        setLocation(location);
    }

    public void setName(String name){
        this.name=name;
    };

    public String getName(){
        return this.name;
    };

    public void setLocation(String location){
        this.location=location;
    };

    public String getLocation(){
        return this.location;
    };
    

    public boolean addInsurance(){
        return true;
    }; 

    public boolean removeInsurance(){
        return true;
    };

    public boolean modifyInsurance(){
        return true;
    };    

}