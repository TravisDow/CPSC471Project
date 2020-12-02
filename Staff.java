import java.util.ArrayList;

public class Staff  
{

    private String name; //set and get Sname
    private String position;  //set and get Position
    private int staffID; //set and get Sid 

    Staff(String name, String position, int staffID){
        setSname(name);
        setPosition(position);
        setSid(staffID);
    }

    public void setSname(String name){
        this.name=name;
    };
    public String getSname(){
        return this.name;
    };

    public void setPosition(String position){
        this.position=position;
    };

    public String getPosition(){
        return this.position;
    };

    public void setSid(int staffID){
        this.staffID=staffID;
    };

    public int getSid(){
        return this.staffID;
    };
   
    public boolean addStock(){
        return true;
    }; 

    public boolean removeStock(){
        return true;
    };

    public boolean modifyStock(){
        return true;
    };     

}