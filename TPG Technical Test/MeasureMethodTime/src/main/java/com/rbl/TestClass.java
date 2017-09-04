package com.rbl;

//Example class that we want to profile through AOP.
public class TestClass implements TestClassInterface {
	 
	//Example method that will be measured for execution time
	public void doSomething() {
         System.out.println("Starting to sleep.");
         try {
                 Thread.sleep(2000);
         } catch (InterruptedException e) {
                 System.out.println("Waking up.");
         }
         System.out.println("Done with sleeping.");
 }
}
