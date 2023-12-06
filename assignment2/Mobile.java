package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile {
	

protected String makecall(String simName) {
String mobilemodel="Redmi Node 9";
float mobileweight=10.2f;
System.out.println(simName+"Your call is waiting to connect");
return simName;
}
void sendmsg()
{
	boolean isFullCharged=true;
	int mobilecost =20000;
	System.out.println("This is my mobile");
}
public static void main(String[] args) {
	//create object
Mobile obj = new Mobile();
obj.makecall("Airtel");
obj.sendmsg();

}

	}

