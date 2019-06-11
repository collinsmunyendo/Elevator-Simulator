/**
 * This class describes a door
 *
 * @author Collins Munyendo
 * 
 *
 */

package elevator;

public class Door
{
	private doorStatus status;

	public enum doorStatus
	{
		OPEN, CLOSED
	};

	// default constructor for door
	public Door()
	{
		status = doorStatus.OPEN;
	}

	// toString() method to describe the status of the door that is whether it is
	// open or closed
	public String toString()
	{
		return "" + "The door is " + doorStatus.OPEN + " by default";
	}

	// boolean method to check if the door is open
	public boolean isDoorOpen()
	{
		if (status == doorStatus.OPEN)
			return true;
		return false;
	}

	// boolean method to check if the door is closed
	public boolean isDoorClosed()
	{
		if (status == doorStatus.CLOSED)
			return true;
		return false;
	}

	// this method calls the isDoorOpen() and isDoorClosed() methods to check if the
	// door is open or closed and change the status. It returns a message of closing
	// or opening the door
	public String changeStatus()
	{
		String message = "";

		// checks if door is open and closes it; it prints out "Closing door."
		if (isDoorOpen())
		{
			message = "Closing door.";
			status = doorStatus.CLOSED;
		}

		// checks if door is closed and opens it; it prints out "Opening door"
		else if (isDoorClosed())
		{
			message = "Opening door";
			status = doorStatus.OPEN;
		}
		return message;
	}

}
