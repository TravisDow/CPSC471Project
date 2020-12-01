import java.util.ArrayList;

public class Physical extends Prescription 
{

    private String dateFilled;
    private String datePickedUp;
    
	public static void main(String[] args) {
		System.out.println("Physical Class");  
	}

    /*
    public Physical(){
        Physical physical= new Prescription("none", "none", "none", 000);
    }

    public Physical(String physician, String patient, String drug, int prescriptionNo, String dateFilled){
        super.setPhysician(physician);
        super.setPatient(patient);
        super.setDrug(drug);
        super.setPrescriptionNo(prescriptionNo);
        setDateFilled(dateFilled);
    }
    */
    
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