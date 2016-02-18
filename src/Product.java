
public abstract class Product {

	protected String productID_;
	protected String productName_;
	protected int cost_;
	protected int quanity_;
	protected String type_;

	public Product(String productID_, String productName_, int cost_, int quanity_, String type_) {
		super();
		this.productID_ = productID_;
		this.productName_ = productName_;
		this.cost_ = cost_;
		this.quanity_ = quanity_;
		this.type_ = type_;
	}

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

	public int getQuanity() {
		return quanity_;
	}

	public void setQuanity(int quanity_) {
		this.quanity_ = quanity_;
	}

	public String getType_() {
		return type_;
	}

	public void setType_(String type_) {
		this.type_ = type_;
	}

	public abstract int getCost();

}
