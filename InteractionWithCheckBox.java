package assignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionWithCheckBox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		WebElement checkbox =driver.findElement(By.className("ui-chkbox-label"));
				checkbox.click();
				boolean isSelected =checkbox.isDisplayed();
	System.out.println("Is Checkbox Selected:"+isSelected);
	WebElement notification =driver.findElement(By.xpath("//span[text()='Ajax']"));
	notification.click();
	System.out.println(notification.getText());
	Thread.sleep(2000);
	WebElement checkBoxElement =driver.findElement(By.xpath("//label[text()='Java']"));
	boolean isSelected1 = checkBoxElement.isSelected();
	
	//performing click operation if element is not checked
	if(isSelected1 == false) {
		checkBoxElement.click();
	}
	driver.findElement(By.xpath("//div[contains(@id,'TriState')]")).click();
	WebElement tristate =driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']"));
	tristate.click();
	System.out.println(tristate.getText());
	System.out.println(tristate);
	WebElement checkbox1=driver.findElement(By.xpath("//div[contains(@class,'ui-state-disabled')]"));
	boolean isEnabled =checkbox1.isEnabled();
	if(isEnabled ==true)
	{
		System.out.println("Checkbox is disabled");
	}
	driver.findElement(By.xpath("//div[contains(@class,'selectcheckboxmenu-multiple')]")).click();
	driver.findElement(By.xpath("//div[contains(@class,'selectcheckboxmenu-header')]//following::label[text()='Miami']")).click();
	driver.findElement(By.xpath("//div[contains(@class,'selectcheckboxmenu-header')]//following::label[text()='Istanbul']")).click();
	driver.close();
	
		}

}
