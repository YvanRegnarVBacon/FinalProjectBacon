
package activity1;

import java.util.Scanner;
import Banking.BankApp;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        BankApp bank = new BankApp();
        int attemp = 3;
        
        System.out.println("WELCOME TO MY SYSTEM! ");
        System.out.println("What do you fell like doing today?");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");
        
        System.out.print("Enter your choice : ");
        int choice = in.nextInt();
        
            switch( choice ){
                case 1:
                    while( attemp != 0 ){
                        
                        System.out.print("Enter Account No : ");
                        int acc = in.nextInt();

                        System.out.print("Enter Pin No : ");
                        int pin = in.nextInt();

                            if (bank.verifyAccount(acc, pin)){
                                System.out.println("Login Success!");
                                System.exit(0);
                            }
                            else{
                                attemp--;
                                System.out.println("Invalid Account No or Pin! Left attemp " + attemp);
                                
                            }
                            
                            if ( attemp == 0 ){
                                System.out.println("Try Again later!");
                            }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                
            }
    }
}