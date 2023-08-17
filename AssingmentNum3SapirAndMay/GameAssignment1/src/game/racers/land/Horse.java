package game.racers.land;

import game.racers.Racer;
import game.racers.air.Helicopter;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.Breed;


/**
 * The Horse class represents a Horse racer in a game.
 * It extends the Racer abstract class and implements the LandRacer interface.
 * @author  Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 * @version 1.0
 */
public class Horse extends Racer implements LandRacer{
	
	private final static String CLASS_NAME = "Horse";
	private final static double DEFAULT_MAX_SPEED = 50;
	private final static double DEFAULT_ACCELERATION = 3;
	private final static Color DEFAULT_color = Color.BLACK;
	private Breed breed = Breed.THOROUGHBRED;
	
	/**
	 * Constructs a new Horse object with default values.
	 */
	public Horse() {
		this(CLASS_NAME  + " #" + getIdn(),DEFAULT_MAX_SPEED,DEFAULT_ACCELERATION,DEFAULT_color);
	}
	
	
	/**
	 * Constructs a new Horse object with the given values.
	 * @param name
	 * @param maxSpeed  the maximum speed of the Horse.
	 * @param acceleration  the acceleration of the Horse.
	 * @param color
	 */
	public Horse(String name, double maxSpeed,double acceleration, Color color) {
		super(name,maxSpeed,acceleration, color);
		setBreed(breed);
	}
	
	public Horse(Horse other) {
		
	    super(other.getName(), other.getMaxSpeed(), other.getAcceleration(), other.getColor()); 
	    setBreed(other.getBreed());
	}
	
	/**
	 * @return the breed of the horse.
	 */
	public Breed getBreed() {
		return breed;
	}

	
	/**
	 * Sets the breed of the horse.
	 * @param breed
	 * @return true if it was set successfully.
	 */
	public boolean setBreed(Breed breed) {
		this.breed = breed;
		return true;
	}
	
	/**
	 * Description of the specific details of the horse.
	 */
	public String describeSpecific() {
		return " ,Breed: " + breed;
	}
	
	
	/**
	 * @return the class name.
	 */
	public String getClassName() {
		return CLASS_NAME;
	}
	
	/**
	 * Returns the class name.
	 */
	public String className() {
		
		return getClassName();
	}
	
}