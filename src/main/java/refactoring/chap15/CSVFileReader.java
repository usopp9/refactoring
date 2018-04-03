package refactoring.chap15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader extends CSVReader {
	
	public CSVFileReader(String string) throws IOException{
		super(new BufferedReader(new FileReader(string)));
	}
	
}