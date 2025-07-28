package activity1;

import java.util.Scanner;

public class Activity1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        String name;
        int grade =0;
        
        System.out.print("Enter Student name: ");
        name = sc.nextLine();
        
        System.out.print("Enter number of subjects: ");
        int num = sc.nextInt();
        
        for(int i = 1; i <= num; i++){
            
            System.out.print("Enter grade for sub"+i+": ");
            grade += sc.nextInt();
            
        }
        
        float ave = grade / num;
        
        
        System.out.println("Average: "+ave );
        
        if(ave>=74){
            System.out.print("PASSED!!!");
        }else{
            System.out.print("TRY AGAIN NEXT YEAR HAHAHAHAHAHAHA!!!!!");
        }
    }
    
}
