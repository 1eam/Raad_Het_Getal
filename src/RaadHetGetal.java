import java.util.Scanner;

public class RaadHetGetal {

	public static void main(String[] args) {

		Scanner textInput = new Scanner(System.in);

		boolean gameWon = false;
		int randomNumber = (int)(Math.random()*3);
		int round = 2;



		if (gameWon == false)
			for (int i = 0; i >= 0; i++){
				int trys = 0 ;
				
				
				System.out.print("\nraad het getal ");
				int playerInput = textInput.nextInt();

				if (playerInput < randomNumber) {
					trys ++;
					System.out.println("[Het getal is hoger]");
				}

				else if (playerInput > randomNumber) {
					trys ++;
					System.out.println("[Het getal is lager]");
				}

				else if (playerInput == randomNumber)
					gameWon = true;

				if (gameWon == true) {
					System.out.println("\n\t\t [Men You guessed it! Whoo...]");
					System.out.println("\t\t [It took you " + trys + " try's]");
					System.out.println("\n/// round " + round++ + " \\\\\\");
					randomNumber = (int)(Math.random()*3);
					gameWon = false;
				}
			}
	}
}
//code cleanup
//trying to add try's
//try's stay at 0
