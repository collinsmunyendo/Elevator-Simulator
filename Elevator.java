/**
 * This class has the attributes of an elevator
 *
 * @author Collins Munyendo
 *
 *
 */


package elevator;

public class Elevator
{
	// declaring the instance variables
	private int maxFloor;
	private int bottomFloor;
	private int currentFloor;
	private Door door;

	// default constructor; setting the default values for the instance variables
	public Elevator()
	{
		maxFloor = 20;
		bottomFloor = 0;
		currentFloor = bottomFloor;
		door = new Door();
	}

	// elevator constructor that accepts arguments
	public Elevator(int maxFloor_, int bottomFloor_, int currentFloor_)
	{
		maxFloor = maxFloor_;
		bottomFloor = bottomFloor_;
		currentFloor = currentFloor_;
	}

	// toString() method to describe the variables
	public String toString()
	{
		return "" + "The maximum floor is: " + maxFloor + ", the bottom floor is: " + bottomFloor
				+ " and the current floor is: " + currentFloor + ".";
	}

	// getter methods for the private variables
	public int getMaxFloor()
	{
		return maxFloor;
	}

	public int getBottomFloor()
	{
		return bottomFloor;
	}

	public int getCurrentFloor()
	{
		return currentFloor;
	}

	public Door getDoor()
	{
		return door;
	}

	// setter methods for the private variables
	public void setMaxFloor(int mFloor)
	{
		this.maxFloor = mFloor;
	}

	public void setBottomFloor(int bFloor)
	{
		this.bottomFloor = bFloor;
	}

	public void setCurrentFloor(int cFloor)
	{
		this.currentFloor = cFloor;
	}

	public void setDoor(Door door_)
	{
		this.door = door_;
	}
}
