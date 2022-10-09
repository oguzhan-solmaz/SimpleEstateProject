package simpleEstateProjectintities;

public class Realty {
	public Realty(int id, String adress, String size, int unitPrice) {
		super();
		this.id = id;
		this.adress = adress;
		this.size = size;
		this.unitPrice = unitPrice;
	}
	public Realty() {
		super();
	}
	private int id;
	private String adress;
	private String size;
	private int unitPrice;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

}
