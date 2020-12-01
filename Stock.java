import java.util.ArrayList;

public class Stock extends Drug  
{

    private int amount;   
    
	public static void main(String[] args) {
		System.out.println("Stock Class");  
	}

    public void setAmount(int amount){
        this.amount=amount;
    };

    public int getAmount(){
        return this.amount;
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