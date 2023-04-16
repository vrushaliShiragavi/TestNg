package testcase;

import org.testng.annotations.Test;

public class HomeLoanTest extends BaseClass {
	@Test(enabled = false)
	public void test1() {

		System.out.println("Inside home loan test 1");
	}

	@Test(priority = 2)
	public void test2() {

		System.out.println("Inside home loan test 2");
	}

	@Test(groups= {"sanity","regeration"})
	public void test3() {

		System.out.println("Inside home loan test 3");
	}

}
