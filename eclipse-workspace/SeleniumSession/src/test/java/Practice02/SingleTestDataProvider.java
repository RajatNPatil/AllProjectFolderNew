package Practice02;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleTestDataProvider {
	
        @DataProvider(name = "testData")
        public Object[][] createData() {
            return new Object[][] {
                {"data1_for_testcase1", "expected1"},
                {"data2_for_testcase2", "expected2"},
                {"data3_for_testcase3", "expected3"},
                {"data4_for_testcase4", "expected4"},
                {"data5_for_testcase5", "expected5"}
            };
        }

        @Test(dataProvider = "testData")
        public void executeTestCaseWithData(String inputData, String expectedResult) {
            System.out.println("Executing test case with input: " + inputData + " and expecting: " + expectedResult);
            // Add your test logic here, using inputData and expectedResult
            // For example: Assert.assertEquals(actualResult, expectedResult);
        
    }

}
