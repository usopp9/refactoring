package refactoring;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Random;

import refactoring.chap01.Robot;
import refactoring.chap01.Simple.SimpleDatabase;
import refactoring.chap02.FindInt;
import refactoring.chap03.SortSample;
import refactoring.chap04.Label;
import refactoring.chap04.Person;
import refactoring.chap05.Banner;

public class Main {
	private static Random random = new Random(1234);
	public static void main(String[] args) {
		//testChap01();
		//testChap02();
		//testChap02_1();		
		//testChap03();
		//testChap04();
		
		Banner hello = new Banner("Hello, World!");
		hello.print(3);
	}
	private static void testChap04() {
		Person[] people = {
				new Person(new Label("Alice"), new Label("alice@example.com")),
				new Person(new Label("Bobby"), new Label("bobby@example.com")),
				new Person(new Label("Chris")),
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
		robot.order(0);//walk
		robot.order(1);//stop
		robot.order(2);//jump
	}

}
