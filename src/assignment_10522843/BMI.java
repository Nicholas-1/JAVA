package assignment_10522843;

import java.util.Scanner;

public class BMI {
 public static void main(String []args){
     Scanner keyboard =new Scanner(System.in);
     double height; 
     double weight;
             
     System.out.print("Please enter your height in m: ");
     height=keyboard.nextDouble();
     
     System.out.print("Please enter your weight in kg: ");
     weight=keyboard.nextDouble();


    System.out.print("Your BMI is "+weight/height);
 }    
}
