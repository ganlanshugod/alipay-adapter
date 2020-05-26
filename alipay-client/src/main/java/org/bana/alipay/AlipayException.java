/**
* @Company Elink   
* @Title: AlipayException.java 
* @Package org.bana.alipay 
* @author ChuLinpeng   
* @date 2020年5月26日 上午9:41:05 
* @version V1.0   
*/ 
package org.bana.alipay;

/** 
* @ClassName: AlipayException 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author ChuLinpeng   
*/
public class AlipayException extends RuntimeException {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = 537290929787284026L;
	
	public static final String PARAM_ERROR = "ALIPAY-001";
	
	public static final String CONFIG_ERROR = "ALIPAY-002";
	
	private String code;
	
	/** 
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 上午9:48:27  
	*/
	public AlipayException() {
		super();
	}
	
	/** 
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 上午9:47:10  
	*/
	public AlipayException(String code, String message) {
		super(message);
		this.code = code;
	}

	
	
	public String getCode() {
		return code;
	}
}
