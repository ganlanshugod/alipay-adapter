package org.bana.alipay.impl;

import org.bana.alipay.AlipayAppManager;
import org.bana.alipay.AlipayClientFactory;

import com.alipay.api.AlipayClient;

public class DefaultAlipayClientFactory implements AlipayClientFactory{

	private AlipayAppManager alipayAppManager;
	
	@Override
	public AlipayClient getAlipayClient(String appId) {
//		alipayAppManager.getAppConfog(appId);
//		new DefaultBanaAlipayClient();
		return null;
	}


	public void setAlipayAppManager(AlipayAppManager alipayAppManager) {
		this.alipayAppManager = alipayAppManager;
	}

}
