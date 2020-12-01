import java.util.ArrayList;

public class Insurance extends Patient 
{

    private String name; //get and set Iname 
    private String location;
    
	public static void main(String[] args) {
		System.out.println("Insurance Class");
	}

    public void setIname(String name){
        this.name=name;
    };

    public String getIName(){
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