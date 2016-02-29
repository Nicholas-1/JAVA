package assignment_10522843;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String [] args)
    {
        Scanner keyboard=new Scanner (System.in);
        int choice1;
        int choice2;
        int choice3;
        int count=0;
        
        System.out.println("Are you ready for a quiz?");
        System.out.println("Okay , here it comes ");
        
        System.out.println("Q1)What is the capital of Alaska?");
        System.out.println("\t1)Melbourne\n\t2)Anchorage\n\t3)Juneau");
        choice1=keyboard.nextInt();
        
        if(choice1==3){
            System.out.println("THAT IS CORRECT");
            count+=1;
        }
        else
            System.out.print("INCORRECT ANSWER");
        
        System.out.println("Q2)Can you store the value \"cat\" in a variable of type int?");
        System.out.println("\t1)YES\n\t2)NO");
        choice2=keyboard.nextInt();
        
        if(choice2==2){
            System.out.println("THAT IS CORRECT");
            count+=1;
        }
        else
            System.out.print("Sorry, \"cat\" is a string. ints can only store numbers.");
        
       
    
       System.out.println("Q3)What is the result of 9+6/3?");
       System.out.println("\t1)5\n\t2)11\n\t3)15/3");
       choice3=keyboard.nextInt();
           
        if(choice3==2){
            System.out.println("THAT IS CORRECT");
            count+=1;
        }
        else
            System.out.print("INCORRECT ANSWER");
        
        System.out.print("OVERALL,YOU GOT "+count+" out of 3");
      
  
       

      System.out.print("Thanks for playing!");
   
    } }

    


