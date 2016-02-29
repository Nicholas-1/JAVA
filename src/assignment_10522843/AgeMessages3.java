package assignment_10522843;

import java.util.Scanner;

public class AgeMessages3 {
    
public static void main (String []args){
    Scanner keyboard = new Scanner(System.in);
    String name;
    int age;
    System.out.println("WHAT IS YOUR NAME?");
    name=keyboard.next();
    
    System.out.println("HOW OLD ARE YOU");
    age=keyboard.nextInt();
    
    System.out.println("YOUR NAME :"+name);
    System.out.println("YOUR AGE : "+age);
    
    if(age<16){
        System.out.print("You can't drive.");
    }
    if (age==16||age==17){
        System.out.print("You can drive but not vote.");
    }
     if (age>18&&age<=24){
        System.out.print("You can vote but not rent a car.");
    }
    if (age>=25){
        System.out.print("You can do pretty much everything");
}}}
 

