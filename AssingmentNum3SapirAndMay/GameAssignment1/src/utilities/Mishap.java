package utilities;

import java.text.DecimalFormat;

/**
 * he Mishap class represents a mishap that can occur during a game.
 * @author   Sapir Ovadya, id: 318258274
 * 			May Zohar, id : 315199810
 * @version 1.0
 */
public class Mishap {

	private boolean fixable;
	private double reductionFactor;
	private int turnsToFix;
	
	
	/**
	 * Constructs a new Mishap object with the given values.
	 * @param fixable  a boolean value indicating if the mishap is fixable
	 * @param turnsToFix representing the number of turns for the mishap.
	 * @param reductionFactor  the reduction factor that affects the racer's performance 
	 */
	public Mishap(boolean fixable,int turnsToFix,double reductionFactor ) {
		
		this.fixable = fixable;
		this.turnsToFix = turnsToFix;
		this.reductionFactor = reductionFactor;
	}
	
	
	/**
	 *  Decreases the number of turns it takes to fix the mishap by 1.
	 */
	public void nextTurn() {
		
		if(fixable == true) {
			this.turnsToFix = turnsToFix - 1;
		}
		
	}
	
	/**
	 * Returns a string representation of the mishap.
	 */
	public String toString() {
		
		return "(" + fixable + ", " + turnsToFix + ", " + new DecimalFormat("0.00").format(reductionFactor) + ")";
	} 
	
	/**
	 * Sets the fixable value of the mishap.
	 * @param fixable a boolean value indicating if the mishap is fixable.
	 */
	public boolean setFixable(boolean fixable) {
		
		this.fixable = fixable;
		return true;
	}
	
	/**
	 * Sets the number of turns it takes to fix the mishap.
	 * @param turnsToFix representing the number of turns it takes to fix the mishap.
	 */
	public boolean setTurnsToFix(int turnsToFix ) {
		
		this.turnsToFix = turnsToFix;
		return true;
	}
	
	/**
	 * Sets the reduction factor that affects the racer's performance until the mishap is fixed.
	 * @param reductionFactor the reduction factor that affects the racer's performance
	 */
	public boolean setReductionFactor(double reductionFactor) {
		
		this.reductionFactor = reductionFactor;
		return true;
	}
	
	/**
	 * Returns the fixable value of the mishap.
	 * @return the fixable value of the mishap.
	 */
	public boolean getFixable() {
		
		return fixable;
	}
	
	/**
	 * @return the number of turns to fix the mishap.
	 */
	public int getTurnsToFix() {
			
		return turnsToFix;
	}
	
	/**
	 * @return the reductionFactor value of the Mishap object.
	 */
	public double getReductionFactor() {
		
		return reductionFactor;
	}
	

}
