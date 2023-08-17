package game.arenas.naval;

import game.arenas.Arena;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;
import game.racers.naval.NavalRacer;
import utilities.EnumContainer.Water;
import utilities.EnumContainer.WaterSurface;
import utilities.EnumContainer.Body;

/**
 * The NavalArena class represents an arena for Naval racers.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 *@version 1.0
 */
public class NavalArena extends Arena{

	private final static double DEFAULT_FRICTION = 0.7;
	private final static int DEFAULT_MAX_RACERS = 5;
	private final static int DEFAULT_LENGTH = 1000;
	private Water water;
	private WaterSurface surface;
	private Body Body;
	
	/**
	 *  Constructs a new NavalArena with the specified length and maximum number of racers.
	 * @param length the length of the arena
	 * @param maxRacers the maximum number of racers allowed in the arena
	 */
	public NavalArena(double length, int maxRacers) {
			
			super(length, maxRacers, DEFAULT_FRICTION);
			setWater(Water.SWEET);
			setSurface(WaterSurface.FLAT);
			setBody(Body.LAKE);
		}
	
	/**
	 * Constructs a new NavalArena with default length and maximum number of racers.
	 */
	public NavalArena() {
		
		this(DEFAULT_LENGTH,DEFAULT_MAX_RACERS);
	}
	
	
	@Override
	/**
	 * Adds a new Naval Racer to the arena and throws exceptions if the racer is not of the correct type or if the arena is full.
	 * @param newRacer the racer to add.
	 * @throws RacerTypeException if the newRacer is not an instance of NavalRacer.
	 * @throws RacerLimitException if the maximum number of racers has been reached.
	 */
	public void addRacer(Racer newRacer) throws RacerLimitException, RacerTypeException {
		
		if (!(newRacer instanceof NavalRacer)) {
			throw new RacerTypeException(newRacer.className(), "Naval arena");
		}
		else {
			super.addRacer(newRacer);
		}
	}
	
	
	/**
	 * Sets the Water for the arena.
	 * @param water  the water in the arena.
	 * @return true if the Water was successfully set.
	 */
	public boolean setWater(Water water) {
		this.water = water;
		return true;
	}
	
	/**
	 * Sets the Surface for the arena.
	 * @param surface of the water in the arena.
	 * @return True if the WaterSurface was successfully set.
	 */
	public boolean setSurface(WaterSurface surface) {
		this.surface = surface;
		return true;
		
	}
	
	/**
	 * Sets the Body object for the arena.
	 * @param Body the body of water in the arena.
	 * @return True if the Body was successfully set,
	 */
	public boolean setBody(Body Body) {
		this.Body = Body;
		return true;
		
	}
	
	/**
	 * Returns the Water object for the arena.
	 * @return the Water object for the arena.
	 */
	public Water getWater() {
		return water;
		
	}
	
	/**
	 * Returns the WaterSurface object for the arena.
	 * @return the WaterSurface 
	 */
	public WaterSurface getSurface() {
		return surface;
		
	}
	
	/**
	 * Returns the Body object for the arena.
	 * @return the Body
	 */
	public Body getBody() {
		return Body;
		
	}
	
	
}
