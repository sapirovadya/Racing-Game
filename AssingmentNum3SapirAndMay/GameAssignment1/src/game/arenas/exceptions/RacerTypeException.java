package game.arenas.exceptions;

/**
 * The RacerTypeException class is an exception that is thrown when an invalid racer type is used in a game arena.
 * @author Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 *@version 1.0
 */
public class RacerTypeException extends Exception 
{
	/**
	 * Constructs a new RacerTypeException with the given class name and the arena name.
	 * @param classN the name of the invalid class that caused the exception.
	 * @param arena the name of the arena where the invalid racer was used.
	 */
	public RacerTypeException(String name ,String arena) 
	{
		super("Invalid Racer of type " + '"' + name +'"' + " for " + arena + '.');
		
	}
}
