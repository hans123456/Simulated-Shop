
public class ConsumableProduct extends Product {

	private int expiresAfterNDays_;

	@Override
	public int getCost() {
		return cost_ - (expiresAfterNDays_ * 3);
	}
	
}
