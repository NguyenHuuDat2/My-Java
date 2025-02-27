package lab04;

//Bai 1:tao class product gom cac thuoc tinh
//name:string
//price:double
//tax:double
//Bai 2:ke thua bai 1, va bo sung them
//trong ham main, tao 2 object products va in thong tin ra man hinh=>su dung constructor
//bai 3:ke thua bai tap 2, bo sung them getter/setter , su dung keyword private
public class Product {
	private String name;
	private double price;
	private double tax;

	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public Product nhapThongTin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public void xuatThongTin(Product pr) {
		System.out.println("Name = " + pr.getName() + " PRICE = " + pr.getPrice() + " Tax = " + pr.getTax());
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}

}
