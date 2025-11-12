package TestCases;

import org.testng.annotations.Test;

public class SkipTest {

	    @Test(enabled = false)
	    public void skippedTest() {
	        System.out.println("This test will be skipped.");
	    }

	    @Test
	    public void executedTest() {
	        System.out.println("This test will be executed.");
	    }
	}


