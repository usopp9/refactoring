package refactoring.chap15;

import java.io.IOException;

public class CSVFileTreePrinter extends CSVprinter {

	@Override
	public void print(CSVReader csvReader) throws IOException {
		String[] prevItem = new String[0];
		String[] item = null;
		while((item =csvReader.readCSV()) != null) {
			boolean justprint = false;
			for(int column = 0; column < item.length; column++) {
				if(justprint) {
					print_line(column,item[column]);
				}else {
					if(prevItem.length <= column || !item[column].equals(prevItem[column])) {
						print_line(column,item[column]);
						justprint = true;
					}
				}
			}
			prevItem = item;
		}
	}
	private void print_line(int indent, String s) {
		for(int i =0;i<indent;i++) {
			System.out.print("     ");
		}
		System.out.println(s);	
	}
}
