package models;

public class Product {
	private String id;
	// Название товара
	private String name;
	// Краткое описание на странице с остальными товарами
	private String shortDescription;
	// Цена (основная)
	private Double actualPrice;
	// Скидка
	private Double discount;
	// Цена с учетом скидки
	private Double price;
	// Путь к изображению
	private String imagePath;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public Double getActualPrice() {
		return actualPrice;
	}
	public void setActualPrice(Double price) {
		this.actualPrice = price;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	/**
	 * @return the currentPrice
	 */
	public Double getPrice() {
		return this.actualPrice - this.actualPrice * (this.discount/100);
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}	
}
