package Basic;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogManager {

	private static Logger logger = Logger.getLogger(LogManager.class.getName());

	public static void main(String[] args) throws SecurityException, IOException {

		FileHandler fileHandler = new FileHandler("/Users/kuan-weilin/Documents/workspace/test.log");
		fileHandler.setLevel(Level.INFO);
		logger.addHandler(fileHandler);
		logger.info("gggg");
	}
}
