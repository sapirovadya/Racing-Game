package game.racers.naval;


import game.racers.Racer;
import game.racers.land.Horse;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.BoatType;
import utilities.EnumContainer.Team;

/**
 * The RowBoat class represents a RowBoat racer in a game.
 * It extends the Racer abstract class and implements the NavalRacer interface.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 * *@version 1.0
 */
public class RowBoat extends Racer implements NavalRacer{
	
	private final static String CLASS_NAME = "RowBoat";
	private final static double DEFAULT_MAX_SPEED = 75;
	private final static double DEFAULT_ACCELERATION = 10;
	private final static Color DEFAULT_color = Color.RED;
	private BoatType type = BoatType.SKULLING;
	private Team team = Team.DOUBLE;
	
	
	/**
	 * Constructs a new RowBoat object with the default values.
	 */
	public RowBoat() {
		this(CLASS_NAME  + " #" + getIdn(),DEFAULT_MAX_SPEED,DEFAULT_ACCELERATION,DEFAULT_color);
	}
	
	/**
	 * Constructs a new RowBoat object with the given values.
	 * @param name
	 * @param maxSpeed  the maximum speed of the RowBoat.
	 * @param acceleration the acceleration of the RowBoat.
	 * @param color
	 */
	public RowBoat(String name, double maxSpeed,double acceleration, Color color) {
		super(name,maxSpeed,acceleration, color);
		setBoatType(type);
		setTeam(team);
	}
	
	
	public RowBoat(RowBoat other) {
		
	    super(other.getName(), other.getMaxSpeed(), other.getAcceleration(), other.getColor()); 
		setBoatType(other.getBoatType());
		setTeam(other.getTeam());
	}

	
	/**
	 * Gets the type.
	 * @return the type.
	 */
	public BoatType getBoatType() {
		return type;
	}
	
	/**
	 * Gets the team.
	 * @return the team.
	 */
	public Team getTeam() {
		return team;
	}
	
	/**
	 * Sets the boat type.
	 * @param type
	 * @return  true, if successful.
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
	 * Description of the specific details of the RowBoat.
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
	 * Returns the class name
	 */
	public String className() {
		
		return getClassName();
	}
	
}

