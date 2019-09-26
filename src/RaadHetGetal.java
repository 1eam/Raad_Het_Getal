import java.util.Scanner;

public class RaadHetGetal {

	public static void main(String[] args) {

		Scanner textInput = new Scanner(System.in);

		boolean gameWon = false;
		int randomNumber = (int) (Math.random() * 1);
		int round = 2;
		int playerTries = 1;

		if (gameWon == false)
			for (int i = 0; i >= 0; i++) {

				System.out.print("\nraad het getal ");
				int playerInput = textInput.nextInt();

				if (playerInput < randomNumber) {
					playerTries++;
					System.out.println("[Het getal is hoger]");
				}

				else if (playerInput > randomNumber) {
					playerTries++;
					System.out.println("[Het getal is lager]");
				}

				else if (playerInput == randomNumber)
					gameWon = true;

				if (gameWon == true) {// Add Round, reset number of trys
					System.out.println("\n\t\t [  You guessed it!  ]");
					System.out.println("\t\t [It took you " + playerTries + " tries]");

					System.out.println("\n\t\t ~~Enter 1 for rematch~~ \n\t\t ~~Enter 2 for exit~~");

					if (playerInput == 1) {
						System.out.println("\n/// round " + round++ + " \\\\\\");
						playerTries = 1;
						randomNumber = (int) (Math.random() * 1);
						gameWon = false;
					} else if (playerInput == 2) {
						// print keuzemenu
					}
				}
			}
	}
}
//code cleanup
//trying to add try's
//try's stay at 0
