package game.racers.naval;

import game.racers.Racer;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.BoatType;
import utilities.EnumContainer.Team;

/**
 * The SpeedBoat class represents a SpeedBoat racer in a game.
 * It extends the Racer abstract class and implements the NavalRacer interface.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 *@version 1.0
 */
public class SpeedBoat extends Racer implements NavalRacer{
	
	private final static String CLASS_NAME = "SpeedBoat";
	private final static double DEFAULT_MAX_SPEED = 170;
	private final static double DEFAULT_ACCELERATION = 5;
	private final static Color DEFAULT_color = Color.RED;
	private BoatType type = BoatType.SKULLING;
	private Team team = Team.DOUBLE;
	
	
	/**
	 * Constructs a new SpeedBoat object with the default values.
	 */
	public SpeedBoat() {
		this(CLASS_NAME  + " #" + getIdn(),DEFAULT_MAX_SPEED,DEFAULT_ACCELERATION,DEFAULT_color);
	}
	
	
	/**
	 * Constructs a new SpeedBoat object with the given values.
	 * @param name
	 * @param maxSpeed  the maximum speed of the SpeedBoat.
	 * @param acceleration the acceleration of the SpeedBoat.
	 * @param color
	 */
	public SpeedBoat(String name, double maxSpeed,double acceleration, Color color) {
		super(name,maxSpeed,acceleration, color);
		setBoatType(type);
		setTeam(team);
	}
	
	
	public SpeedBoat(SpeedBoat other) {
		
	    super(other.getName(), other.getMaxSpeed(), other.getAcceleration(), other.getColor()); 
		setBoatType(other.getBoatType());
		setTeam(other.getTeam());
	}
	
	
	/**
	 * 
	 * @return
	 */
	public BoatType getBoatType() {
		return type;
	}
	
	/**
	 * 
	 * @return
	 */
	public Team getTeam() {
		return team;
	}
	
	/**
	 * Sets the type.
	 * @param type
	 * @return true if it was set successful
	 */
	public boolean setBoatType(BoatType type) {
		this.type = type;
		return true;
	}
	
	
	/**
	 * Sets the team.
	 * @param team
	 * @return true if it was set successful
	 */
	public boolean setTeam(Team team) {
		this.team = team;
		return true;
	}
	
	/**
	 * Description of the specific details of the SpeedBoat.
	 */
	public String describeSpecific() {
		return ", Type: " + type + ", Team: " + team;
	}
	
	
	/**
	 * Gets the class name.
	 * @return the class name
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
