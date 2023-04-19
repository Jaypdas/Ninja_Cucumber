package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class t2 {

	@Test(groups="sanity")
	public void play() {


		System.out.println("play");
	}
	
	@Test(groups="Regression")
	public void school() {


		System.out.println("school");

	}
	
	@BeforeMethod
	public void collage() {

		System.out.println("Welcome");
	}






}
