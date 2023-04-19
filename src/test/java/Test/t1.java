package Test;

import org.testng.annotations.Test;

public class t1 {

	@Test(priority=0,invocationCount=3)
	public void c() {

		System.out.println("Mia");
	}

	@Test(priority=1,groups="sanity",enabled=false)
	public void b() {

		System.out.println("Sunny");

	}

	@Test(priority=2,groups="sanity")
	public void a() {

		System.out.println("Johnny Boy");
	}










}
