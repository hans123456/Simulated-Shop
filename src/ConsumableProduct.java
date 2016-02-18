
public class ConsumableProduct extends Product {

	private int expiresAfterNDays_;

	public ConsumableProduct(String productID_, String productName_, int cost_, int quanity_, String type_,
			int expiresAfterNDays_) {
		super(productID_, productName_, cost_, quanity_, type_);
		this.expiresAfterNDays_ = expiresAfterNDays_;
	}

	@Override
	public int getCost() {
		return cost_ - (expiresAfterNDays_ * 3);
	}

}
