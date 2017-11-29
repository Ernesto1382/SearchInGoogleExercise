import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class intive_fdv_GoogleExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//if you didn't update the Path system variable to add the full directory path to the executable as above mentioned then doing this directly through code
		
		// Create a new instance of the Firefox driver
				//WebDriver driver = new FirefoxDriver();
		// Create a new instance of the Chrome driver
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				 String baseUrl = "http://www.google.com";
			     String expectedTitle = "Google";
			     String actualTitle = "";
			     String WordSearched ="Seleniumhq";
		
		        //Launch google
				driver.get(baseUrl);
				
				actualTitle = driver.getTitle();

		        /*
		         * compare the actual title of the page with the expected one and print
		         * the result as "Passed" or "Failed"
		         */
		        if (actualTitle.contentEquals(expectedTitle)){
		            //WebElement Searchbox = driver.findElement(By.id("lst-ib"));
		            //Other ways to look the searchbox
		            //WebElement Searchbox = driver.findElement(By.name("q"));
		            //WebElement Searchbox = driver.findElement(By.className("gsfi"));
		            //WebElement Searchbox = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		            WebElement Searchbox = driver.findElement(By.xpath("//input[@title='Search']"));
		            Searchbox.sendKeys(WordSearched);
		            //Searchbox.submit();
		            //driver.findElement(By.name("btnK")).click();
		            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		            driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }

		        // Print a Log In message to the screen
		        //System.out.println("Successfully opened the website www.Store.Demoqa.com");

				//Wait for 5 Sec
				Thread.sleep(1000);
				
		        // Close the driver
		        driver.quit();
	}

}
