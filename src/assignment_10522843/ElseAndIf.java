package assignment_10522843;



public class ElseAndIf{
public static void main( String[] args )
	{
		int people = 30;
		int cars = 40;
		int buses = 15;
              /*The else if and else provide more secondary options,that is 
              various conditions and their output*/
                
                
		if ( cars > people )
		{
			System.out.println( "We should take the cars." );
		}
	        if ( cars < people ) /*taking away the else treats the else and the if as one if else block thus 
                printing both one of the conditions*/
		{
			System.out.println( "We should not take the cars." );
		}
		else
		{
			System.out.println( "We can't decide." );
		}


		if ( buses > cars )
		{
			System.out.println( "That's too many buses." );
		}
		else if ( buses < cars )
		{
			System.out.println( "Maybe we could take the buses." );
		}
		else
		{
			System.out.println( "We still can't decide." );
		}


		if ( people > buses )
		{
			System.out.println( "All right, let's just take the buses." );
		}
		else
		{
			System.out.println( "Fine, let's stay home then." );
		}

	}
}
    

