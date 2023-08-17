package game.racers.air;

import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Color;

/**
 * The Airplane class represents an Airplane racer in a game.
 * It extends the Racer abstract class and implements the AerialRacer interface.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 *@version 1.0
 */
public class Airplane extends Racer implements AerialRacer{

	private static final String CLASS_NAME = "Airplane";
	private static final int DEFAULT_WHEELS = 3;
	private static final double DEFAULT_MAX_SPEED = 885;
	private static final double DEFAULT_ACCELERATION = 100;
	private static final Color DEFAULT_color = Color.BLACK;
	private Wheeled wheeled;

	/**
	 * Constructs a new Airplane object with default values
	 */
	
	public Airplane() {
		
		
		this(CLASS_NAME + " #" + getIdn(), DEFAULT_MAX_SPEED, DEFAULT_ACCELERATION, DEFAULT_color,
				DEFAULT_WHEELS);
	}
	
	/**
	 * Constructs a new Airplane object with the given values.
	 * @param name
	 * @param maxSpeed  the maximum speed of the Airplane.
	 * @param acceleration the acceleration of the Airplane.
	 * @param color
	 * @param numOfWheels the number of wheels of the Airplane.
	 */
	public Airplane(String name, double maxSpeed, double acceleration, Color color, int numOfWheels) {
		
		super(name, maxSpeed, acceleration, color);
		this.wheeled = new Wheeled(numOfWheels);
	}
	
	///////////////////////////////////////////////////////////
	public Airplane(Airplane other) {
		
	    super(other.getName(), other.getMaxSpeed(), other.getAcceleration(), other.getColor());
	    this.wheeled = new Wheeled(other.getWheeled().getNumOfWheels());
	}
	
	
	///////////////////////////////////////////////////////////
//    public Airplane clone() {
//    	Airplane cloned = new Airplane();
//        cloned.setName(this.getName());
//        cloned.setMaxSpeed(this.getMaxSpeed());
//        cloned.setAcceleration(this.getAcceleration());
//        cloned.setColor(this.getColor());
//        return cloned;
//    }
//	
//	public void upgrade() {
//		
//	}
	
	///////////////////////////////////////////////////////
	
//    public Airplane clone() {
//        try {
//            Airplane cloned = (Airplane) super.clone();
//            // Clone the wheeled object
//            cloned.setWheeled(this.wheeled.clone());
//            return cloned;
//        } catch (CloneNotSupportedException e) {
//            // Handle the exception (e.g., log an error, throw a runtime exception, etc.)
//            return null;
//        }
//    }
	
	
	
	//////////////////////////////////////////////////////
	
	/**
	 * Returns the class name of the Airplane.
	 */
	public String className() {
		
		return getClassName();
	}
	
	/**
	 * @return the class name of the Airplane.
	 */
	public String getClassName() {
		return CLASS_NAME;
	}

	/**
	 *  Returns the Wheeled object of the Airplane.
	 * @return the Wheeled object of the Airplane.
	 */
	public Wheeled getWheeled() {
		return wheeled;
	}

	
	/**
	 * Sets the Wheeled object of the Airplane.
	 * @param wheeled
	 * @return true if the Wheeled object was set successfully.
	 */
	public boolean setWheeled(Wheeled wheeled) {
		if(wheeled != null) {
			this.wheeled = wheeled;
			return true;
		}
		return false;
	}

	
	/**
	 * Description of the specific details of the Airplane.
	 */
	public String describeSpecific() {
		return this.wheeled.describeSpecific();
		
	}
}
