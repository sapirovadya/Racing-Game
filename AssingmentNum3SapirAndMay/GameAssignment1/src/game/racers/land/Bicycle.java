package game.racers.land;

import game.racers.Racer;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.BicycleType;
import game.racers.Wheeled;

/**
 * The Bicycle class represents a bicycle racer in a game.
 * It extends the Racer abstract class and implements the LandRacer interface.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 * @version 1.0
 *
 */
public class Bicycle extends Racer implements LandRacer{
	private final static String CLASS_NAME = "Bicycle";
	private final static int DEFAULT_WHEELS = 2;
	private final static double DEFAULT_MAX_SPEED = 270;
	private final static double DEFAULT_ACCELERATION = 10;
	private final static Color DEFAULT_color = Color.GREEN;
	private Wheeled wheeled;
	private BicycleType type = BicycleType.MOUNTAIN;
	
	
	/**
	 * Constructs a new Bicycle object with default values.
	 */
	public Bicycle() {
		
		this(CLASS_NAME  + " #" + getIdn(),DEFAULT_MAX_SPEED,DEFAULT_ACCELERATION,DEFAULT_color,DEFAULT_WHEELS);
		
		
	}
	
	/**
	 * Constructs a new Bicycle object with the given values.
	 * @param name
	 * @param maxSpeed  the maximum speed of the Bicycle.
	 * @param acceleration the acceleration of the Bicycle.
	 * @param color
	 * @param numOfWheels the number of wheels of the Bicycle.
	 */
	public Bicycle(String name, double maxSpeed, double acceleration, Color color, int numOfWheels) {
		super(name,maxSpeed, acceleration, color);
		this.wheeled = new Wheeled(numOfWheels);
		setBicycleType(type);
	}
	
	public Bicycle(Bicycle other) {
		
	    super(other.getName(), other.getMaxSpeed(), other.getAcceleration(), other.getColor()); 
	    this.wheeled = new Wheeled(other.getWheeled().getNumOfWheels());
	    setBicycleType(other.getBicycleType());
	}
	
	private Wheeled getWheeled() {
		
		return wheeled;
	}

	/**
	 *  Gets the type of the bicycle.
	 * @return the type of the bicycle.
	 */
	public BicycleType getBicycleType() {
		return type;
	}
	
	
	/**
	 * Sets the type of the bicycle.
	 * @param type
	 * @return true if it was set successfully.
	 */
	public boolean setBicycleType(BicycleType type) {
		this.type = type;
		return true;
	}
	
	/**
	 * The name of the class.
	 */
	public String className() {
		
		return getClassName();
	}
	
	/**
	 * 
	 * @return the name of the class.
	 */
	public String getClassName() {
		return CLASS_NAME;
	}
	
	/**
	 * Description of the specific details of the Bicycle.
	 */
	public String describeSpecific() {
		return this.wheeled.describeSpecific() + ", Bicycle Type: " + type;
	
	}
}