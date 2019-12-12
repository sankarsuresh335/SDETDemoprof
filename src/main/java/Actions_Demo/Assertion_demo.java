package Actions_Demo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_demo {
	
	
	SoftAssert assert1= new SoftAssert();
	
	@Test
	public void demotest_assertes() {
		
		assert1.assertTrue(true);
		
		assert1.assertEquals("sankaar", "Sankar");
		
		assert1.assertEquals("sasi", "sasi");
		
		System.out.println("the test case is passed");
		
		assert1.assertAll();
		
		
		
	}

}
