package com.Core;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	
	private static final Logger log = LoggerFactory.getLogger(CaptureScreenshot.class);
	
	/**
	 * @param fileAbsPath
	 * @throws Exception
	 */
	public void getScreenshotToFile(String FileName) throws Exception {
		String sysFilePath = System.getProperty("user.dir") + "/report/ScreenShot/"; 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();   
		Rectangle screenRectangle = new Rectangle(screenSize);   
		Robot robot = new Robot();   
		BufferedImage image = robot.createScreenCapture(screenRectangle);   
		System.out.println(sysFilePath);
		ImageIO.write(image, "jpg", new File(sysFilePath + FileName));
     } 
	
	
	/**
	 * @param obj
	 * @param stackTraceElement
	 * @return The screen shot name
	 * @throws Exception
	 */
	public String getScreenshotName(Object obj, StackTraceElement stackTraceElement) throws Exception {
		//get file name
		String classname = obj.getClass().getSimpleName();
		String testCaseName = stackTraceElement.getMethodName();
		//Date date= new Date();
		//String strDate = new SimpleDateFormat("yyyyMMddHHMMSS").format(date);
		String picname = classname + "_" + testCaseName;// + "_" + strDate + ".jpg";
		return picname;
	 }
	
	
    /**
     * @Title: captureScreen
     * @Description: TODO
     * @param @param dr
     * @param @param strClassName
     * @param @throws Exception 
     * @return void 
     * @throws
     */

    public static void captureScreen(WebDriver dr, String strClassName) throws Exception {
    	String directory = System.getProperty("user.dir") + "/report/ScreenShot/";
    	String captureName = strClassName + "_" + CommFunc.getNowTimeString();
    	String format = ".jpg";    
    	
    	File screenShotFile = ((TakesScreenshot) dr).getScreenshotAs(OutputType.FILE); 
     		
    	FileUtils.copyFile (screenShotFile, new File(directory + captureName + format)); 
    	log.info("Screenshot Name: [" + captureName + ".jpg]");
    }
}