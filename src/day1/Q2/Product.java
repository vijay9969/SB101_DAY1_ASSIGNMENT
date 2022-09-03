package day1.Q2;

public class Product implements Comparable<Product>{
	
	private int productId;
	private String productName;
	private int productPrice;
	
	
	
	public Product(int productId, String productName, int productPrice) {
		// TODO Auto-generated constructor stub
		this.setProductId(productId);
		this.setProductName(productName);
		this.setProductPrice(productPrice);
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	
	

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		int P1 = o.getProductPrice();
		int P2 = this.getProductPrice();
		if(P1>P2) {
			return +1;
			
		}else if(P1<P2) {
			return -1;
		}
		return 0;
	}
	


}
