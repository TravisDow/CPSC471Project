import java.util.ArrayList;

public class Physical extends Prescription 
{

    private String dateFilled;
    private String datePickedUp;
    
    //constructor without datePickedUp
    public Physical(String physician, String patient, String drug, int prescriptionNo, String dateFilled){
        super(physician, patient, drug,prescriptionNo);
        setDateFilled(dateFilled);
    }
    
    //constructor with datePickedUp
    public Physical(String physician, String patient, String drug, int prescriptionNo, String dateFilled, String datePickedUp){
        super(physician, patient, drug,prescriptionNo);
        setDateFilled(dateFilled);
        setDatePickedUp(datePickedUp);
    }


    public void setDateFilled(String dateFilled){
        this.dateFilled=dateFilled;
    };

    public String getDateFilled(){
        return this.dateFilled;
    };

    public void setDatePickedUp(String datePickedUp){
        this.datePickedUp=datePickedUp;
    };

    public String getDatePickedUp(){
        return this.datePickedUp;
    };

    public boolean releasePrescription(Physical physical){
        return true;
    }; 

    public boolean returnPrescription(Physical physical){
        return true;
    }; 
   
}