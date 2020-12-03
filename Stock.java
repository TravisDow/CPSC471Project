import java.util.ArrayList;

public class Stock 
{

    private int amount;   
    
    Stock(int amount){
        setAmount(amount);
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