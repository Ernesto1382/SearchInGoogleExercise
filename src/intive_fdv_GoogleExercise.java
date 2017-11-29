import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class intive_fdv_GoogleExercise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Use for Firefox
		// Create a new instance of the Firefox driver
				//WebDriver driver = new FirefoxDriver();
		
		//Use for Chrome
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
		            WebElement Searchbox = driver.findElement(By.id("lst-ib"));
		            //Other ways to look the searchbox
		            //WebElement Searchbox = driver.findElement(By.name("q"));
		            //WebElement Searchbox = driver.findElement(By.className("gsfi"));
		            //WebElement Searchbox = driver.findElement(By.xpath("//input[@id='lst-ib']"));
		            
		            Searchbox.sendKeys(WordSearched);
		            
		            //The Test Case request use ENTER, but other way is Searchbox.submit();
		            driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		            
		            //identify the link by the title of shows in the search
		            driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		            
		            //This line helpme to have a follow in the console
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }


				//Wait for 1 Sec
				Thread.sleep(1000);
				
		        // Close the driver
		        driver.quit();
	}

}
