/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package tangpos;

import java.util.Scanner;

public class tangpos{
   
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            boolean running = true;
            
            while (running) {
                System.out.println("\nChoose an option:");
                System.out.println("1. Receipt");
                System.out.println("2. Salary");
                System.out.println("3. Account Management");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                int choice = input.nextInt();
                input.nextLine();
                
                
                if (choice == 1) {
                    System.out.println("----- Receipt -----");
                    receipt rc = new receipt();
                    rc.getreceipt(input);
                } else if (choice == 2) {
                    System.out.println("----- Salary -----");
                    Salary salaryManager = new Salary();
                    salaryManager.getSalary(input);
                } else if (choice == 3) {
                    System.out.println("----- Account -----");
                    Account accountManager = new Account();
                    accountManager.addAccounts(input);
                } else if (choice == 4) {
                    running = false;
                } else {
                    System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }
}