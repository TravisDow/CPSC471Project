import java.util.ArrayList;

public class Admin extends Staff  
{

    private String email; //set and get Email
    private int phone; //set and get Aphone

	public static void main(String[] args) {
		System.out.println("Admin Class");  
	}

    public void setEmail(String email){
        this.email=email;
    };
    public String getEmail(){
        return this.email;
    };

    public void setAphone(int phone){
        this.phone=phone;
    };

    public int getAphone(){
        return this.phone;
    };
   
    public boolean addStaff(){
        return true;
    }; 

    public boolean removeStaff(){
        return true;
    };

    public boolean modifyStaff(){
        return true;
    };     

}