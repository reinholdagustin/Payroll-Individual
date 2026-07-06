/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.payrollindividualreworked;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author RR
 */
public class PayrollIndividualReworked {
    
     static Scanner scanner = new Scanner(System.in);
    private static int choice;
    
     @SuppressWarnings("empty-statement")
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
     choice = scanner.nextInt();scanner.nextLine();} else { 
     System.out.println("username null"); 
     }
       
    
   
     } switch (choice) {
      case 1: 
         
      
    System.out.println("Type employee number:");
      String inputemployee = scanner.nextLine().trim();
      boolean found = false;

String file = "MotorPH_Employee Data.csv";
       BufferedReader reader = null;
       String line;
       
       try{
      reader=new BufferedReader(new FileReader(file));
      while((line = reader.readLine()) !=null){
          String[] parts = line.split(",");
         String employeeNumber = parts[0];
      
         if (employeeNumber.equals(inputemployee)){
           System.out.println("EMPLOYEE DETAILS:");
           System.out.println ("Employee No:"+ parts[0]);
           System.out.println ("First Name:"+ parts[1]);
          System.out.println ("Last Name:"+ parts[2]);
           System.out.println ("Birthday"+ parts[3]);
            System.out.println ("Salary"+ parts[14]+","+parts[15]);
             System.out.println ("Hourly Rate:"+ parts[24]);
          
          
          found = true;
          break;
         }
      }
       if(!found){
             System.out.println("Employee not found.");
  
      }
        }     
       catch(Exception e){
     }
       finally{
           try{
               if ( reader !=null )
           reader.close();
       }catch(IOException e){
           e.printStackTrace();
       }
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
 
   



