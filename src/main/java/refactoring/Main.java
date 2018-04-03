package refactoring;

import java.awt.EventQueue;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import refactoring.chap01.Simple.SimpleDatabase;
import refactoring.chap02.FindInt;
import refactoring.chap03.SortSample;
import refactoring.chap04.Label;
import refactoring.chap04.Person;
import refactoring.chap05.Banner;
import refactoring.chap06.Book;
import refactoring.chap06.extract_superclass.Player;
import refactoring.chap07.Item;
import refactoring.chap07.ItemType;
import refactoring.chap09.Logger;
import refactoring.chap10.Robot;
import refactoring.chap11.Shape;
import refactoring.chap12.IntegerDisplay;
import refactoring.chap13.Dice;
import refactoring.chap14.AddressFile;
import refactoring.chap15.CSVFileTreePrinter;
import refactoring.chap15.CSVStringTablePrinter;

public class Main {
	private static Random random = new Random(1234);

	public static void main(String[] args) throws IOException {
		// testChap01();
		// testChap02();
		// testChap02_1();
		// testChap03();
		// testChap04();
		// testChap05();
		// testChap06();
		// testChap07();
		// testChap08();
		// testChap08_1();
		// testChap09();
		// testChap10();
		// testChap11();
		// testChap12();
		// testChap13();
		// testChap14();

		final String SAMPLE_CSV_STRING = "좋은 아침입니다.,Good morning.\n안녕하세요~,Hello.\n"
				+ "안녕하세요.,Good evening.\n안녕히 주무세요.,Good nigth.\n";
		final String SAMPLE_CSV_FILE = "file.csv";
		new CSVStringTablePrinter(SAMPLE_CSV_STRING).print();
		new CSVFileTreePrinter(SAMPLE_CSV_FILE).print();
				
	}

	private static void testChap14() {
		try {
			AddressFile file = new AddressFile("address.txt");
			file.getDatabase().set("Hiroshi Yuki", "hyuki@example.com");
			file.getDatabase().set("Tomura", "tomura@example.com");
			file.getDatabase().set("Hanako Sato", "hanako@example.com");
			file.getDatabase().update();
			
			Enumeration<?> e = file.names();
			while(e.hasMoreElements()) {
				String name = (String)e.nextElement();
				String mail = file.getDatabase().get(name);
				System.out.printf("name=%s, mail=%s%n",name,mail);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void testChap13() {
		List<Dice> dices = Arrays.asList(new Dice(), new Dice(456L), new Dice());
		dices.get(2).setSeed(456L);

		for (Dice d : dices) {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d%s ", d.nextInt(), i < 9 ? "," : "");
			}
			System.out.println();
		}
	}

	private static void testChap12() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntegerDisplay frame = new IntegerDisplay();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void testChap11() {
		List<Shape> shapes = Arrays.asList(new Shape(Shape.TYPECODE_LINE, 0, 0, 100, 200),
				new Shape(Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40),
				new Shape(Shape.TYPECODE_OVAL, 100, 200, 300, 400));

		for (Shape s : shapes) {
			s.draw();
		}
	}

	private static void testChap10() {
		Robot robot = new Robot("Andrew");
		System.out.println(robot.toString());

		robot.execute("forward right forward");
		System.out.println(robot.toString());

		robot.execute("left backward left forward");
		System.out.println(robot.toString());

		robot.execute("right forward forward farvard");
		System.out.println(robot.toString());
	}

	private static void testChap09() {
		Logger logger = new Logger();
		logger.log("infomation #1");

		logger.start();
		logger.log("infomation #2");
		logger.start();
		logger.log("infomation #3");

		logger.stop();
		logger.log("infomation #4");
		logger.stop();
		logger.log("infomation #5");
	}

	private static void testChap08_1() {
		List<refactoring.chap08.Shape> shapes = Arrays.asList(
				new refactoring.chap08.Shape(refactoring.chap08.Shape.TYPECODE_LINE, 0, 0, 100, 200),
				new refactoring.chap08.Shape(refactoring.chap08.Shape.TYPECODE_RECTANGLE, 10, 20, 30, 40),
				new refactoring.chap08.Shape(refactoring.chap08.Shape.TYPECODE_OVAL, 100, 200, 300, 400));
		for (refactoring.chap08.Shape s : shapes) {
			s.draw();
		}
	}

	private static void testChap08() {
		Item book = new Item(ItemType.Book, "세계 역사", 4800);
		Item dvd = new Item(ItemType.DVD, "뉴욕의 꿈 특별판", 3000);
		Item soft = new Item(ItemType.SOFTWARD, "튜링 머신", 3200);
		System.out.printf("%5s = %s%n", "book", book);
		System.out.printf("%5s = %s%n", "dvd", dvd);
		System.out.printf("%5s = %s%n", "soft", soft);
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
		Book math = new Book("프로그래머 수학", "ISBN4797329734", "20000원", "유키 히로시", "hyuki@hyuki.com");
		System.out.println("math: ");
		System.out.println(math.toXml());
	}

	private static void testChap05() {
		Banner hello = new Banner("Hello, World!");
		hello.print(3);
	}

	private static void testChap04() {
		Person[] people = { new Person(new Label("Alice"), new Label("alice@example.com")),
				new Person(new Label("Bobby"), new Label("bobby@example.com")), new Person(new Label("Chris")), };
		for (Person p : people) {
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
		for (int i = 0; i < data.length; i++) {
			data[i] = random.nextInt(data.length);
		}
		SortSample sorter = new SortSample(data);
		System.out.println("BEFORE: " + sorter);
		sorter.sort();
		System.out.println("AFTER: " + sorter);
		System.out.println();
	}

	private static void testChap02_1() {
		try {
			String fileUrl = Thread.currentThread().getContextClassLoader().getResource("dbfile.txt").getPath();
			SimpleDatabase db = new SimpleDatabase(new FileReader(fileUrl));
			Iterator<String> it = db.iterator();
			while (it.hasNext()) {
				String key = it.next();
				System.out.println("KEY: \"" + key + "\"");
				System.out.println("Value: \"" + db.getValue(key) + "\"");
				System.out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void testChap02() {
		int[] data = { 1, 9, 0, 2, 8, 5, 6, 3, 4, 7 };
		if (FindInt.find(data, 5)) {
			System.out.println("Found!");
		} else {
			System.out.println("Not found...");
		}
	}

	private static void testChap01() {
		refactoring.chap01.Robot robot = new refactoring.chap01.Robot("Andrew");
		robot.order(refactoring.chap01.Robot.COMMAND_WALK);
		robot.order(refactoring.chap01.Robot.COMMAND_STOP);
		robot.order(refactoring.chap01.Robot.COMMAND_JUMP);
	}
}
