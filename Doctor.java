import java.util.ArrayList;

public class Doctor
{

    private String name; //set and get Dname
    private String location;  //set and get Dlocation
    private int doctorId; //set and get Did 

    Doctor(String name, String location, int doctorId){
        setDname(name);
        setDlocation(location);
        setDid(doctorId);
    }

    public void setDname(String name){
        this.name=name;
    };
    public String getDname(){
        return this.name;
    };

    public void setDlocation(String location){
        this.location=location;
    };

    public String getDlocation(){
        return this.location;
    };

    public void setDid(int doctorId){
        this.doctorId=doctorId;
    };

    public int getDid(){
        return this.doctorId;
    };
   
    public boolean addDoctor(String name, String location, int doctorId){
        return true;
    }; 

    public boolean removeDoctor(){
        return true;
    };

    public boolean modifyDoctor(){
        return true;
    };    

}