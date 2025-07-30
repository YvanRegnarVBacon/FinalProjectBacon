package activity1;

import java.util.Scanner;

public class Activity2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter hourly rate: ");
        float rate = sc.nextFloat();
        System.out.print("Enter total hours worked: ");
        float hours = sc.nextFloat();
        
        System.out.println("---------Wage Summary--------");
        System.out.println("Employee: "+name);
        System.out.println("Hourly Rate: "+rate);
        System.out.println("Hours Worked: "+hours);
        System.out.println("Gross Weekly Wage: "+(hours*rate));
        System.out.printf("SSS Contributios(10%%): %.2f\n", ((hours*rate)*0.1));
        System.out.println("-----------------------------");
        System.out.printf("Net Weekly Wage: %.2f\n\n",((hours*rate)-((hours*rate)*0.1)));
    }
    
}
