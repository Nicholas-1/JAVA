package assignment_10522843;
 import java.util.Scanner;

public class TwentyQuestions {
    public static void main(String []args){
   Scanner keyboard =new Scanner(System.in);         
   String answer1;
   String answer2;
   
   System.out.print("TWO QUESTIONS!");
   System.out.println("Think of something, and I'll try to guess it");
   
   System.out.println("Question 1) Is it an animal, a vegetable, or a mineral?");
   answer1=keyboard.next();
  
   System.out.println("Question 2) Is it bigger than a breadbox?");
   answer2=keyboard.next();

   if(answer1.equals("animal")){ 
     if (answer2.equals("yes")){
         System.out.println("YOU ARE THINKING OF AN ELEPHANT");
     }
     if(answer2.equals("no")){
       System.out.println("YOU ARE THINKING OF A MOUSE");
   } 
   }
   
    if(answer1.equals("vegetable")){ 
     if (answer2.equals("yes")){
         System.out.println("YOU ARE THINKING OF A WATERMELON");
     }
     if(answer2.equals("no")){
       System.out.println("YOU ARE THINKING OF AN ORANGE");
   } 
   }
    
     if(answer1.equals("mineral")){ 
     if (answer2.equals("yes")){
         System.out.println("YOU ARE THINKING OF A ROCK");
     }
     if(answer2.equals("no")){
       System.out.println("YOU ARE THINKING OF DIAMOND");
   } 
   }
    

}


}









