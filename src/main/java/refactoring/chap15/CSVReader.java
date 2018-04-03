package refactoring.chap15;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class CSVReader {
	protected final BufferedReader bufReader;
	
	public CSVReader(BufferedReader bufReader) {
		this.bufReader = bufReader;
	}
	protected static final Pattern CSV_PATTERN = Pattern.compile("\\s*,\\s*");
	//콤마 앞 뒤에 공백 (A whitespace character : [\t\n\x0B\f\r])포함
	//test, test    test, test     test, test
	public String[] readCSV() throws IOException{
		String line =bufReader.readLine();
		
		if(line !=null) {
			String[] item = CSV_PATTERN.split(line);
			return item;
		}
		return null;
	}
	public void close() throws IOException{
		bufReader.close();
	}
}
