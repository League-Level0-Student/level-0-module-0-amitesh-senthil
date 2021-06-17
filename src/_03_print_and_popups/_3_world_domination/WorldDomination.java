package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String coding_skill = JOptionPane.showInputDialog("can you write code");
		// 2. If they say "yes", tell them they will rule the world.
		if (coding_skill.equals("yes")){
			JOptionPane.showInputDialog("you will rule the world");
		}
		// 3. Otherwise, tell them to sign up for classes at The League.
		else {
			JOptionPane.showInputDialog("sign up for classes at the league");
			// https://www.wattpad.com/1047111523-living-together-dnf-old-memories
		}
			

	}
}

