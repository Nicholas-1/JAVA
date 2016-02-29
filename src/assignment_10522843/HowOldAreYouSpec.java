package assignment_10522843;

import java.util.Scanner;
public class HowOldAreYouSpec {
    
public static void main(String []args) {
    Scanner keyboard=new Scanner(System.in);
    String name;
    int age;
    System.out.print("HEY,WHAT IS YOUR NAME ? (SORRY I KEEP FORGETTING)");
    name=keyboard.next();
    
    System.out.print("Ok,"+name+", how old are you?"); 
    age=keyboard.nextInt();
    
    if(age<16){
        System.out.print("You can't drive.");
     }
    else if(age==16||age==17){
         System.out.print("You can drive but not vote.");
    }
    else if(age>=18&&age<=24){
        System.out.print("You can vote but not rent a car.");
    }
    else if(age>25){
        System.out.print("You can do pretty much anything");
    }
    else
        System.out.print(" ");
}   
}



