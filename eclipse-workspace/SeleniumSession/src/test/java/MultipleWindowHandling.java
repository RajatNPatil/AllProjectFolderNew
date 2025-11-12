import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	public static void main(String[] args) {
	
	WebDriver driver= new ChromeDriver();
	
	// Store the main window handle
	String mainWindowHandle = driver.getWindowHandle();

	// Get all window handles
	Set<String> allWindowHandles = driver.getWindowHandles();

	// Convert Set to List for indexed access (optional)
	List<String> windowHandlesList = new ArrayList<>(allWindowHandles);

	// Traverse through all windows except the main one
	for (String handle : windowHandlesList) {
	    if (!handle.equals(mainWindowHandle)) {
	        // Switch to the window
	        driver.switchTo().window(handle);

	        // Perform your actions here
	        System.out.println("Title of window: " + driver.getTitle());

	        // Optionally close the window
	        // driver.close();
	    }
	}

	// Switch back to the main window
	driver.switchTo().window(mainWindowHandle);

}
}
