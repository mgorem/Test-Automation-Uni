package ch3c;

import java.util.Scanner;

/*
NESTED IFS
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String args[]){
        // Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        // Get what we don't know
        System.out.println("Enter your monthly salary: ");
        Scanner scanner = new Scanner(System.in);
        double monthlySalary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer: ");
        double yearsWithEmployer = scanner.nextDouble();
        scanner.close();

        // Make decision
        if(monthlySalary >= requiredSalary){
            if(yearsWithEmployer >= requiredYearsEmployed){
                System.out.println("Congrats! " + " You qualify for a loan");
            }
            else{
                System.out.println("Sorry! " + " You must have worked at your current " +
                        "job for " + requiredYearsEmployed + " years.");
            }
        }
        else{
            System.out.println("Sorry! " + " You must earn at least $ "
                    + requiredSalary + " to qualify for a loan");
        }
    }
}