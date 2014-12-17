import java.util.Scanner;

/* The number guessing game where this java programme computes the user guessing number based on the user input parameters.*/

public class Main{
	 public static void main (String[] args)
	 {
	     Scanner stdIn = new Scanner(System.in);
	     String entry;           
	     String yn;
	     int guesses = 1;
	     String hl;
	     int guess = 500;                   //starts with 500 and changes based on answers to h/l
	     int lower_bound = 1;               //lowest number
	     int upper_bound = 1000;            //higher number

	     System.out.println("Welcome to the guessing game!");                            //starting dialogue
	     System.out.println("");
	     System.out.println("Think of a number between 1 and 1000");
	     System.out.println("and I'll guess it within 10 tries.");

	     do
	     {
	         System.out.println("Press enter when ready...");                          //by pressing enter the game begins
	         entry = stdIn.nextLine();
	     } while (!(entry.equals("")));
	     do
	     {
	         System.out.println("Guessing between " + lower_bound + " and " + upper_bound);     //updated lower and upper bounds
	         System.out.println("My guess is " + guess);                                        //updated guess is asked
	         System.out.println("is that it (yes/no)");
	         yn = stdIn.nextLine();
	         if (yn.equals("no")) 
	         {
	             guesses++;
	             do
	             {
	                 System.out.println("Is it higher or lower than " + guess + " (higher/lower)");          //updated guess is put in and asks for h/l
	                 hl = stdIn.nextLine();
	             } while (!(hl=="lower") && (hl=="higher"));

	             if (hl.equals("higher"))                                                            //if higher it goes here
	             {
	                 lower_bound=guess;          
	                 lower_bound++;
	             }

	             if (hl.equals("lower"))                                                           //if lower it goes here
	             {
	                 upper_bound=guess;
	                 upper_bound--;
	             }

	             guess=(lower_bound+upper_bound)/2;
	         } 

	     } while (!(yn.equals("yes")));

	     if (yn.equals("yes") || yn.equals("end"));                                                             //if I find the right answer!
	     {
	         System.out.println("I got it in " + guesses + " guesses!");
	     }

	     if (guesses == 10)                                                             
	     {
	         System.out.print("I don't work if you lie to me");
	     }


	 }
}