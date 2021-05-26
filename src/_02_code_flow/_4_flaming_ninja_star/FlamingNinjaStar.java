package _02_code_flow._4_flaming_ninja_star;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 200;		//the size of the black part of the star
		int flameSize = 130;		//the length of the flaming arms
		
		// Make a new robot, and set it's pen down.
		Robot Ninja_Noah = new Robot();
		Ninja_Noah.penDown();
		Ninja_Noah.setPenWidth(10);
		// Set the robot speed to 100
		Ninja_Noah.setSpeed(100);
		// Set the robot window size to 800 x 800
		Ninja_Noah.setWindowSize(1200, 1000);
		//  COUNT. Make another int variable to count how many times the loop has repeated
		//         Set its start value to zero.
		int count = 0;
	       //  LOOP. Start a while loop to repeat all of the code below ONE time (we will change this later)
		while ( count < 3 ) {
			Ninja_Noah.setPenColor(Color.black);  
			// TURN RIGHT     Turn the robot 1/8 of a circle (hint: 360 degrees will turn a full circle)
			Ninja_Noah.turn(360/8);
			   // MOVE           Move the robot 64 pixels
			Ninja_Noah.move(64);
			   // TURN LEFT      Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			Ninja_Noah.turn(-40);
			   // DRAW FLAME     Move the robot the distance in the variable flameSize
			Ninja_Noah.setPenColor(Color.orange);
			Ninja_Noah.move(flameSize);	
				//               Turn the robot 170 degrees
			Ninja_Noah.turn(170);
				//               Move the robot the distance in the variable flameSize (again)
			Ninja_Noah.move(flameSize);
			   // TURN RIGHT     Turn the robot 64 degrees to the right
			Ninja_Noah.setPenColor(Color.black);
			Ninja_Noah.turn(64);
				// MOVE         Move the robot the distance in the variable baseSize
			Ninja_Noah.move(baseSize);
				//  INCREASE COUNT. Increase the count by 1
			count +=1;
		//  End the while loop here
		}
		// TEST   Run the program. Check that your shape is the same as the first picture in the recipe. 
		//        This is one arm of the ninja star.
		
		// COLOR  Change the Robot's pen color so that the flame is a different color to the rest of the star.
		//        Run the program again. Check the second picture in the recipe.

		// LOOP   When you have one arm looking right, change your loop to repeat 25 times and run the program.
		
	}
}
