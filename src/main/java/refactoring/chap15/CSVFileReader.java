package refactoring.chap15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVFileReader extends CSVReader {

	private final BufferedReader bufReader;
	
	public CSVFileReader(String string) throws FileNotFoundException {
		bufReader = new BufferedReader(new FileReader(string));
	}
	@Override
	public String[] readCSV() throws IOException {
		String line =bufReader.readLine();
		if(line !=null) {
			String[] item = CSV_PATTERN.split(line);
			return item;
		}
		return null;
	}

	@Override
	public void close() throws IOException {
		bufReader.close();
	}
}