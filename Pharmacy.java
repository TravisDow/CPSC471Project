import java.util.ArrayList;

public class Pharmacy extends Stock  
{

    private String address; //set and get Address
    private String hours;  //set and get Hours

	public static void main(String[] args) {
		System.out.println("Pharmacy Class");  
	}

    public void setAddress(String address){
        this.address=address;
    };
    public String getAddress(){
        return this.address;
    };

    public void setHours(String hours){
        this.hours=hours;
    };

    public String getHours(){
        return this.hours;
    };

    public boolean addPharmacy(Pharmacy Pharmacy){
        return true;
    }; 

    public boolean removePharmacy(Pharmacy Pharmacy){
        return true;
    };

    public boolean modifyPharmacy(Pharmacy Pharmacy){
        return true;
    };    

}