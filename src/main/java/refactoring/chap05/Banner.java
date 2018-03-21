package refactoring.chap05;

public class Banner {
	private final String content;

	public Banner(String content) {
		this.content = content;
	}
	
	public void print(int times) {
		System.out.print("+");
		for(int i = 0; i<content.length();i++) {
			System.out.print("-");
		}
		System.out.println("+");
		
		for(int i=0; i< times;i++) {
			System.out.println("|"+ content +"|");
		}
		System.out.print("+");
		for(int i = 0; i<content.length();i++) {
			System.out.print("-");
		}
		System.out.println("+");
	}
	
}
