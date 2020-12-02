import java.util.ArrayList;

public class Prescription 
{

    private String physician;
    private String patient;
    private String drug;
    private int prescriptionNo;  
    
    public Prescription(String physician, String patient, String drug, int prescriptionNo){
        setPhysician(physician);
        setPatient(patient);
        setDrug(drug);
        setPrescriptionNo(prescriptionNo);
    }

    public void setPhysician(String physician){
        this.physician=physician;
    };

    public String getPhysician(){
        return this.physician;
    };

    public void setPatient(String patient){
        this.patient=patient;
    };

    public String getPatient(){
        return this.patient;
    };

    public void setDrug(String drug){
        this.drug=drug;
    };

    public String getDrug(){
        return this.drug;
    };

    public void setPrescriptionNo(int prescriptionNo){
        this.prescriptionNo=prescriptionNo;
    };

    public int getPrescriptionNo(){
        return this.prescriptionNo;
    };

    public boolean addPrescription(){
        return true;
    }; 

    public boolean removePrescription(){
        return true;
    };

    public boolean modifyPrescription(){
        return true;
    };    

}