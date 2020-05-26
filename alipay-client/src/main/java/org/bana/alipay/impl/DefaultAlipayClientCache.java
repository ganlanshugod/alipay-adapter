/**
* @Company Elink   
* @Title: DefaultAlipayClientCache.java 
* @Package org.bana.alipay.impl 
* @author ChuLinpeng   
* @date 2020年5月26日 上午10:34:40 
* @version V1.0   
*/ 
package org.bana.alipay.impl;

import java.util.HashMap;
import java.util.Map;

import org.bana.alipay.AlipayClientCache;

import com.alipay.api.AlipayClient;

/** 
* @ClassName: DefaultAlipayClientCache 
* @Description: 
* @author ChuLinpeng   
*/
public class DefaultAlipayClientCache implements AlipayClientCache {
	private Map<String, AlipayClient> cacheMap = new HashMap<String, AlipayClient>();

	/**
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 上午10:34:52 
	* @param appId
	* @param client 
	* @see org.bana.alipay.AlipayClientCache#put(java.lang.String, com.alipay.api.AlipayClient) 
	*/ 
	@Override
	public void put(String appId, AlipayClient client) {
		cacheMap.put(appId, client);
	}

	/**
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 上午10:34:52 
	* @param appId
	* @return 
	* @see org.bana.alipay.AlipayClientCache#get(java.lang.String) 
	*/ 
	@Override
	public AlipayClient get(String appId) {
		return cacheMap.get(appId);
	}

}
