package com.rbl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Create Spring application context that configured by xml.
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	// Get our service from the spring context (that we want to be profiled).
    	TestClassInterface tc = (TestClassInterface) context.getBean("myTestClass");
    	
    	// Test profiling through methods calls.
    	tc.doSomething();
    }
}
