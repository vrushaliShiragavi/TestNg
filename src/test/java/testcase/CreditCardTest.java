package testcase;

import org.testng.annotations.Test;

public class CreditCardTest extends BaseClass{
	@Test(priority = 1)
	public void test1() {
		System.out.println("Inside CreditCardTest test 1");

	}
	@Test(priority = 0)
	public void test2() {

		System.out.println("Inside CreditCardTest test 2");
	}
	@Test(dependsOnMethods="test2")
	public void test3() {

		System.out.println("Inside CreditCardTest test 3");
	}	
	@Test(groups= {"regeration"})
	public void test4() {

		System.out.println("Inside CreditCardTest test 4");
	}	

}
