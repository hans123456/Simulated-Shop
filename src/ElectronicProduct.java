
public class ElectronicProduct extends Product {

	private int powerUsage_;
	
	@Override
	public int getCost() {
		return cost_*powerUsage_;
	}
	
}
