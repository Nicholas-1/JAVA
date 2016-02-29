package assignment_10522843;

public class WhatIf
{
	public static void main( String[] args )
	{
		int people = 20;
		int cats = 10;
		int dogs = 15;
                
                /*The if statement affects the code below it by limiting it to a
                specific condition,the code runs only if that condiiton is true*/
                
                
                /*The curly braces aroud the if statement enclose the if statement
                block,that is the code that shouldnrun provided the condition is true*/
                
                
		if ( people < cats )
		{
			System.out.println( "Too many cats!  The world is doomed!" );
		}
                
                people-=15;
                
		if ( people > cats )
		{
			System.out.println( "Not many cats!  The world is saved!" );
		}

		if ( people < dogs )
		{
			System.out.println( "The world is drooled on!" );
		}
                
                people+=15;
                
		if ( people > dogs )
		{
			System.out.println( "The world is dry!" );
		}

		dogs += 5;

		if ( people >= dogs )
		{
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			System.out.println( "People are dogs." );
		}
	}
}
   
   
   
   
   
   
   
   
   
   
   
   
   
