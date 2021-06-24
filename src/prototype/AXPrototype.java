package prototype;

public class AXPrototype extends GraphPrototypeAPI{

	{
		this.price = 50;
		this.description = "X";
	}
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("price: ");
		sb.append(this.price + "\n");
		sb.append("description: ");
		sb.append(this.description + "\n");
		
		return sb.toString();
		
	}

}
