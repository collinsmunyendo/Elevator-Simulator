/**
 * This program uses the Door and Elevator classes to run the elevator
 *
 * @author Collins Munyendo 
 * 
 *
 */

package elevator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunElevator
{
	// method to validate that only int will be entered for the floor number
	public static boolean isValid(String input)
	{
		try
		{
			Integer.parseInt(input);
		} catch (NumberFormatException e)
		{
			return false;
		}
		return true;
	}

	public static void main(String[] args) throws IOException
	{
		// creating new objects of the elevator and door and door respectively
		Elevator elevator = new Elevator();
		Door door = new Door();
		System.out.println("The elevator is on floor " + elevator.getCurrentFloor() + " .");

		// Standard while loop that gets input from the user
		String str;
		int floorNumber = 0;

		// Get input
		System.out.println("Please enter the new floor (Enter to quit): ");
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		str = keyboard.readLine();

		// Processing the input if it is not empty
		while (!str.equals(""))
		{
			// confirming if the string entered can be converted to int
			if (isValid(str))
			{
				// Parsing the string to int ONLY if it is not empty
				floorNumber = Integer.parseInt(str);

				// Checking if the floor number is within only the bottom floor and the maximum
				// floor range;
				// it's an invalid floor otherwise
				if (floorNumber > elevator.getMaxFloor() || floorNumber < elevator.getBottomFloor())
				{
					System.out.println("Invalid floor!");
				}

				else
				{
					// Checking if door is open; then closing it
					if (door.isDoorOpen())
					{
						System.out.println(door.changeStatus());
					}

					// checking to see if the floor number entered by the user is above the current
					// floor; this means the elevator has to go up
					if (floorNumber > elevator.getCurrentFloor())
					{

						for (int i = elevator.getCurrentFloor(); i < (floorNumber - 1); i++)
						{
							System.out.println("Going up to floor " + (i + 1) + ".");
						}
						elevator.setCurrentFloor(floorNumber);
						System.out.println(door.changeStatus() + " at floor " + elevator.getCurrentFloor() + ".");

						System.out.println();
						System.out.println("The elevator is on floor " + elevator.getCurrentFloor() + ".");
					}

					// checking to see if the floor number entered is below the current flow; this
					// means the elevator has to go down
					else if (floorNumber < elevator.getCurrentFloor())
					{
						for (int i = elevator.getCurrentFloor(); i > (floorNumber + 1); i--)
						{
							System.out.println("Going down to floor " + (i - 1) + ".");
						}
						elevator.setCurrentFloor(floorNumber);
						System.out.println(door.changeStatus() + " at floor " + elevator.getCurrentFloor() + ".");

						System.out.println();
						System.out.println("The elevator is on floor " + elevator.getCurrentFloor() + ".");
					}

					// checking to see if the user has entered the floor they are on; the elevator
					// will tell them they are already on the same floor and get prompted again for
					// a new floor
					else if (floorNumber == elevator.getCurrentFloor())
					{
						System.out.println("You are already on floor " + elevator.getCurrentFloor() + ".");
					}
				}

				// Getting input again
				System.out.println("Please enter the new floor (Enter to quit): ");
				str = keyboard.readLine();

				// Parsing the string to int ONLY if it is not empty
				if (!str.equals(""))
				{
					// confirming if the string entered can be converted to int
					if (isValid(str))
					{
						floorNumber = Integer.parseInt(str);
					}
					// Asking the user to enter input again if they did not enter a number
					else
					{
						System.out.println(
								"The floor can ONLY be a NUMBER; Please enter the new floor again (Enter to quit): ");
						str = keyboard.readLine();
					}
				}

			}

			// Asking the user to enter input again if they did not enter a number
			else
			{
				System.out
						.println("The floor can ONLY be a NUMBER; Please enter the new floor again (Enter to quit): ");
				str = keyboard.readLine();
			}

		}

		// Exiting the program and printing bye if the user hits enter
		System.out.println("Bye.");

	}

}
