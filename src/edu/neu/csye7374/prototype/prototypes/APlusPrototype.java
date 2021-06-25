package edu.neu.csye7374.prototype.prototypes;

import java.util.Arrays;

import edu.neu.csye7374.prototype.api.GraphPrototypeAPI;

/**
 * 
 * @author Arundathi Balangowda Pati, Arunbalaji Srinivasan, Qi Chen, Jiachen Yu
 *
 */
public class APlusPrototype extends GraphPrototypeAPI {
	
	public APlusPrototype() {
		super('+');
	}

	@Override
	public String showMagnitude(int n) {
		// TODO Auto-generated method stub
		char[] charArray = new char[n];
		Arrays.fill(charArray, this.style);

		return new String(charArray);
	}

}
