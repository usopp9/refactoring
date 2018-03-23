package refactoring.chap07;

public class Item {

	
	private final ItemType itemType;
	private final String title;
	private final int price;
	
	
	public Item(ItemType itemType, String title, int price) {
		super();
		this.itemType = itemType;
		this.title = title;
		this.price = price;
	}
	
	public int getItemType() {
		return itemType.getTypecode();
	}

	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return String.format("[%s, %s, %s]", getItemType(), title, price);
	}
	
	
}
