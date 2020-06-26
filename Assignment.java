package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe") ;
		ChromeDriver drivers = new ChromeDriver();
		//* Launch https://erail.in/
		drivers.get("https://erail.in/");
		//* Set the system property and Launch the URL
		drivers.manage().window().maximize();
		drivers.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//* Click the 'sort on date' checkbox
		drivers.findElementByXPath("//input[@id='chkSelectDateOnly']").click();
		
		//* Clear and type in the from station text field
	    WebElement EleFrom=drivers.findElementByXPath("//input[@id='txtStationFrom']");
		EleFrom.clear();
		EleFrom.sendKeys("Coimbatore Jn",Keys.TAB);
	    Thread.sleep(2000);
	    
	    //* Clear and type in the to station text field
		 WebElement EleTo=drivers.findElementByXPath("//input[@id='txtStationTo']");
		 EleTo.clear();
		 EleTo.sendKeys("Erode Jn",Keys.TAB);
		
		 //* Add a java sleep for 2 seconds
		 Thread.sleep(2000);
		 
		//* Store all the train names in a list	 
		// List<WebElement> TrainNames= new ArrayList<WebElement>();
		 Set<String> Hset = new HashSet<String>();
		 List<WebElement> TrainNames = drivers.findElementsByXPath("//td[@style=';']/a");
    	    for (WebElement eachTrains : TrainNames) {
        	  
        	   System.out.println(eachTrains.getText().toString());
        	   Hset.add(eachTrains.getText().toString());
        	   
        	}
    	    System.out.println("_______________________________________________________");
    	    System.out.println("Add The List into New Set:");
   		  for (String eachTrainsSet : Hset) {
   		System.out.println(eachTrainsSet.toString());
			
		}
   			  
       //* Get the size of list
         int listsize = TrainNames.size();
 		 System.out.println("Size of the list: " + listsize);
 	  //* Get the size of set
 		 int setsize= Hset.size();
 		 System.out.println("Size of the set: " + setsize);
 		 

 		//* Compare the Size of list and Set to verify the names are unique
 		
         if (listsize==setsize) {
        	 System.out.println("The Names are Unique");
			
		}
         else
        	 System.out.println("The Names are not Unique");
     
		
		
	}	
		
		
		
	}

	


