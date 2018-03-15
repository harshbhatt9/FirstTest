package com.mavenpractise.HelloWorld;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static final Logger logger = Logger.getLogger(App.class);	
	
    public static void main( String[] args )
    {
    	//String text = "Hello World! This is my maven program";
    	    	
    	logger.info("Before Print");
    	
        System.out.println("Hello World! This is my maven program");
        
        logger.info("After Print");
    }
}
