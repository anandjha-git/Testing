package testngExample;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

 class TestDetails1 {
  @Test
  public void f() {
	  System.out.println("Test case1");
  }
  @Test
  public void f2() {
	  System.out.println("Test case2");
  }
}
 class FactoryMethod{
	 public void factoryMethod() {
		 System.out.println("factory method");
	 }
 }
public class FactoryExample1 {
	  @Factory
	  Object [] factoryExample() {
		  return new Object[] {new TestDetails1(), new TestDetails1(), new FactoryMethod() };
	  }
	  
	}


//Randomly output display due to thread.