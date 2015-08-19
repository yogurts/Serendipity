package com.Model;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;


import com.Core.CommFunc;
import com.csvreader.CsvReader;

/** 
 * @author Lili.Sun  
 * @date 2015年7月1日 下午2:42:33 
 *  
 */
public class Test {

	//private static final Logger log = LoggerFactory.getLogger(Test.class);
	static String verify_title;
	static String verify_stockName;
	static String verify_stockAlter;
	static String verify_logoutUrl;
	
	public void testStockVerify() throws Exception {
		
		//验证数据读取
		try {
			String filePath = CommFunc.getTestDataFile();
			CsvReader reader = new CsvReader(filePath,',',Charset.forName("UTF-8"));
			//log.info(filePath);
			reader.readHeaders();
			
			while (reader.readRecord()) {			
				verify_title = reader.get("VerifyTitle");
				verify_stockName = reader.get("VerifyStockName");
				verify_stockAlter = reader.get("VerifyStockAlter");
				verify_logoutUrl = reader.get("VerifyLogoutUrl");				
			}
			

		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public String getScreenshotName(Object obj, StackTraceElement stackTraceElement) throws Exception {
		//get file name
		String classname = obj.getClass().getSimpleName();
		String testCaseName = stackTraceElement.getMethodName();
		//Date date= new Date();
		//String strDate = new SimpleDateFormat("yyyyMMddHHMMSS").format(date);
		String picname = classname + "_" + testCaseName;// + "_" + strDate + ".jpg";
		return picname;
	 }
	
	public static void main(String[] args) throws Exception {
		Test tt = new Test();
		String classname = tt.getClass().getSimpleName();
		//String testCaseName = stackTraceElement.getMethodName();
		System.out.println(classname);
		
		try {
			throw new Exception();
			} catch (Exception ex) {
			StackTraceElement[] st = ex.getStackTrace();
			for (StackTraceElement stackTraceElement : st) {
			String exclass = stackTraceElement.getClassName();
			String method = stackTraceElement.getMethodName();
			System.out.println(new Date() + ":" + "[类:" + exclass + "]调用"
			+ method + "时在第" + stackTraceElement.getLineNumber()
			+ "行代码处发生异常!异常类型:" + ex.getClass().getName());
			}
			}
/*
		Test tt = new Test();
		tt.testStockVerify();
		System.out.println(verify_title);

		//System.out.println(System.getProperty("user.dir"));
		String sysFilePath = System.getProperty("user.dir") + "\\report\\ScreenShot\\";
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//System.out.println(screenSize);
		Rectangle screenRectangle = new Rectangle(screenSize);   
		Robot robot = new Robot();
		BufferedImage image = robot.createScreenCapture(screenRectangle);
		ImageIO.write(image, "jpg", new File(sysFilePath + "aa.jpg"));
*/		
		
	}
}
