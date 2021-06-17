package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int User_Score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		
				// 2.  Ask the user a question 
		String Answer = JOptionPane.showInputDialog("How Many Foot balls can fit in a 5ft by 5ft by 5ft cube");
				// 3.  Use an if statement to check if their answer is correct
		if (Answer.equals("125")){
				// 4.  if the user's answer was correct, add one to their score 
		User_Score +=1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		else {
			User_Score -=1;
		}
		// After all the questions have been asked, tell the user their final score 
		JOptionPane.showInputDialog("Your Score is " +User_Score+ ".");
		
		
		String Answer_2 = JOptionPane.showInputDialog("What is 5ft square have in it");
		// 3.  Use an if statement to check if their answer is correct
		if (Answer_2.equals("nothing")){
		// 4.  if the user's answer was correct, add one to their score 
			User_Score +=1;
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
		// Option: Subtract a point from their score for a wrong answer
		else {
		User_Score -=1;
}
		// After all the questions have been asked, tell the user their final score 
JOptionPane.showInputDialog("Your Score is " +User_Score+ ".");
	
	}
}
