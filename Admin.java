import java.util.ArrayList;

public class Admin extends Staff  
{

    private String email; //set and get Email
    private int phone; //set and get Phone

    Admin(String name, String position, int staffID, String email, int phone){
        super(name,position,staffID);
        setEmail(email);
        setPhone(phone);
    }

    public void setEmail(String email){
        this.email=email;
    };
    public String getEmail(){
        return this.email;
    };

    public void setPhone(int phone){
        this.phone=phone;
    };

    public int getPhone(){
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