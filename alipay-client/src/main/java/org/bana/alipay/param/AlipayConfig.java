/**
* @Company Elink   
* @Title: AlipayConfig.java 
* @Package org.bana.alipay.param 
* @author ChuLinpeng   
* @date 2020年5月26日 上午9:54:25 
* @version V1.0   
*/ 
package org.bana.alipay.param;

import java.io.Serializable;

/** 
* @ClassName: AlipayConfig 
* @Description: 
* @author ChuLinpeng   
*/
public class AlipayConfig implements Serializable {

	/** 
	* @Fields serialVersionUID : 
	*/ 
	private static final long serialVersionUID = -7387479838344820430L;
	
	private String url = "https://openapi.alipay.com/gateway.do"; //支付宝网关（固定）
	private String appId;
	private String privateKey;
	private String format = "json";
	private String charset = "UTF-8";
	private String publicKey;
	// 支付宝公钥
	private String aliPublicKey;
	private String signType = "RSA2";
	
	/** 
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 上午9:58:48  
	*/
	public AlipayConfig() {
		super();
	}
	
	/** 
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 上午10:00:36 
	* @param appId
	* @param publicKey
	* @param privateKey 
	*/ 
	public AlipayConfig(String appId, String publicKey, String privateKey) {
		super();
		this.appId = appId;
		this.publicKey = publicKey;
		this.privateKey = privateKey;
	}
	
	/** 
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 上午10:00:39 
	* @param appId
	* @param publicKey
	* @param privateKey
	* @param aliPublicKey 
	*/ 
	public AlipayConfig(String appId, String publicKey, String privateKey, String aliPublicKey) {
		super();
		this.appId = appId;
		this.publicKey = publicKey;
		this.privateKey = privateKey;
		this.aliPublicKey = aliPublicKey;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getPrivateKey() {
		return privateKey;
	}
	public void setPrivateKey(String privateKey) {
		this.privateKey = privateKey;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getCharset() {
		return charset;
	}
	public void setCharset(String charset) {
		this.charset = charset;
	}
	public String getPublicKey() {
		return publicKey;
	}
	public void setPublicKey(String publicKey) {
		this.publicKey = publicKey;
	}
	public String getAliPublicKey() {
		return aliPublicKey;
	}
	public void setAliPublicKey(String aliPublicKey) {
		this.aliPublicKey = aliPublicKey;
	}
	public String getSignType() {
		return signType;
	}
	public void setSignType(String signType) {
		this.signType = signType;
	}
}
