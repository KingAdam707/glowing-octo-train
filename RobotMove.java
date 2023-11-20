package csc1025Practical6;
import java.util.Arrays;
import java.util.Scanner;
public class RobotMove {

	/**
	 * PROGRAM THAT MOVES A ROBOT SNOWMAN AROUND
	 * A GRID USING A STRING OF LETTERS AS COMMANDS
	 * @param args
	 */
	public static void main(String[] args) {

		final int GRIDSIZE = 5;// Define the grid size
		int[] robotPosition = {2, 2}; //  Initialize the robot's position
		char robotCharacter ='\u2603'; // Robot character

		// Create a grid map
		char[][] gridMap = new char[GRIDSIZE][GRIDSIZE];

		//Populate the grid with '-'        
    //*******INSERT YOUR CODE HERE************//
		for (int i = 0; i<GRIDSIZE; i++) {
			for(int j = 0; j<GRIDSIZE; j++) {
				gridMap[i][j] = '-';
			}
		}
		
		

		displayMapWithRobot(gridMap, robotCharacter,robotPosition);

		// Example commands for the robot
		//D: Down; U: Up; R: Right; L:Left
		String commands = "UDLR";

		// Simulate the robot's movement
		for (char command : commands.toCharArray()) {
            switch (command) {
                case 'D':
                    if (robotPosition[0] < GRIDSIZE - 1) {
                        gridMap[robotPosition[0]][robotPosition[1]] = '-';
                        robotPosition[0]++;
                        gridMap[robotPosition[0]][robotPosition[1]] = robotCharacter;
                    }
                    break;
                case 'U':
                    if (robotPosition[0] > 0) {
                        gridMap[robotPosition[0]][robotPosition[1]] = '-';
                        robotPosition[0]--;
                        gridMap[robotPosition[0]][robotPosition[1]] = robotCharacter;
                    }
                    break;
                case 'L':
                    if (robotPosition[1] > 0) {
                        gridMap[robotPosition[0]][robotPosition[1]] = '-';
                        robotPosition[1]--;
                        gridMap[robotPosition[0]][robotPosition[1]] = robotCharacter;
                    }
                    break;
                case 'R':
                    if (robotPosition[1] < GRIDSIZE - 1) {
                        gridMap[robotPosition[0]][robotPosition[1]] = '-';
                        robotPosition[1]++;
                        gridMap[robotPosition[0]][robotPosition[1]] = robotCharacter;
                    }
                    break;
                default:
                    System.out.println("Invalid command: " + command);
            }

			// Display the updated map with the robot's position
			displayMapWithRobot(gridMap, robotCharacter,robotPosition);
		}

		// Print the final position of the robot
		
		//*******INSERT YOUR CODE HERE************//
		System.out.println("Final position: (" + robotPosition[0] + ", " + robotPosition[1] + ")");
	}//end main

	/**
	 * Method:  Displays the grid with - for empty spaces and a character for the robot
	 * when the rows and columns match the position of the robot
	 * @param map
	 * @param robotCharacter
	 * @param robotPosition
	 */
	public static void displayMapWithRobot(char[][] map, char robotCharacter,int[] robotPosition) {
		 //*******INSERT YOUR CODE HERE************//
		for (int i = 0; i < map.length; i++) {
	        for (int j = 0; j < map[i].length; j++) {
	            if (i == robotPosition[0] && j == robotPosition[1]) {
	                System.out.printf("%-1c ", robotCharacter);
	            } else {
	                System.out.printf("%-2c ", map[i][j]);
	            }
	        }
	        System.out.println();
	    }
	    System.out.println();
		

 
  
  

	}//end method
}//end class
