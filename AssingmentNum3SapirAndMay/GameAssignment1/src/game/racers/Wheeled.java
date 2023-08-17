package game.racers;
/**
 * Wheeled object
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 * @version 1.0
 */
public class Wheeled {

	private int numOfWheels;
	
	/**
	 * Constructs a Wheeled object with the specified number of wheels.
	 * @param numOfWheels the number of wheels.
	 */
	public Wheeled(int numOfWheels) {
		
		setNumOfWheels(numOfWheels);
	}
	
	/**
	 * Constructs a Wheeled object with zero wheels.
	 */
	public Wheeled() {
		this.numOfWheels = 0;
	}
	
	
	/**
	 * Returns a string that describes the racer
	 * @return a string that describes the racer
	 */
	public String describeSpecific() {
		
		return " ,Number of Wheels: " + getNumOfWheels();
	}
	
	/**
	 * Sets the number of wheels.
	 * @param numOfWheels the number of wheels
	 * @return  true if the number of wheels is set successfully.
	 */
	public boolean setNumOfWheels(int numOfWheels) {
		
		this.numOfWheels = numOfWheels;
		return true;
	}
	
	/**
	 * Returns the number of wheels.
	 * @return the number of wheels.
	 */
	public int getNumOfWheels() {
		
		return numOfWheels;
	}
	
}
