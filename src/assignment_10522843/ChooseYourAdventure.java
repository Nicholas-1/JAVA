
package assignment_10522843;
import java.util.Scanner;

public class ChooseYourAdventure {
    public static void main(String []args){
        Scanner keyboard=new Scanner(System.in);
        String answer1,answer2;
        String answer3;
        System.out.print("WELCOME TO NICK'S TINY ADVENTURE!");
        System.out.println("You are in a creepy house!Would you like to go \"upstairs\" or into the\"kitchen\"?");
        answer1=keyboard.next();
        
        if(answer1.equals("kitchen")){
         System.out.println("There is a long countertop with dirty dishes everywhere.Off to one side \nthere is,as you'd expect,a refrigerator.You may open the \"refrigerator\"or look in a \"cabinet\".");
        answer2=keyboard.next();
        if (answer2.equals("refrigerator")){
            System.out.println("Inside the refrigerator you see food and stuff.It looks pretty nasty.\nWould you like to eat some of the food? (\"yes\" or \"no\")");
           
        }
        answer3=keyboard.next();
        if (answer3.equals("no")){
        System.out.println("You die of starvation... eventually.");
        
        }
    }
        
             if(answer1.equals("upstairs")){
         System.out.println("Upstairs you see a hallway.At the end of the hallway is the master\n\"bedroom\".There is also a \"bathroom\" off the hallway.\nWhere would you like to go?");
        answer2=keyboard.next();
        if (answer2.equals("bedroom")){
            System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.\nThe bed is unmade.  In the back of the room, the closet door is ajar.\nWould you like to open the door?\"yes\" or \"no\"");
           
        }
        answer3=keyboard.next();
        if (answer3.equals("no")){
        System.out.println("Well, then I guess you'll never know what was in there.\nThanks for playing,I'm tired of making nested if statements.");
        
        }
    }
     
        
}}





