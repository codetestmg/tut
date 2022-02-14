package co.john.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "https://demo.guru99.com/test/newtours/register_sucess.php";
        String expectedTitle = "Note: Your user name is wissem.";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        System.out.println(driver.findElement(By.cssSelector("p:nth-child(3) font:nth-child(1) b:nth-child(1)")).getText());
        System.out.println(driver.findElement(By.cssSelector("tbody tr:nth-child(3) td:nth-child(1) p:nth-child(2) font:nth-child(1)")).getText());
        System.out.println(driver.findElement(By.cssSelector("p:nth-child(1) font:nth-child(1) b:nth-child(1)")).getText());
        
        String notificationContent=driver.findElement(By.cssSelector("p:nth-child(3) font:nth-child(1) b:nth-child(1)")).getText();
        
        System.out.println(notificationContent.contains("name is"));
        System.out.println(notificationContent.contains("demo2"));
        
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        //close Fire fox
        driver.close();

	}

}
