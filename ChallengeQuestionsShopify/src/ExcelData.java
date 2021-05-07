

public class ExcelData {
	
	private int orderid;
	private int shopid;
	private int userid;
	private int orderAmount;
	private int totalItems;
	private String paymentMethod;
	private String createdAt;
	
	public ExcelData(int orderid, int shopid, int userid, int orderAmount, int totalItems, String paymentMethod, String createdAt)
	{
		this.orderid = orderid;
		this.shopid = shopid;
		this.userid = userid;
		this.orderAmount = orderAmount;
		this.totalItems = totalItems;
		this.paymentMethod = paymentMethod;
		this.createdAt = createdAt;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public int getShopid() {
		return shopid;
	}

	public void setShopid(int shopid) {
		this.shopid = shopid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(int orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	public int getTotalItems() {
		return totalItems;
	}

	public void setTotalItems(int totalItems) {
		this.totalItems = totalItems;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	

}
