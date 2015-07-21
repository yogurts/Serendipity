package com.Core;

import org.apache.commons.lang.StringUtils;

/** 
 * @author Lili.Sun  
 * @date 2015年7月9日 下午3:10:23 
 *  
 */
public class AssertUtils {

	public static void assertTrue(boolean express, String errMsg) {
		if (!express){
			throw new AssertUtils.AssertException(errMsg);
		}
	}
	
	public static void assertNotEmpty(Object v, String errMsg) {
		if (v == null){
			throw new AssertUtils.AssertException(errMsg);
		}
		if (v instanceof String){
			if (StringUtils.isEmpty(v.toString())){
				throw new AssertUtils.AssertException(errMsg);
			}
		}
		
	}
	
	
	
 static class AssertException extends RuntimeException{
		public AssertException() {
	        super();
	    }

	  
	    public AssertException(String message) {
	        super(message);
	    }

	    /**
	     * Constructs a new exception with the specified detail message and
	     * cause.  <p>Note that the detail message associated with
	     * {@code cause} is <i>not</i> automatically incorporated in
	     * this exception's detail message.
	     *
	     * @param  message the detail message (which is saved for later retrieval
	     *         by the {@link #getMessage()} method).
	     * @param  cause the cause (which is saved for later retrieval by the
	     *         {@link #getCause()} method).  (A <tt>null</tt> value is
	     *         permitted, and indicates that the cause is nonexistent or
	     *         unknown.)
	     * @since  1.4
	     */
	    public AssertException(String message, Throwable cause) {
	        super(message, cause);
	    }
		
	}
	
}
