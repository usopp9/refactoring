package refactoring;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import refactoring.chap01.Robot;
import refactoring.chap01.Simple.SimpleDatabase;
import refactoring.chap02.FindInt;

public class Main {

	public static void main(String[] args) {
		//testChap01();

		//testChap02();
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



