package TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TestcaseControls.RadioLogoutTest;
import TestcaseControls.RadioChildTest;
import TestcaseControls.RadioCommonTest;
import TestcaseControls.RadioHiddenTest;
import TestcaseControls.RadioOperatorTest;
import TestcaseControls.RadioParentTest;
import TestcaseControls.RadioRequiredfieldTest;
import TestcaseControls.RadioSearchTest;
import TestcaseControls.RadioboxInitial;
import TestcaseControls.RadioDisplayTest;


/** 
 * @author Lili.Sun  
 * @date 2015年7月23日 上午15:01:54 
 *  
 */


@RunWith(Suite.class)
@SuiteClasses({
	RadioboxInitial.class,
	RadioCommonTest.class,
	RadioDisplayTest.class,
	RadioOperatorTest.class,
	RadioHiddenTest.class,
	RadioRequiredfieldTest.class,
	RadioParentTest.class,
	RadioChildTest.class,
	RadioSearchTest.class,
	RadioLogoutTest.class
	})
public class RadioBoxTest {
}