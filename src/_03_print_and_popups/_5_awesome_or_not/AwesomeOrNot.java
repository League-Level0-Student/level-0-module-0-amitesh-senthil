package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	public static void main(String[] args) {
	// 1. Make a main method that includes everything below

	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
		int random; 
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
		random = ran.nextInt(4);
		// 3. Print your variable to the console
		System.out.println(random);
		// 4. Get the user to enter something that they think is awesome
		String input = JOptionPane.showInputDialog("What do you think is awesome (singular)?");
		// 5. If your variable is  0
	if (random == 0){
			// -- tell the user whatever they entered is awesome!
		System.out.println(input+ " is awesome!");
	}
		// 6. If your variable is  1
	else if (random == 1){
			// -- tell the user whatever they entered is ok.
		System.out.println(input+ " is ok.");
	}
		// 7. If your variable is  2
	else if (random == 2) {
			// -- tell the user whatever they entered is boring.
		System.out.println(input+ " is boring.");
	}
		// 8. If your variable is  3
	else if (random == 3) {
			// -- invent your own message to give to the user (be nice).
		System.out.println("System Error");
	}
}
}