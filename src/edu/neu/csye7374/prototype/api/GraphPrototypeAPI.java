package edu.neu.csye7374.prototype.api;

/**
 * 
 * @author Arundathi Balangowda Pati, Arunbalaji Srinivasan, Qi Chen, Jiachen Yu
 *
 */

public abstract class GraphPrototypeAPI implements Cloneable {
	protected final char style;
	
	protected GraphPrototypeAPI(char style) {
		this.style = style;
	}
	
	public abstract String showMagnitude(int n);

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
