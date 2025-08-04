package Banking;

public class BankApp {
    
    int accountNo = 100021;
    float initialBalance = 0;
    int pin = 1234;
    
    public boolean verifyAccount(int acc, int pn){
        
        if(acc == accountNo && pn == pin){
            
        return true;
        
        }else{
            
        return false;
        
        }
    }
    
    public int setAccount(){
    return accountNo;
    }
    
    public void viewBalance(){
    
    }

    public boolean verify_account(int acc, int pin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
