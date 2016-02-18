
public class ElectronicProduct extends Product {

	private int powerUsage_;

	public ElectronicProduct(String productID_, String productName_, int cost_, int quanity_, String type_,
			int powerUser_) {
		super(productID_, productName_, cost_, quanity_, type_);
		this.powerUsage_ = powerUsage_;
	}

	@Override
	public int getCost() {
		return cost_ * powerUsage_;
	}

}
