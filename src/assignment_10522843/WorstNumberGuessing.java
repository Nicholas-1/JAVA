
package assignment_10522843;

import java.util.Scanner;

public class WorstNumberGuessing {
 public static void main (String []args){
     Scanner keyboard= new Scanner(System.in);
     
     int Secret_Num=5;
     int num2;
     
     System.out.println("I AM THINKING OF A NUMBER FROM 1-10. TRY TO GUESS!");
     System.out.println("ENTER THE NUMBER YOU GUESSED");
     num2=keyboard.nextInt();
     
     if(num2==Secret_Num){
         System.out.println("WOW , CANT BELIEVE YOU GOT IT RIGHT");
     }
     else
         System.out.println("SHAME ON YOU,THE NUMBER IS "+Secret_Num);
 
 }  
 
}

