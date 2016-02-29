package assignment_10522843;

import java.util.Scanner;

public class BMICategories {
 public static void main(String []args){
     Scanner keyboard=new Scanner(System.in);
     
     double height; 
     double weight;

             
     System.out.print("Please enter your height in m: ");
     height=keyboard.nextDouble();
     
     System.out.print("Please enter your weight in kg: ");
     weight=keyboard.nextDouble();

     double BMI=(weight/height);

    System.out.println("Your BMI : "+BMI);
     System.out.print("BMI CATEGORY : ");
     
    if(BMI<15.0){
        System.out.println("very severely underweight");
    }
    if(BMI==15.0||BMI==16.0){
        System.out.println("severely underweight");
    }
    if(BMI>=16.1&&BMI<=18.4){
        System.out.println("underweight");
    }
    if(BMI>=18.5&&BMI<=24.9){
        System.out.println("normal weight");
    }
    if(BMI>=25.0&&BMI<=29.9){
        System.out.println("overweight");
    }
    if(BMI>=30.0 && BMI<=34.9){
       System.out.println("moderately obese");
 }
    if(BMI>=35.0&&BMI<=39.9){
     System.out.println("severely obese");
     }
     if(BMI>40){   
    System.out.println("very severely (or \"morbidly\") obese"); }
      

 }    
}




