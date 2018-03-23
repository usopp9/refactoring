package refactoring.chap07;

public enum ItemType {
	BOOK(0),DVD(1),SOFTWARE(2);
	
	private int typecode;

	private ItemType(int typecode) {
		this.typecode = typecode;
	}

	public int getTypecode() {
		return typecode;
	}

	public void setTypecode(int typecode) {
		this.typecode = typecode;
	}
}