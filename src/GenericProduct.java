
public class GenericProduct extends Product {

	public GenericProduct(String productID_, String productName_, int cost_, int quanity_, String type_) {
		super(productID_, productName_, cost_, quanity_, type_);
	}

	@Override
	public int getCost() {
		return cost_;
	}

}
