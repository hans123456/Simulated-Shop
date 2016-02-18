
public abstract class Product {

	protected String productID_;
	protected String productName_;
	protected int cost_;
	protected String quanity_;

	public String getProductID() {
		return productID_;
	}

	public void setProductID(String productID_) {
		this.productID_ = productID_;
	}

	public String getProductName() {
		return productName_;
	}

	public void setProductName(String productName_) {
		this.productName_ = productName_;
	}

	public String getQuanity() {
		return quanity_;
	}

	public void setQuanity(String quanity_) {
		this.quanity_ = quanity_;
	}

	public abstract int getCost();
	
}
