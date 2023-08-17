package utilities;


/**
 * The Point class represents a point with 2 coordinates.
 * @author   Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 * @version 1.0
 */
public class Point {

	
	public static final int MAX_X = 1000000;
    public static final int MIN_X = 0;
    public static final int MAX_Y = 800;
    public static final int MIN_Y = 0;
    private double x;
    private double y;

    /**
     * Constructs a Point object with the given x and y coordinates.
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a Point object with default values for the x and y coordinates.
     */
    public Point() {
        this(0, 0);
    }

    
    /**
     * Constructs a Point object that is a copy of the specified Point object.
     * @param point
     */
    public Point(Point point) {
        this(point.x, point.y);
    }

    /**
     * Returns a string representation of the Point object.
     */
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    /**
     * Gets the value of the x coordinate.
     * @return the value of the x coordinate.
     */
    public double getX() {
        return x;
    }

    /**
     * Sets the value of the x coordinate.
     * @param x
     */
    public boolean setX(double x) {
        this.x = x;
        return true;
    }

    /**
     * Gets the value of the y coordinate.
     * @return the value of the y coordinate.
     */
    public double getY() {
        return y;
    }

    /**
     * Sets the value of the y coordinate.
     * @param y
     */
    public boolean setY(double y) {
        this.y = y;
        return true;
    }
	
	
}
