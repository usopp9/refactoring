package refactoring.chap15;

import java.io.IOException;

public abstract class CSVprinter {
	protected final CSVReader csvReader;

	protected CSVprinter(CSVReader csvReader) {
		this.csvReader = csvReader;
	}
	
	public abstract void print() throws IOException;
	public String[] readCSV() throws IOException{
		return csvReader.readCSV();
	}
	
}
