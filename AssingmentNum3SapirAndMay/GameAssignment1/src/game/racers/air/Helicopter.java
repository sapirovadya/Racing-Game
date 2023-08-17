package game.racers.air;

import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Color;


/**
 * The Helicopter class represents an Helicopter racer in a game.
 * It extends the Racer abstract class and implements the AerialRacer interface.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 *@version 1.0
 */
public class Helicopter extends Racer implements AerialRacer {

	private static final String CLASS_NAME = "Helicopter";
	private static final double DEFAULT_MAX_SPEED = 400;
	private static final double DEFAULT_ACCELERATION = 50;
	private static final Color DEFAULT_color = Color.BLUE;
	
	
	/**
	 * Constructs a new Helicopter object with default values.
	 */
	public Helicopter() {
			
			
			this(CLASS_NAME  + " #"+ getIdn(), DEFAULT_MAX_SPEED, DEFAULT_ACCELERATION, DEFAULT_color);
	}
	
	
	/**
	 * Constructs a new Helicopter object with the given values.
	 * @param name
	 * @param maxSpeed the maximum speed of the Helicopter.
	 * @param acceleration the acceleration of the Helicopter.
	 * @param color
	 */
	public Helicopter(String name, double maxSpeed, double acceleration, Color color) {
		
		super(name, maxSpeed, acceleration, color);
	}
	
	
	public Helicopter(Helicopter other) {
		
	    super(other.getName(), other.getMaxSpeed(), other.getAcceleration(), other.getColor());   
	}
	
	
	/**
	 * Returns the class name of the Helicopter.
	 */
	public String className() {
		
		return getClassName();
	}
	
	
	/**
	 * @return  the class name of the Helicopter.
	 */
	public String getClassName() {
		return CLASS_NAME;
	}
	
	/**
	 * Description of the specific details of the Helicopter.
	 */
	public String describeSpecific() {
		return "";
	}
	
}
