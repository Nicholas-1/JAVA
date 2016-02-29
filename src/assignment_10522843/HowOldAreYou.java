package assignment_10522843;

import java.util.Scanner;
public class HowOldAreYou {
    public static void main(String [] args){
        Scanner keyboard =new Scanner (System.in);
        int age;
        String name;
        
        System.out.print("Hey,what is your name? ");
        name=keyboard.next();
        
        System.out.print("OK, "+name+", how old are you? ");
        age=keyboard.nextInt();
        
        if(age<16){
           System.out.println("You can't drive.");
        }
        if(age<18){
           System.out.println("You can't vote.");
        }
        if(age<25){
           System.out.println("You can't rent a car.");
        }
        if(age>=25){
            System.out.println("You can do anything that's legal.");
        }
    }
    
}
