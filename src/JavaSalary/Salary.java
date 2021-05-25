package JavaSalary;

import java.util.Scanner;

public class Salary {
    public static void main(String[]Args){
        double salary = 0.0;
        double rate = 0.0;
        double hoursWorked = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours worked \n");
        hoursWorked = sc.nextDouble();

       System.out.print("Enter rate of pay \n");
        rate = sc.nextDouble();

        salary = hoursWorked * rate;

        System.out.print("Employee salary is " + salary);
    }
}
