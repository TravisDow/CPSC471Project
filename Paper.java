import java.util.ArrayList;

public class Paper extends Prescription 
{

    private String datePrescribed;
    private String dateReceived;
    
	public static void main(String[] args) {
		System.out.println("Paper Class");  
	}

    public void setDatePrescribed(String datePrescribed){
        this.datePrescribed=datePrescribed;
    };

    public String getDatePrescribed(){
        return this.datePrescribed;
    };

    public void setDateReceived(String dateReceived){
        this.dateReceived=dateReceived;
    };

    public String getDateReceived(){
        return this.dateReceived;
    };

    /*
    public Physical completePrescription(Paper paper){
        String physician=super.getPhysician();
        String patient=super.getPatient();
        String drug=super.getDrug();
        int prescriptionNo=super.getPrescriptionNo();
        String dateFilled= "01-01-01";
        String datePickedUp= "02-01-01";
        Physical physical= new Physical(physician, patient, drug, prescriptionNo);
        return physical;
    }; */ // needs fixing, need to get attributes specific to variable paper 

}