package game.arenas.air;


import game.arenas.Arena;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;
import game.racers.air.AerialRacer;
import utilities.EnumContainer.Height;
import utilities.EnumContainer.Vision;
import utilities.EnumContainer.Weather;
import utilities.EnumContainer.Wind;

/**
 * The AerialArena class represents an arena for aerial racers.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 * @version 1.0
 *
 */
public class AerialArena extends Arena {
	private final static double DEFAULT_FRICTION = 0.4;
	private final static int DEFAULT_MAX_RACERS = 6;
	private final static int DEFAULT_LENGTH = 1500;
	private Vision vision;
	private Weather weather; 
	private Height height; 
	private Wind wind;
	
	/**
	 * Creates a new AerialArena object with the specified length and maximum number of racers.
	 * @param length the length of the AerialArena
	 * @param maxRacers the maximum number of racers for the AerialArena
	 */
	public AerialArena(double length, int maxRacers) {
			
			super(length, maxRacers, DEFAULT_FRICTION);
			setVision(Vision.SUNNY);
			setWeather(Weather.DRY);
			setHeight(Height.HIGH);
			setWind(Wind.HIGH);
			
		}
	/**
	 * Creates a new AerialArena object with the default length and maximum number of racers.
	 */
	public AerialArena() {
		
		this(DEFAULT_LENGTH,DEFAULT_MAX_RACERS);
	}
	
	
	@Override
	/**
	 * Adds a new Aerial Racer to the arena and throws exceptions if the racer is not of the correct type or if the arena is full.
	 * @param newRacer the racer to add.
	 * @throws RacerTypeException if the newRacer is not an instance of AerialRacer.
	 * @throws RacerLimitException if the maximum number of racers has been reached.
	 */
	public void addRacer(Racer newRacer) throws RacerLimitException, RacerTypeException {
		
		if (!(newRacer instanceof AerialRacer)) {
			throw new RacerTypeException(newRacer.className(), "Aerial arena");
		}
		else {
			super.addRacer(newRacer);
		}
	}
	
	/**
	 * Sets the current weather condition in the arena.
	 * @param weather the weather condition to be set.
	 * @return true if the weather was successfully set.
	 */
	public boolean setWeather(Weather weather) {
		
		this.weather = weather;
		return true;
		
	}
	
	/**
	 * Sets the current height condition in the arena.
	 * @param height the height condition to be set.
	 * @return true if the height was successfully set.
	 */
	public boolean setHeight(Height height) {
		
		this.height = height;
		return true;
		
	}
	
	/**
	 * Sets the current wind condition in the arena.
	 * @param wind the wind condition to be set.
	 * @return true if the wind was successfully set.
	 */
	public boolean setWind(Wind wind) {
		
		this.wind = wind;
		return true;
	}
	
	/**
	 * Sets the current vision condition in the arena.
	 * @param vision  the vision condition to be set.
	 * @return true if the vision was successfully set.
	 */
	public boolean setVision(Vision vision) {
		
		this.vision = vision;
		return true;
	}
	
	/**
	 * Returns the current weather condition in the arena.
	 * @return the current weather condition in the arena.
	 */
	public Weather getWeather() {
		
		return weather;	
	}
	
	/**
	 * Returns the current height condition in the arena.
	 * @return the current height condition.
	 */
	public Height getHeight() {
		
		return height;	
	}
	
	/**
	 * Returns the current wind condition in the arena.
	 * @return the current wind condition.
	 */
	public Wind getWind() {
		
		return wind;		
	}
	
	/**
	 * Returns the current vision condition in the arena.
	 * @return the current vision condition.
	 */
	public Vision getVision() {
		
		return vision;	
	}


}
