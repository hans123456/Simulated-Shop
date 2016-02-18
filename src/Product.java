
public abstract class Product {

	protected String productID_;
	protected String productName_;
	protected int cost_;
	protected String quanity_;

	public String getProductID_() {
		return productID_;
	}

	public void setProductID_(String productID_) {
		this.productID_ = productID_;
	}

	public String getProductName_() {
		return productName_;
	}

	public void setProductName_(String productName_) {
		this.productName_ = productName_;
	}

	public String getQuanity_() {
		return quanity_;
	}

	public void setQuanity_(String quanity_) {
		this.quanity_ = quanity_;
	}

	public abstract int getCost();
	
}
