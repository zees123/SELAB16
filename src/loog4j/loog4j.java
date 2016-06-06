package loog4j;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class loog4j {
	int x=10;
	private static Logger logger = Logger.getLogger(loog4j.class);
	public static void main(String [] args){
		//DOMConfigurator.configure("log4j.xml");
		PropertyConfigurator.configure("log4j.properties");
		//BasicConfigurator.configure();
		try{
			int i = 0;
			i = i / 0;
		}catch(Exception e){
			logger.error(e.getMessage());
		}
	}
}

 