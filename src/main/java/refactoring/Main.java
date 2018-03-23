package refactoring;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import refactoring.chap01.Robot;
import refactoring.chap01.Simple.SimpleDatabase;
import refactoring.chap02.FindInt;
import refactoring.chap03.SortSample;

import refactoring.chap04.factory_method.Label;
import refactoring.chap04.factory_method.Person;

import refactoring.chap05.Banner;
import refactoring.chap06.Book;
import refactoring.chap06.extract_superclass.Player;

import refactoring.chap07.Item;
import refactoring.chap07.ItemType;


public class Main {
	private static Random random = new Random(1234);
	public static void main(String[] args) {
		//testChap01();

		//testChap02();
		//testChap02_1();		
		//testChap03();
		//testChap04();
		//testChap05();		
		//testChap06();
		//testChap07();
		
		Item book = new Item(ItemType.BOOK, "세계 역사", 4800);
		Item dvd = new Item(ItemType.DVD, "뉴욕의 꿈 특별판", 3000);
		Item soft = new Item(ItemType.SOFTWARE, "튜링 머신", 3200);
		System.out.printf("%5s = %s%n","book",book);
		System.out.printf("%5s = %s%n","dvd",dvd);
		System.out.printf("%5s = %s%n","soft",soft);
	}
	private static void testChap07() {
		Player musicPlayer = new Player();
		musicPlayer.setCurrentMedia(true);
		Player videoPlayer = new Player();
		videoPlayer.setCurrentMedia(false);
		
		play(musicPlayer);
		play(videoPlayer);
	}
	private static void play(Player player) {
		player.play();
		player.loop();
		player.stop();
	}
	private static void testChap06() {
		Book math = new Book("프로그래머 수학","ISBN4797329734","20000원","유키 히로시","hyuki@hyuki.com");
		System.out.println("math: ");
		System.out.println(math.toXml());
	}
	private static void testChap05() {
		Banner hello = new Banner("Hello, World!");
		hello.print(3);
	}
	private static void testChap04() {
		Person[] people = {
				new Person(new Label("Alice"), new Label("alice@example.com")),
				new Person(new Label("Bobby"), new Label("bobby@example.com")),
				new Person(new Label("Chris")),
				new Person(new Label("YHS"))
		};
		for(Person p : people) {
			System.out.println(p);
			p.display();
			System.out.println();
		}
	}
	private static void testChap03() {
		execute(10);
		execute(10);
		execute(10);
		execute(10);
		execute(10);
	}
	private static void execute(int length) {
		int[] data = new int[length];
		for(int i =0;i<data.length;i++) {
			data[i]= random.nextInt(data.length);
		}
		SortSample sorter = new SortSample(data);
		System.out.println("BEFORE: "+sorter);
		sorter.sort();
		System.out.println("AFTER: "+sorter);
		System.out.println();
	}
	private static void testChap02_1() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
			Iterator<String> it = db.iterator();
			while(it.hasNext()) {
				String key = it.next();
				System.out.println("KEY: \""+key+"\"");
				System.out.println("Value: \""+db.getValue(key)+"\"");
				System.out.println();
			}
		}catch(IOException e ) {
			e.printStackTrace();
		}
	}

	private static void testChap02() {
		int[] data = {1,9,0,2,8,5,6,3,4,7};
		if(FindInt.find(data, 5)) {
			System.out.println("Found!");
		}else {
			System.out.println("Not found...");
		}

	}

	private static void testChap01() {
		Robot robot = new Robot("Andrew");
		robot.order(Robot.COMMAND_WALK);
		robot.order(Robot.COMMAND_STOP);
		robot.order(Robot.COMMAND_JUMP);
	}

}



