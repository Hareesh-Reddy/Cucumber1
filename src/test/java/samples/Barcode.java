package samples;



import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;




public class Barcode {
	
	@Test
	public void barCode() throws IOException, NotFoundException{
		
	System.setProperty("webdriver.chrome.driver","C:\\Testing\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://barcode.tec-it.com/en");
	String barCodeUrl=driver.findElement(By.tagName("img")).getAttribute("src");
	System.out.println(barCodeUrl);
	
	URL url=new URL(barCodeUrl);
	BufferedImage bufferedimage=ImageIO.read(url);
	LuminanceSource ls=new BufferedImageLuminanceSource(bufferedimage);
	BinaryBitmap binarybitmap=new BinaryBitmap(new HybridBinarizer(ls));
	Result set=new MultiFormatReader().decode(binarybitmap);
	System.out.println(set);
	}

}
