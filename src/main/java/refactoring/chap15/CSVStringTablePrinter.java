package refactoring.chap15;

import java.io.IOException;

public class CSVStringTablePrinter extends CSVprinter {

	public CSVStringTablePrinter(CSVReader csvReader) {
		super(csvReader);
	}
	@Override
	public void print() throws IOException {
		System.out.println("<table>");
		String[] items = null;
		while((items = readCSV()) !=null) {
			System.out.println("    <tr>");
			for(String column: items) {
				System.out.printf("      <td>%s</td>%n",column);
			}
			System.out.println("    </tr>");
		}
		System.out.println("</table>");
	}
}
