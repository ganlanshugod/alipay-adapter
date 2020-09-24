/**
* @Company Elink   
* @Title: DefaultAlipayClientCache.java 
* @Package org.bana.alipay.impl 
* @author ChuLinpeng   
* @date 2020年5月26日 上午10:34:40 
* @version V1.0   
*/ 
package org.bana.alipay.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.bana.alipay.AlipayClientCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alipay.api.AlipayClient;

/** 
* @ClassName: DefaultAlipayClientCache 
* @Description: 
* @author ChuLinpeng   
*/
public class DefaultAlipayClientCache implements AlipayClientCache {
	private static final Logger LOG = LoggerFactory.getLogger(DefaultAlipayClientCache.class);
	private static final String CLIENT_KEY = "clicnt";
	private static final String DATE_KEY = "date";
	// AlipayClient在内存中的存储有效时间，默认1天
	private int clientEffectiveTime = 24 * 60 * 60 * 1000;
	private Map<String, Map<String, Object>> cacheMap = new HashMap<String, Map<String, Object>>();
	
	public DefaultAlipayClientCache() {
		super();
	}
	
	/** 
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年9月17日 下午5:03:53  
	*/
	public DefaultAlipayClientCache(Integer clientEffectiveTime) {
		super();
		if (clientEffectiveTime != null && clientEffectiveTime.intValue() > 0) {
			this.clientEffectiveTime = clientEffectiveTime;
		}
		LOG.info("当前AlipayClient在内存中的有效时间为：" + this.clientEffectiveTime + "毫秒");
	}

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
		Map<String, Object> valMap = new HashMap<String, Object>();
		valMap.put(DATE_KEY, new Date()); // 当前时间，校验有效期用
		valMap.put(CLIENT_KEY, client);
		cacheMap.put(appId, valMap);
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
		Map<String, Object> valMap = cacheMap.get(appId);
		Date saveDate = (Date)valMap.get(DATE_KEY);
		Date now = new Date();
		// 若超过有效时间，则返回null
		if (now.getTime() - saveDate.getTime() > clientEffectiveTime) {
			return null;
		}
		return (AlipayClient)valMap.get(CLIENT_KEY);
	}

}
