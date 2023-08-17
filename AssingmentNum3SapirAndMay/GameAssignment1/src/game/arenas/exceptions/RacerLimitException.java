package game.arenas.exceptions;



/**
 *The class is an exception that is thrown when trying to add a racer to a full arena.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 * @version 1.0
 *
 */
public class RacerLimitException extends Exception
{

	/**
	 * Constructs a new RacerLimitException with the given serial number and maximum number of racers allowed.
	 * @param serialNumber of each racer
	 * @param maxRacers maximum number of racers allowed in the arena.
	 */
	public RacerLimitException(int serialNumber,int maxRacers)
	{
		super("Arena is full! " + "(" + maxRacers + " active racers exist). racer #" + serialNumber + " was not added");		
	}

}

