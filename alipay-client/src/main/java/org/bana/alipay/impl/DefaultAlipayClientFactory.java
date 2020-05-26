package org.bana.alipay.impl;

import org.bana.alipay.AlipayAppManager;
import org.bana.alipay.AlipayClientCache;
import org.bana.alipay.AlipayClientFactory;
import org.bana.alipay.AlipayException;
import org.bana.alipay.DefaultBanaAlipayClient;
import org.bana.alipay.param.AlipayConfig;

import com.alipay.api.AlipayClient;
import com.alipay.api.internal.util.StringUtils;

public class DefaultAlipayClientFactory implements AlipayClientFactory{

	private AlipayAppManager alipayAppManager;
	private AlipayClientCache alipayClientCache;
	
	@Override
	public AlipayClient getAlipayClient(String appId) {
		if (StringUtils.isEmpty(appId)) {
			throw new AlipayException(AlipayException.PARAM_ERROR, "获取支付宝配置信息时appid不能为空");
		}
		if (alipayClientCache == null) {
			return this.instance(appId);
		} else {
			AlipayClient alipayClient = alipayClientCache.get(appId);
			if (alipayClient == null) {
				alipayClient = this.instance(appId);
				alipayClientCache.put(appId, alipayClient);
			}
			
			return alipayClient;
		}
	}
	
	private AlipayClient instance(AlipayConfig config) {
		return new DefaultBanaAlipayClient(config.getUrl(),
				config.getAppId(),
				config.getPrivateKey(),
				config.getFormat(),
				config.getCharset(),
				config.getAliPublicKey(),
				config.getSignType());
	}
	
	private AlipayClient instance(String appId) {
		AlipayConfig appConfig = alipayAppManager.getAppConfig(appId);
		if (appConfig == null) {
			throw new AlipayException(AlipayException.CONFIG_ERROR, "根据appId【"+ appId +"】未获取到支付宝配置信息");
		}
		return this.instance(appConfig);
	}


	public void setAlipayAppManager(AlipayAppManager alipayAppManager) {
		this.alipayAppManager = alipayAppManager;
	}

	public void setAlipayClientCache(AlipayClientCache alipayClientCache) {
		this.alipayClientCache = alipayClientCache;
	}
}
