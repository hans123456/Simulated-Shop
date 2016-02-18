import java.util.ArrayList;
import java.util.List;

public class User {

	private String username_;
	private int money_;
	private List<Product> products_;

	public User(String username_) {
		super();
		this.username_ = username_;
		this.money_ = 1000;
		this.products_ = new ArrayList<Product>();
	}

	public String getUsername() {
		return username_;
	}

	public int getMoney() {
		return money_;
	}

	public boolean subtractMoney(int money) {
		if (this.money_ - money >= 0) {
			this.money_ -= money;
			return true;
		}
		return false;
	}

	public List<Product> getProducts() {
		return products_;
	}

	public void addProduct(Product product) {
		this.products_.add(product);
	}

}
