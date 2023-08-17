package game.arenas.land;

import game.arenas.Arena;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;
import game.racers.land.LandRacer;
import utilities.EnumContainer.Coverage;
import utilities.EnumContainer.LandSurface;

/**
 * The LandArena class represents an arena for land racers.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 *@version 1.0
 */
public class LandArena extends Arena {

	private final static double DEFAULT_FRICTION = 0.5;
	private final static int DEFAULT_MAX_RACERS = 8;
	private final static int DEFAULT_LENGTH = 800;
	private Coverage coverage;
	private LandSurface surface;
	
	/**
	 * Constructs a new LandArena with default length and maximum number of racers.
	 */
	public LandArena() {
		
		this(DEFAULT_LENGTH,DEFAULT_MAX_RACERS);
	}
	
	/**
	 *  Constructs a new LandArena with the specified length and maximum number of racers.
	 * @param length the length of the arena
	 * @param maxRacers the maximum number of racers allowed in the arena
	 */
	public LandArena(double length, int maxRacers) {
		
		super(length, maxRacers, DEFAULT_FRICTION);
		setCoverage(Coverage.GRASS);
		setSurface(LandSurface.FLAT);

	}

	
	@Override
	/**
	 * Adds a new Land Racer to the arena and throws exceptions if the racer is not of the correct type or if the arena is full.
	 * @param newRacer the racer to add.
	 * @throws RacerTypeException if the newRacer is not an instance of LandRacer.
	 * @throws RacerLimitException if the maximum number of racers has been reached.
	 */
	public void addRacer(Racer newRacer) throws RacerLimitException, RacerTypeException {
		
		if (!(newRacer instanceof LandRacer)) {
			throw new RacerTypeException(newRacer.className(), "Land arena");
		}
		else {
			super.addRacer(newRacer);
		}
	}
	
	/**
	 * Sets the coverage of the arena's surface.
	 * @param coverage he type of coverage of the arena's surface
	 * @return true if the coverage was set successfully
	 */
	public boolean setCoverage(Coverage coverage) {
		this.coverage = coverage;
		return true;
		
	}
	
	/**
	 * Sets the type of surface of the arena.
	 * @param surface type of surface of the arena.
	 * @return true if the surface was set successfully.
	 */
	public boolean setSurface(LandSurface surface) {
		this.surface = surface;
		return true;
		
	}

	/**
	 * Returns the type of coverage of the arena's surface.
	 * @return the type of coverage of the arena's surface
	 */
	public Coverage getCoverage() {
		return coverage;
		
	}
	
	/**
	 * Returns the type of surface of the arena.
	 * @return the type of surface of the arena.
	 */
	public LandSurface getSurface() {
		return surface;
		
	}


}
