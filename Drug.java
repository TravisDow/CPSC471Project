import java.util.ArrayList;

public class Drug extends Manufacturer
{

    private String genericName;
    private String brandName;
    private String dose;
    private int din; 
    private ArrayList<String> intendedEffects; 
    private ArrayList<String> sideEffects; 
    private ArrayList<String> foodIncompatibility; 


	public static void main(String[] args) {
		System.out.println("Drug Class"); 
	}

    public void setGenericName(String genericName){
        this.genericName=genericName;
    };

    public String getGenericName(){
        return this.genericName;
    };

    public void setBrandName(String brandName){
        this.brandName=brandName;
    };

    public String getBrandName(){
        return this.brandName;
    };

    public void setDose(String dose){
        this.dose=dose;
    };

    public String getDose(){
        return this.dose;
    };

    public void setDin(int din){
        this.din=din;
    };
    public int getDin(){
        return this.din;
    };

    public void setIntendedEffects(ArrayList<String> intendedEffects){
        this.intendedEffects=intendedEffects;
    };
    public ArrayList<String> getIntendedEffects(){
        return this.intendedEffects;
    };

    public void setSideEffects(ArrayList<String> sideEffects){
        this.sideEffects=sideEffects;
    };

    public ArrayList<String> getSideEffects(){
        return this.sideEffects;
    };

    public void setFoodIncompatibility(ArrayList<String> foodIncompatibility){
        this.foodIncompatibility=foodIncompatibility;
    };
    
    public ArrayList<String> getFoodIncompatibility(){
        return this.foodIncompatibility;
    };

    public boolean addDrug(){
        return true;
    }; 

    public boolean removeDrug(){
        return true;
    };

    public boolean modifyDrug(){
        return true;
    };    

}