package GuesserGame;

import java.util.Scanner;

public class GuesserGame {

	public static void main(String[] args) {
		int low = Integer.parseInt(args[0]);
		int high = Integer.parseInt(args[1]);
		
		Guesser guesser = new Guesser(low, high);
		guesser.start();
	}

}
