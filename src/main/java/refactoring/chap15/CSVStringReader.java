package refactoring.chap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class CSVStringReader extends CSVReader {

	private final BufferedReader bufReader;
	
	public CSVStringReader(String string) {
		bufReader = new BufferedReader(new StringReader(string));
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
