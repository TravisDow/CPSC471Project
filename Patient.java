import java.util.ArrayList;

public class Patient
{

    private int phone; 
    private char sex; 
    private ArrayList<String> name; 
    private ArrayList<String> previousMeds; 

    Patient(int phone, char sex, ArrayList<String> name, ArrayList<String> previousMeds){
        setPhone(phone);
        setSex(sex);
        setName(name);
        setPreviousMeds(previousMeds);
    }

    public void setPhone(int phone){
        this.phone=phone;
    };
    public int getPhone(){
        return this.phone;
    };

    public void setSex(char sex){
        this.sex=sex;
    };

    public char getSex(){
        return this.sex;
    };

    public void setName(ArrayList<String> name){
        this.name=name;
    };
    public ArrayList<String> getName(){
        return this.name;
    };

    public void setPreviousMeds(ArrayList<String> previousMeds){
        this.previousMeds=previousMeds;
    };

    public ArrayList<String> getPreviousMeds(){
        return this.previousMeds;
    };

    public boolean addPatient(){
        return true;
    }; 

    public boolean removePatient(){
        return true;
    };

    public boolean modifyPatient(){
        return true;
    };    

}