package automation;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class LaunchYT {
	
	public static void main(String[] args)throws IOException {
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.
		  println("Please enter text related to which you want to write in your description: "
		  ); String input = sc.next();
		 
			EdgeOptions edg = new EdgeOptions();
			edg.addArguments("--remote-allow-origins=*");
			WebDriver driver = new EdgeDriver(edg);
			
			
			
			driver.get("https://www.youtube.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//input[@id='search']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.findElement(By.xpath("//input[@id='search']")).sendKeys(input);
			
			
			  String youtubetxt1 = input;
			 
			 //driver2.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[1]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(youtubetxt1);
				
			 String youtubetxt = driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[1]//div[1]//div[2]//b[1]")).getText();
			
			 System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt));
			 
			 
			   String youtubetxt2 =
			 driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[2]//div[1]//div[2]//b[1]")).getText();
			   System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt2));
			    String youtubetxt3 =
			 driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[3]//div[1]//div[2]//b[1]")).getText();
			    System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt3));
			  String youtubetxt4 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[4]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt4));
			  String youtubetxt5 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[5]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt5));
			  String youtubetxt6 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[6]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt6));
			  String youtubetxt7 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[7]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt7));
			  String youtubetxt8 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[8]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt8));
			  String youtubetxt9 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[9]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt9));
			  String youtubetxt10 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[10]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt10));
			  String youtubetxt11 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[11]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt11));
			  String youtubetxt12 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[12]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt12));
			  String youtubetxt13 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[13]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt13));
			  String youtubetxt14 =
			  driver.findElement(By.xpath("//html[1]//body[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[14]//div[1]//div[2]//b[1]")).getText();
			  System.out.println(String.format ("%s%s",youtubetxt1,youtubetxt14));
			  
			 
		}

		// TODO Auto-generated method stub

	}


