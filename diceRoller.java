package diceRollerProject;

import java.util.*;
import java.lang.Math;
import java.util.Random;

/*
 * This program was conceived after playing Dungeons and Dragons for the first time,
 * and realizing I didn't have my own set of dice to play with.
 * 
 * This program is simply a dice roller and can be used for various board games.
 */
public class diceRoller {
	
	public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);

	        System.out.print("Enter the type of die you need to roll: ");
	        int diceType = scan.nextInt();

	        System.out.print("Enter the number of di you need to roll: ");
	        int diceNum = scan.nextInt();

	       int result = DiceRoll(diceType, diceNum);
	        System.out.print("You rolled: " + result );
	        
	        scan.close();

	  }// end main method
	

	public static int DiceRoll(int a, int b) {
		
		if(b == 1) {
			return (int)(Math.random() * a) + 1;
			
			}// Returns appropriate value if user only intends on using one die.
		
		else {
			
			Random roll = new Random();
			int min = a;
			int max = a * b;
			
	        return roll.nextInt((max - min) + 1) + min;
	        
			}//end else
	        

	 }// end DiceRoller class

}// end class




