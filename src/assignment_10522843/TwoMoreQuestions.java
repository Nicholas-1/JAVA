package assignment_10522843;

import java.util.Scanner;

public class TwoMoreQuestions {
    public static void main(String []args){
        Scanner keyboard=new Scanner(System.in);
        String answer1;
        String answer2;
        
        System.out.println("THINK OF SOMETHING AND I WILL TRY TO GUESS IT");
     
        System.out.println("Q1.)DOES IT BELONG INSIDE,OUTSIDE OR BOTH?");
        answer1=keyboard.next();
          
        System.out.println("Q.2)IS IT A LIVING THING? ");
        answer2=keyboard.next();
        
        if(answer1.equals("inside")&&answer2.equals("yes")){
        System.out.println("It is definitely a parrot you are thinking of");
    }
        
          if(answer1.equals("inside")&&answer2.equals("no")){
        System.out.println("It is definitely a television you are thinking of");
    }
        
          if(answer1.equals("outside")&&answer2.equals("yes")){
        System.out.println("It is definitely a shark you are thinking of");
    }
          
            if(answer1.equals("outside")&&answer2.equals("no")){
        System.out.println("It is definitely a doorbell you are thinking of");
    }
            
              if(answer1.equals("both")&&answer2.equals("yes")){
        System.out.println("It is definitely a dog you are thinking of");
    }
                if(answer1.equals("both")&&answer2.equals("no")){
        System.out.println("It is definitely a cellphone you are thinking of");
    }
}
}
