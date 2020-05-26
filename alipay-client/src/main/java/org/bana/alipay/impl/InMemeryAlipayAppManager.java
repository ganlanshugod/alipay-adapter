/**
* @Company Elink   
* @Title: InMemeryAlipayAppManager.java 
* @Package org.bana.alipay.impl 
* @author ChuLinpeng   
* @date 2020年5月26日 上午11:24:29 
* @version V1.0   
*/ 
package org.bana.alipay.impl;

import java.util.HashMap;
import java.util.Map;

import org.bana.alipay.AlipayAppManager;
import org.bana.alipay.AlipayException;
import org.bana.alipay.param.AlipayConfig;

import com.alipay.api.internal.util.StringUtils;

/** 
* @ClassName: InMemeryAlipayAppManager 
* @Description: 
* @author ChuLinpeng   
*/
public class InMemeryAlipayAppManager implements AlipayAppManager {
	
	private Map<String, AlipayConfig> confMap = new HashMap<String, AlipayConfig>();

	/**
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 上午11:24:29 
	* @param appId
	* @return 
	* @see org.bana.alipay.AlipayAppManager#getAppConfig(java.lang.String) 
	*/
	@Override
	public AlipayConfig getAppConfig(String appId) {
		return confMap.get(appId);
	}
	
	public void setAppConfig(AlipayConfig config) {
		if (config ==null || StringUtils.isEmpty(config.getAppId()) || StringUtils.isEmpty(config.getPublicKey())
				|| StringUtils.isEmpty(config.getPrivateKey())) {
			throw new AlipayException(AlipayException.PARAM_ERROR, "错误的支付宝配置" + config);
		}
		
		confMap.put(config.getAppId(), config);
	}

}
