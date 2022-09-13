package basics;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product(101, "smartphone", 14500.0, true);
		Product p2 = new Product(102, "smartwatch", 1999.0, false);
		Product p3 = new Product(103, "smartcar", 99999.0, true);
		Product p4 = new Product(104, "smartbike", 99999.0, false);
		Product p5 = new Product(105, "smartpen", 6999.0, true);
		Product p6 = new Product(106, "smartbook", 5999.0, true);
		Product p7 = new Product(107, "smartclothing", 2999.0, false);
		Product p8 = new Product(108, "smartshoes", 3999.0, true);
		Product p9 = new Product(109, "smartwear", 2999.0, false);

		Product[] products = new Product[9];

		products[0] = p1;
		products[1] = p2;
		products[2] = p3;
		products[3] = p4;
		products[4] = p5;
		products[5] = p6;
		products[6] = p7;
		products[7] = p8;
		products[8] = p9;

		for (Product product : products) {
			System.out.println(product);
		}
	}
}
