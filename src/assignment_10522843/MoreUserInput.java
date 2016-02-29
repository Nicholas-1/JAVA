package assignment_10522843;

import java.util.Scanner;

public class MoreUserInput {
    public static void main (String []args){
        Scanner keyboard=new Scanner(System.in);
    
    String firstname;
    String lastname;
    int grade;
    long id;
    String login;
    double gpa;
    
    System.out.println("Please enter the following information");

    
    System.out.print("WHAT IS YOUR FIRST NAME?");
    firstname=keyboard.next();
     
    System.out.print("WHAT IS YOUR LAST NAME?");
    lastname=keyboard.next();
    
    System.out.print("WHAT IS YOUR GRADE(9-12)?");
    grade=keyboard.nextInt();
    
    System.out.print("WHAT IS YOUR ID NUMBER?");
    id=keyboard.nextLong();
    
    System.out.print("WHAT IS YOUR LOGIN NAME?");
    login=keyboard.next();
    
    System.out.print("WHAT IS YOUR GPA?");
    gpa=keyboard.nextDouble();
    
     System.out.println("Your information:");

	 System.out.println("\tLogin: "+login);
	 System.out.println("\tID: "+id);
	 System.out.println("\tName: "+lastname+","+firstname); 
	 System.out.println("\tGPA: "+gpa);
	 System.out.println("\tGrade: "+grade);
    
}}
