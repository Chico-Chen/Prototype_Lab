
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * ClientDataShow: can only output numbers to console output
 * but needs to use Legacy classes to show bar graph output
 * @author dpeters
 *
 */
public class ClientDataShow {
	private Integer[] dataArray = { 3,6,2,5,7,1,4 };
	private List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(dataArray));
	
	public void sort(Comparator<Integer> c) {
		this.dataList.sort(c);
	}
	
	@Override
		public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Integer n : this.dataList) {			
			sb.append(n).append("\n");
		}
		
			return sb.toString();
		}
	public static void demo() {
		System.out.println(ClientDataShow.class.getName() + ".demo()...");

		/**
		 * ClientDataShow Original only using numbers
		 */
		{
			/**
			 * Show original data
			 */
			ClientDataShow obj = new ClientDataShow();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			System.out.println(obj);
		}
		
		/**
		 * ClientDataShow using AStartPrototype 
		 * for bar graphing the same data
		 */
		{
			/**
			 * Show original data
			 */
			ClientDataShow obj = new ClientDataShow();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			System.out.println(obj);
		}
		
		/**
		 * ClientDataShow using APlusPrototype 
		 * for bar graphing the same data
		 */
		{
			/**
			 * Show original data
			 */
			ClientDataShow obj = new ClientDataShow();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			System.out.println(obj);
		}
		
		/**
		 * ClientDataShow using ADotPrototype 
		 * for bar graphing the same data
		 */
		{
			/**
			 * Show original data
			 */
			ClientDataShow obj = new ClientDataShow();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			System.out.println(obj);
		}
		
		/**
		 * ClientDataShow using AXPrototype 
		 * for bar graphing the same data
		 */
		{
			/**
			 * Show original data
			 */
			ClientDataShow obj = new ClientDataShow();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			System.out.println(obj);
		}
		
		/**
		 * ClientDataShow using AComercialAtPrototype (A@) 
		 * for bar graphing the same data
		 */
		{
			/**
			 * Show original data
			 */
			ClientDataShow obj = new ClientDataShow();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			System.out.println(obj);
		}
		System.out.println(ClientDataShow.class.getName() + ".demo()... done!");
	}

}
