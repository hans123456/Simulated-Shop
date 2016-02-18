import java.util.HashMap;
import java.util.Map;

public class ShopDatabase {

	private Map<String, User> users_;
	private Map<String, Product> products_;

	public ShopDatabase() {
		super();
		this.users_ = new HashMap<String, User>();
		this.products_ = new HashMap<String, Product>();
	}

	public boolean login(String username) {
		return users_.containsKey(username);
	}

	public User getUser(String username) {
		return users_.get(username);
	}

	public boolean containsProductId(String productId) {
		return products_.containsKey(productId);
	}

	public Product getProduct(String productId) {
		return products_.get(productId);
	}

	public void addProduct(Product product) {
		products_.put(product.getProductID(), product);
		System.out.println(product.getProductID());
		System.out.println(product.getProductName());
	}

}
