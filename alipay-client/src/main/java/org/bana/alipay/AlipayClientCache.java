/**
* @Company Elink   
* @Title: AlipayClientCache.java 
* @Package org.bana.alipay 
* @author ChuLinpeng   
* @date 2020年5月26日 上午10:18:41 
* @version V1.0   
*/ 
package org.bana.alipay;

import com.alipay.api.AlipayClient;

/** 
* @ClassName: AlipayClientCache 
* @Description: 
* @author ChuLinpeng   
*/
public interface AlipayClientCache {
	
	void put(String appId, AlipayClient client);
	AlipayClient get(String appId);
}
