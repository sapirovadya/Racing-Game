
package factory;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import game.arenas.Arena;
import game.racers.Racer;
import utilities.EnumContainer.Color;


/**
* The RaceBuilder class is responsible for building arenas and racers using reflection.
* @author Sapir Ovadya, id: 318258274
* 			May Zohar, id : 315199810
* @version 1.0
*
*/

public class RaceBuilder {

	private static RaceBuilder instance;

	
	/**
	 * Returns the instance of the RaceBuilder.
	 * @return the RaceBuilder instance.
	 */
	public static RaceBuilder getInstance() {
		if (instance == null) {
			instance = new RaceBuilder();
		}
		return instance;
	}

	private ClassLoader classLoader;
	private Class<?> classObject;
	private Constructor<?> constructor;

	private RaceBuilder() {
		classLoader = ClassLoader.getSystemClassLoader();
	}

	
	
	/**
	 * Builds an Arena object using reflection.
	 * @param arenaType the type of the arena.
	 * @param length the length of the arena.
	 * @param maxRacers The maximum number of racers allowed in the arena.
	 * @return Arena object
	 * @throws ClassNotFoundException if the specified class is not found.
	 * @throws NoSuchMethodException if the specified method is not found.
	 * @throws SecurityException if there is a security violation.
	 * @throws InstantiationException if there is an error while instantiating the class.
	 * @throws IllegalAccessException if there is an error while accessing the specified class or method.
	 * @throws IllegalArgumentException if an illegal argument is passed to the method.
	 * @throws InvocationTargetException if there is an error while invoking the constructor.
	 */
	public Arena buildArena(String arenaType, double length, int maxRacers)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		this.classObject = classLoader.loadClass(arenaType);
		this.constructor = classObject.getConstructor(double.class, int.class);
		return (Arena) this.constructor.newInstance(length, maxRacers);

	}

	/**
	 * Builds a Racer object using reflection.
	 * @param racerType the type of the racer.
	 * @param name 
	 * @param maxSpeed maximum speed of the racer.
	 * @param acceleration the acceleration of the racer.
	 * @param color
	 * @return Racer object.
	 * @throws ClassNotFoundException if the specified class is not found.
	 * @throws NoSuchMethodException if the specified method is not found.
	 * @throws SecurityException if there is a security violation.
	 * @throws InstantiationException if there is an error while instantiating the class.
	 * @throws IllegalAccessException if there is an error while accessing the specified class or method.
	 * @throws IllegalArgumentException if an illegal argument is passed to the method.
	 * @throws InvocationTargetException if there is an error while invoking the constructor.
	 */
	public Racer buildRacer(String racerType, String name, double maxSpeed, double acceleration,
			utilities.EnumContainer.Color color)
			throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		this.classObject = classLoader.loadClass(racerType);
		this.constructor = classObject.getConstructor(String.class, double.class, double.class,
				utilities.EnumContainer.Color.class);
		return (Racer) this.constructor.newInstance(name, maxSpeed, acceleration, color);
	}

	
  /**
  * Builds a Racer object (WheeledRacer) using reflection.
  * @param racerType the type of the racer.
	 * @param name 
	 * @param maxSpeed maximum speed of the racer.
	 * @param acceleration the acceleration of the racer.
  * @param color
  * @param numOfWheels the number of wheels
  * @return WheeledRacer object.
  * @throws ClassNotFoundException if the specified class is not found.
	 * @throws NoSuchMethodException if the specified method is not found.
	 * @throws SecurityException if there is a security violation.
	 * @throws InstantiationException if there is an error while instantiating the class.
	 * @throws IllegalAccessException if there is an error while accessing the specified class or method.
	 * @throws IllegalArgumentException if an illegal argument is passed to the method.
	 * @throws InvocationTargetException if there is an error while invoking the constructor.
  */
	public Racer buildWheeledRacer(String racerType, String name, double maxSpeed, double acceleration, Color color,
			int numOfWheels) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		this.classObject = classLoader.loadClass(racerType);
		this.constructor = classObject.getConstructor(String.class, double.class, double.class,
				utilities.EnumContainer.Color.class, int.class);
		return (Racer) this.constructor.newInstance(name, maxSpeed, acceleration, color, numOfWheels);
	}

}



//package factory;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.InvocationTargetException;
//import game.arenas.Arena;
//import game.racers.Racer;
//import utilities.EnumContainer;
//
///**
// * The RaceBuilder class is responsible for building arenas and racers using reflection.
// * @author Sapir Ovadya, id: 318258274
// * 			May Zohar, id : 315199810
// * @version 1.0
// *
// */
//public class RaceBuilder {
//
//	private static RaceBuilder Instance;
//	private ClassLoader classLoader;
//	private Class<?> classObject;
//	private Constructor<?> constructor;
//
//	
//	/**
//	 * Returns the instance of the RaceBuilder.
//	 * @return the RaceBuilder instance.
//	 */
//	public static RaceBuilder getInstance()
//	{
//		if(Instance==null) 
//			Instance=new RaceBuilder();
//		return Instance;
//	}
//	
//	/**
//	 * Builds an Arena object using reflection.
//	 * @param arenaType the type of the arena.
//	 * @param length the length of the arena.
//	 * @param maxRacers The maximum number of racers allowed in the arena.
//	 * @return Arena object
//	 * @throws ClassNotFoundException if the specified class is not found.
//	 * @throws NoSuchMethodException if the specified method is not found.
//	 * @throws SecurityException if there is a security violation.
//	 * @throws InstantiationException if there is an error while instantiating the class.
//	 * @throws IllegalAccessException if there is an error while accessing the specified class or method.
//	 * @throws IllegalArgumentException if an illegal argument is passed to the method.
//	 * @throws InvocationTargetException if there is an error while invoking the constructor.
//	 */
//	public Arena buildArena(String arenaType,double length,int maxRacers) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
//	{
//	            classLoader = ClassLoader.getSystemClassLoader();
//	            classObject = classLoader.loadClass(arenaType);
//	            constructor = classObject.getConstructor(double.class, int.class);
//	            return (Arena) constructor.newInstance(length, maxRacers);
//
//	
//	}
//
//	
//	/**
//	 * Builds a Racer object using reflection.
//	 * @param racerType the type of the racer.
//	 * @param name 
//	 * @param maxSpeed maximum speed of the racer.
//	 * @param acceleration the acceleration of the racer.
//	 * @param color
//	 * @return Racer object.
//	 * @throws ClassNotFoundException if the specified class is not found.
//	 * @throws NoSuchMethodException if the specified method is not found.
//	 * @throws SecurityException if there is a security violation.
//	 * @throws InstantiationException if there is an error while instantiating the class.
//	 * @throws IllegalAccessException if there is an error while accessing the specified class or method.
//	 * @throws IllegalArgumentException if an illegal argument is passed to the method.
//	 * @throws InvocationTargetException if there is an error while invoking the constructor.
//	 */
//	public Racer buildRacer(String racerType, String name, double maxSpeed, double acceleration, utilities.EnumContainer.Color color) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException,IllegalAccessException, IllegalArgumentException, InvocationTargetException
//    {    
// 
//            classLoader = ClassLoader.getSystemClassLoader();
//            classObject = classLoader.loadClass(racerType);
//            constructor = classObject.getConstructor(String.class, double.class, double.class, utilities.EnumContainer.Color.class);
//            return (Racer) constructor.newInstance(name, maxSpeed, acceleration, color);
//
//    }
//
//    /**
//     * Builds a Racer object (WheeledRacer) using reflection.
//     * @param racerType the type of the racer.
//	 * @param name 
//	 * @param maxSpeed maximum speed of the racer.
//	 * @param acceleration the acceleration of the racer.
//     * @param color
//     * @param numOfWheels the number of wheels
//     * @return WheeledRacer object.
//     * @throws ClassNotFoundException if the specified class is not found.
//	 * @throws NoSuchMethodException if the specified method is not found.
//	 * @throws SecurityException if there is a security violation.
//	 * @throws InstantiationException if there is an error while instantiating the class.
//	 * @throws IllegalAccessException if there is an error while accessing the specified class or method.
//	 * @throws IllegalArgumentException if an illegal argument is passed to the method.
//	 * @throws InvocationTargetException if there is an error while invoking the constructor.
//     */
//    public Racer buildWheeledRacer(String racerType, String name, double maxSpeed, double acceleration, utilities.EnumContainer.Color color, int numOfWheels) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
//	InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//
//            classLoader = ClassLoader.getSystemClassLoader();
//            classObject = classLoader.loadClass(racerType);
//            constructor = classObject.getConstructor(String.class, double.class, double.class, utilities.EnumContainer.Color.class, int.class);
//            return (Racer) constructor.newInstance(name, maxSpeed, acceleration, color, numOfWheels);
//
//    }
//    
//    
//}