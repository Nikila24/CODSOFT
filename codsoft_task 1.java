import java.util.Scanner;

public class Numgame {
	public static void guessingNumber()
	{
		Scanner sc = new Scanner(System.in);
		int mini=1;
		int maxi=100;
		int round=0;
		int totscore=0;
		int x = 3;
		int i, guess;
		System.out.println("welcome to Number Guessing Game!");
		do
		{
		int number = mini + (int)(maxi * Math.random());

	    System.out.println("Round"+(round+1)+":guess the number between "+mini+"and "+maxi);
		for (i = 0; i < x; i++) {

			System.out.println("Guess the number:");
			guess = sc.nextInt();
			if (number == guess) {
				System.out.println("Congratulations!"+ " You guessed the correct number in"+i+"attempts.\n");
				break;
			}
			else if (number > guess	&& i != x - 1) {
				System.out.println("Too high. Try again.");
			}
			else if (number < guess 	&& i != x - 1) {
				System.out.println("Too low. Try again.");
			}
		}
        if (i == x-1) {
			System.out.println("Sorry,you reached the maximum attemps.The correct number was:"+number+"\n");
		}
	System.out.print("Do you want to play again?(yes/no):");
	String replay=sc.next();
    if(replay.equalsIgnoreCase("no"))
	{
		System.out.println("Thanks for playing! your total score is:"+totscore);
		break;
	}
	else{
		round++;
	}
}while(true);
sc.close();
	}
	public static void main(String arg[])
	{
     guessingNumber();
	}
}



