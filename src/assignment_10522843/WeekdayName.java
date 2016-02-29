package assignment_10522843;

import java.util.Scanner;

public class WeekdayName {
 public static void main(String[] args){
     Scanner keyboard=new Scanner(System.in);
     
     int num;
     System.out.print("ENTER THE NUMBER OF THE DAY : ");
     num=keyboard.nextInt();
     
     if (num==0||num==7){
         System.out.print("TODAY IS SATURDAY");
     }
     else if(num==1){
         System.out.print("TODAY IS SUNDAY");
     }
     
     else if(num==2){
         System.out.print("TODAY IS MONDAY");
     }
     
      else if(num==3){
         System.out.print("TODAY IS TUESDAY");
     }
      else if(num==4){
         System.out.print("TODAY IS WEDNESDAY");
     }
      else if(num==5){
         System.out.print("TODAY IS THURSDAY");
     }
      else if(num==6){
         System.out.print("TODAY IS FRIDAY");
     }
      else {
         System.out.print("ERROR");
     }
 }    
    
}

