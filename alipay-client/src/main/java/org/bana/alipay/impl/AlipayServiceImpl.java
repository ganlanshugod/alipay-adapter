/**
* @Company Elink   
* @Title: AlipayServiceImpl.java 
* @Package org.bana.alipay.impl 
* @author ChuLinpeng   
* @date 2020年5月26日 下午1:40:32 
* @version V1.0   
*/ 
package org.bana.alipay.impl;

import org.bana.alipay.AliPayService;
import org.bana.alipay.AlipayClientFactory;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;

/** 
* @ClassName: AlipayServiceImpl 
* @Description: 
* @author ChuLinpeng   
*/
public class AlipayServiceImpl implements AliPayService {
	
	private AlipayClientFactory alipayClientFactory;
	
	/**
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 下午1:44:54 
	* @param appId
	* @param request
	* @return
	* @throws AlipayApiException 
	* @see org.bana.alipay.AliPayService#execute(java.lang.String, com.alipay.api.AlipayRequest) 
	*/ 
	@Override
	public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request) throws AlipayApiException {
		return alipayClientFactory.getAlipayClient(appId).execute(request);
	}
	
	/**
	* <p>Description: </p> 
	* @author ChuLinpeng   
	* @date 2020年5月26日 下午1:43:14 
	* @param appId
	* @param request
	* @param authToken
	* @return
	* @throws AlipayApiException 
	* @see org.bana.alipay.AliPayService#execute(java.lang.String, com.alipay.api.AlipayRequest, java.lang.String) 
	*/ 
	@Override
	public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request, String authToken) throws AlipayApiException {
		return alipayClientFactory.getAlipayClient(appId).execute(request, authToken);
	}

	public void setAlipayClientFactory(AlipayClientFactory alipayClientFactory) {
		this.alipayClientFactory = alipayClientFactory;
	}
}
