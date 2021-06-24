package prototype;

public abstract class GraphPrototypeAPI implements Cloneable {
	protected double price;
	protected String description;
	
	public abstract double getPrice();
	public abstract String getDescription();
	
	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return clone;
	}
}
