package refactoring.chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
	private final Properties properties;
	private final String filename;

	public Database(String filename) {
		this.filename = filename;
		this.properties = new Properties();
		try {
			properties.load(new FileInputStream(this.filename));
		} catch (IOException ignore) {
		}
	}

	public void set(String key, String value) {
		properties.setProperty(key, value);
	}

	public String get(String key) {
		return properties.getProperty(key, null);
	}

	public void update() throws FileNotFoundException, IOException {
		properties.store(new FileOutputStream(this.filename), "");
		properties.storeToXML(new FileOutputStream(filename.replace(".txt", ".xml")), "");
	}

	public Properties getProperties() {
		return properties;
	}
}
