package edu.neu.csye7374.prototype.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import edu.neu.csye7374.prototype.api.GraphPrototypeAPI;
import edu.neu.csye7374.prototype.prototypes.ACommercialAtPrototype;
import edu.neu.csye7374.prototype.prototypes.ADotPrototype;
import edu.neu.csye7374.prototype.prototypes.APlusPrototype;
import edu.neu.csye7374.prototype.prototypes.AStarPrototype;
import edu.neu.csye7374.prototype.prototypes.AXPrototype;
import edu.neu.csye7374.prototype.registry.GraphPrototypeRegistry;


/**
 * ClientDataShow: can only output numbers to console output but needs to use
 * Legacy classes to show bar graph output
 * 
 * @author dpeters
 *
 */
public class ClientDataShow {
	private Integer[] dataArray = { 3, 6, 2, 5, 7, 1, 4 };
	private List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(dataArray));
	private GraphPrototypeAPI prototype = null;

	public void setPrototype(GraphPrototypeAPI prototype) {
		this.prototype = prototype;
	}
	
	/**
	 * Reset the list to original order
	 */
	public void revertSort() {
		this.dataList = new ArrayList<Integer>(Arrays.asList(dataArray));
	}

	/**
	 * Sort the list in ascending order
	 */
	public void sort() {
		Collections.sort(this.dataList);
	}
	
	/**
	 * Sort the list in descending order
	 */
	public void reverseSort() {
		Collections.sort(this.dataList, Collections.reverseOrder());
	}

	/**
	 * Represent the data using bar graph
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		// If no style is specified, use default numeric style
		if(prototype == null) {
			for (Integer n : this.dataList) {
				sb.append("[" + n + "] ").append(n);
				sb.append("\n");
			}
		} else {
			for(Integer n : this.dataList) {
				sb.append("[" + n + "] ").append(this.prototype.showMagnitude(n));
				sb.append("\n");
			}
		}

		return sb.toString();
	}

	public static void demo() {
		System.out.println(ClientDataShow.class.getName() + ".demo()...");
		
		// Set up the registry of prototypes
		GraphPrototypeRegistry.loadPrototype("at", new ACommercialAtPrototype());
		GraphPrototypeRegistry.loadPrototype("dot", new ADotPrototype());
		GraphPrototypeRegistry.loadPrototype("plus", new APlusPrototype());
		GraphPrototypeRegistry.loadPrototype("star", new AStarPrototype());
		GraphPrototypeRegistry.loadPrototype("x", new AXPrototype());
		
		// Initiate the client object. Use only ONE client object
		ClientDataShow obj = new ClientDataShow();
		

		/**
		 * ClientDataShow Original only using numbers
		 */
		{
			/**
			 * Show original data
			 */
			obj.revertSort();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			obj.sort();
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			obj.reverseSort();
			System.out.println(obj);
		}

		/**
		 * ClientDataShow using AStarPrototype for bar graphing the same data
		 */
		{
			obj.setPrototype(GraphPrototypeRegistry.getGraphPrototype("star"));
			/**
			 * Show original data
			 */
			obj.revertSort();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			obj.sort();
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			obj.reverseSort();
			System.out.println(obj);
		}

		/**
		 * ClientDataShow using APlusPrototype for bar graphing the same data
		 */
		{
			obj.setPrototype(GraphPrototypeRegistry.getGraphPrototype("plus"));
			/**
			 * Show original data
			 */
			obj.revertSort();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			obj.sort();
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			obj.reverseSort();
			System.out.println(obj);
		}

		/**
		 * ClientDataShow using ADotPrototype for bar graphing the same data
		 */
		{
			obj.setPrototype(GraphPrototypeRegistry.getGraphPrototype("dot"));
			/**
			 * Show original data
			 */
			obj.revertSort();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			obj.sort();
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			obj.reverseSort();
			System.out.println(obj);
		}

		/**
		 * ClientDataShow using AXPrototype for bar graphing the same data
		 */
		{
			obj.setPrototype(GraphPrototypeRegistry.getGraphPrototype("x"));
			/**
			 * Show original data
			 */
			obj.revertSort();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			obj.sort();
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			obj.reverseSort();
			System.out.println(obj);
		}

		/**
		 * ClientDataShow using AComercialAtPrototype (A@) for bar graphing the same
		 * data
		 */
		{
			obj.setPrototype(GraphPrototypeRegistry.getGraphPrototype("at"));
			/**
			 * Show original data
			 */
			obj.revertSort();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			obj.sort();
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			obj.reverseSort();
			System.out.println(obj);
		}
		System.out.println(ClientDataShow.class.getName() + ".demo()... done!");
	}

}
