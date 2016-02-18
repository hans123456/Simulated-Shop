
public class AdminMain {

	public static void main(String[] args) {

		ShopDatabase shopDB = new ShopDatabase();
		AdminScreen adminScreen = new AdminScreen();
		adminScreen.setShopDB(shopDB);
		adminScreen.setVisible(true);

	}

}
