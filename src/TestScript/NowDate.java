package TestScript;


import java.text.SimpleDateFormat; 
import java.util.Date;

/** 
 * @author Lili.Sun  
 * @date 2015年6月10日 上午11:07:15 
 *  
 */

public class NowDate {

	public String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		String time = formatter.format(new Date());
		return time;
	
	}
}
