
package assignment_10522843;
import java.util.Scanner;

public class GenderGame {
    public static void main(String []args){
   Scanner keyboard=new Scanner(System.in);
   String fname,lname,gname;
   int age;
   String answer1;
   System.out.print("WHAT IS YOUR FIRST NAME? : ");
      fname=keyboard.next();
   System.out.print("WHAT IS YOUR LAST NAME? :");
      lname=keyboard.next();
   System.out.print("WHAT IS YOUR GENDER?(male or female) : ");
      gname=keyboard.next();
   System.out.print("WHAT IS YOUR AGE? : ");   
     age=keyboard.nextInt();

   if (gname.equals("female")){
       if (age>=20){
           System.out.println("Are you married");
          
       }
        answer1=keyboard.next();
        if(answer1.equals("yes")){
            System.out.println("Then I will call you MRS."+fname+" "+lname);
        }
        else 
               System.out.println("Then I will call you MS."+fname+" "+lname);
   }
   
     if (gname.equals("female")){
       if (age<20){
           System.out.println(fname+" "+lname);
          
       }
    }
     
       if (gname.equals("male")){
       if (age>=20){
           System.out.println("Then I will call you MR."+fname+" "+lname);
          
       }
        else 
               System.out.println("Then I will call you "+fname+" "+lname);
   }
}}








