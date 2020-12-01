import java.util.ArrayList;

public class Manufacturer
{

    private String name;
    private int id;
    
	public static void main(String[] args) {
		System.out.println("Manufacturer Class");
	}

    public void setName(String name){
        this.name=name;
    };

    public String getName(){
        return this.name;
    };

    public void setId(int id){
        this.id=id;
    };
    public int getId(){
        return this.id;
    };

    public boolean addManufacturer(){
        return true;
    }; 

    public boolean removeManufacturer(){
        return true;
    };

    public boolean modifyManufacturer(){
        return true;
    };    

}