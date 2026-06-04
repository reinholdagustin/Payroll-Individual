/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package payroll.individual;

import java.util.Scanner;

/**
 *
 * @author RR
 */
public class PayrollIndividual {
    
     static Scanner scanner = new Scanner(System.in);
    private static int choice;
    
    public static void main(String[] args) {
        
    System.out.println("Input password");
    
    String password = scanner.nextLine();
    
 

     if (password.equals("12345")){{
     {  System.out.println("Password accepted");
     System.out.println("Enter Username");
      String username = scanner.nextLine();
      if (username.equals("employee")) {System.out.println("Type a Number");
         System.out.println("1. Enter Employee Number");
     System.out.println("2. Exit program"); 
     choice = scanner.nextInt();} else { 
     System.out.println("username null"); 
     }
       
    
   
     
    
     } switch (choice) {
      case 1: 
          System.out.println("Enter employee number");
      String EmpNum = scanner.next();
       if (EmpNum.equals ("645")){ 
           
           System.out.println("Employee Details (Note: Placeholder)");
       } else {
           System.out.println("Incorrect Number");
       }
        
      break;


     
     case 2:
      System.out.println("Program exited");
      break;
      
      default: System.out.println("Invalid choice. Please try again.");
      break;
      }
     }} else { 
     System.out.println("Incorrect Password");
     }}}
         
 
   



   
    
    


      
     
    
 
     
    

    
            
    
    

