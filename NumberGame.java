/*Number game
  1.Generate a random number within a specified range,such as 1 to 100
  2.Prompt the user to enter their guess for the generated number
  3.Compare the users guess with the generated number and provide feedback on whether the guess is correct,
    too high,or too low.
  4.Repeat steps 2 and 3 until the user guesses the correct number.


  */

  import java.util.*;
  import java.lang.*;
  class NumberGame
  {
  	static Scanner sc = new Scanner(System.in);
  	static int generatedNo;
  	public static void main(String[] args)
  	{
  		System.out.println("You want to play the game : ");
  		System.out.println("If you want to play then click on yes");
  		System.out.println("Otherwise click on No");                                   
  		System.out.print("Enter your option : ");
  		String str = sc.next();
  		int score = 100;
  		int attempt =0;
  		switch(str)
  		{
  			case "yes" :System.out.println("Lets Start");
  			         System.out.println("You have only 4 chances for guessing");
  			         System.out.println();
  			         generatedNo = generateRandomNo();
  			         for(int i=0;i<=4;i++)
			  		{
			  			System.out.print("Take Your guess : ");
			  			int userGuess = sc.nextInt();
			  			if(userGuess==generatedNo)
			  			{
			  				attempt++;
			  				System.out.println("Your guessed correctly!");
			  				System.out.println("Score : 100");
			  				//System.out.println("Score : "+score);
			  				System.out.println("Attempt : "+attempt);

			  				System.out.println();

			  				break;
			  			}
			  			else if(userGuess<generatedNo)
			  			{
			  				//If the user  guessed answer lower than the answer
			  				score--;
			  				attempt++;
			  				System.out.println("Ohh Sorry! Your guess is too low!");
			  				System.out.println("Score : "+score);
			  				System.out.println("Attempt : "+attempt);
			  				System.out.println();
			  			}
			  			else if(userGuess>generatedNo)
			  			{
			  				//If the user guessed answer gretaer than the answer
			  				score--;
			  				attempt++;
			  				System.out.println("OHH! Your guess is too high!");
			  				System.out.println("Score : "+score);
			  				System.out.println("Attempt : "+attempt);
			  				System.out.println();
			  			}
			  			//User have only 4 chances otherwise game will tereminated
			  			if(i>=4)
			  			{
			  				//if the user gets the answer wrong too many times
			  				score--;
			  				attempt++;
			  				System.out.println();
			  				System.out.println("NOPE.The number I was thinking of was "+generatedNo + " !");
			  				
			  			}
			  		}
			  		break;

			case "No" :System.out.println("OHK!");
  		}
  							System.out.println("Score : "+score);
			  				System.out.println("Attempt : "+attempt);
			  				System.out.println("Number : "+generatedNo);
  	}
  	public static int generateRandomNo()
  	{
  		System.out.print("Enter a range :");
  		int max = sc.nextInt();
  		int min = sc.nextInt();
  		//Generate a random number
  		return (min+(int)(Math.random()*((max-min)+1)));
  	}
  }
