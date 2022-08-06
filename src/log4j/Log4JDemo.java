package log4j;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Log4JDemo {

	
	 static final Logger log = LogManager.getLogger(Log4JDemo.class.getName());
	 
	public static void main(String[] args) {
		

		log.info("Hello , How are you doing");
	
	}

}
