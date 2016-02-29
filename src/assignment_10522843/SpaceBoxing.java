package assignment_10522843;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String [] args){
        Scanner keyboard=new Scanner (System.in);
        double weight;
        int PlanetNum;
        double NewWeight;
        
        System.out.print("PLEASE ENTER YOUR CURRENT WEIGHT : ");
        weight=keyboard.nextDouble();
        
        System.out.println("I have information for the following planets");
        System.out.println("1.VENUS\t\t2.MARS\t\t3.JUPITER");
        System.out.println("4.SATURN\t5.URANUS\t6.NEPTUNE");
        
        
        System.out.print("Which planet are youy visiting : ");
        PlanetNum=keyboard.nextInt();
        
        if (PlanetNum==1){
           NewWeight=weight*0.78;
        System.out.print("Your weight would be "+NewWeight+" pounds on that planet");
        
        }
        
        else if(PlanetNum==2){
            NewWeight=weight*0.39;
        System.out.print("Your weight would be "+NewWeight+" pounds on that planet");
        }
        else if(PlanetNum==3){
             NewWeight=weight*2.65;
        System.out.print("Your weight would be "+NewWeight+" pounds on that planet");
        }
        else if(PlanetNum==4){
            
        NewWeight=weight*1.17;
        System.out.print("Your weight would be "+NewWeight+" pounds on that planet");}
  
    
        else if(PlanetNum==5){
    
          NewWeight=weight*1.05;
          System.out.print("Your weight would be "+NewWeight+" pounds on that planet");
}
        else if(PlanetNum==6){
         NewWeight=weight*1.23;
         System.out.print("Your weight would be "+NewWeight+" pounds on that planet");
}
        else
            System.out.print("PLANET NUMBER NOT FOUND");
    
}
}
