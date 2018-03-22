package refactoring.chap05;

public class Banner {
	private final String content;

	public Banner(String content) {
		this.content = content;
	}
	
	//template method
	public void print(int times) {
		printBorder();
		printContent(times);
		printBorder();
	}

	private void printContent(int times) {
		for(int i=0; i< times;i++) {
			System.out.println("|"+ content +"|");
		}
	}

	private void printBorder() {
		System.out.print("+");
		for(int i = 0; i<content.length();i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
}
