import java.util.ArrayList;

public class Paper extends Prescription 
{

    private String datePrescribed;
    private String dateReceived;
    
    Paper(String physician, String patient, String drug, int prescriptionNo, String datePrescribed, String dateReceived){
        super(physician, patient, drug,prescriptionNo);
        setDatePrescribed(datePrescribed);
        setDateReceived(dateReceived);
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

    public Physical completePrescription(Paper paper){
        String physician=paper.getPhysician();
        String patient=paper.getPatient();
        String drug=paper.getDrug();
        int prescriptionNo=paper.getPrescriptionNo();
        String dateFilled= paper.getDateReceived(); //may have to change 
        Physical physical= new Physical(physician, patient, drug, prescriptionNo, dateFilled);
        return physical;
    } 

}