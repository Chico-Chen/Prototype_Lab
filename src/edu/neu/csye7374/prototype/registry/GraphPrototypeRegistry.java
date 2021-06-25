package edu.neu.csye7374.prototype.registry;

import java.util.Hashtable;

import edu.neu.csye7374.prototype.api.GraphPrototypeAPI;

/**
 * 
 * @author Arundathi Balangowda Pati, Arunbalaji Srinivasan, Qi Chen, Jiachen Yu
 *
 */
public class GraphPrototypeRegistry {
	private static Hashtable<String, GraphPrototypeAPI> prototypeMap = new Hashtable<String, GraphPrototypeAPI>();
	
	public static GraphPrototypeAPI getGraphPrototype(String id) {
		GraphPrototypeAPI prototype = prototypeMap.get(id);
		return (GraphPrototypeAPI) prototype.clone();
	}
	
	public static void loadPrototype(String id, GraphPrototypeAPI prototype) {
		prototypeMap.put(id, prototype);
	}
;}
