package org.bana.alipay;

import com.alipay.api.AlipayClient;

public interface AlipayClientFactory {

	/**
	 * 
	 * @param appId
	 * @return
	 */
	AlipayClient getAlipayClient(String appId);
}
