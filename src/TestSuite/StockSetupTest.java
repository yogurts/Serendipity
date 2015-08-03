package TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Testcase.*;


/** 
 * @author Lili.Sun  
 * @date 2015年6月3日 上午15:01:54 
 *  
 */


@RunWith(Suite.class)
@SuiteClasses({
	PageTest.class,
	LoginTest.class,
	ControlsStockTest.class,
	AddStockTest.class,
	AlterStockTest.class,
	DelStockTest.class,
	LogoutTest.class
	})
public class StockSetupTest {
}