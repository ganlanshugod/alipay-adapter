package org.bana.alipay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import com.alipay.api.DefaultAlipayClient;

public class DefaultBanaAlipayClient extends DefaultAlipayClient {
	
	private static final Logger LOG = LoggerFactory.getLogger(DefaultBanaAlipayClient.class);

	public DefaultBanaAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset,
			String alipayPublicKey, String signType, String encryptKey, String encryptType) {
		super(serverUrl, appId, privateKey, format, charset, alipayPublicKey, signType, encryptKey, encryptType);
	}

	public DefaultBanaAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset,
			String alipayPublicKey, String signType, String proxyHost, int proxyPort) {
		super(serverUrl, appId, privateKey, format, charset, alipayPublicKey, signType, proxyHost, proxyPort);
	}

	public DefaultBanaAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset,
			String alipayPublicKey, String signType) {
		super(serverUrl, appId, privateKey, format, charset, alipayPublicKey, signType);
	}

	public DefaultBanaAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset,
			String alipayPublicKey) {
		super(serverUrl, appId, privateKey, format, charset, alipayPublicKey);
	}

	public DefaultBanaAlipayClient(String serverUrl, String appId, String privateKey, String format, String charset) {
		super(serverUrl, appId, privateKey, format, charset);
	}

	public DefaultBanaAlipayClient(String serverUrl, String appId, String privateKey, String format) {
		super(serverUrl, appId, privateKey, format);
	}

	public DefaultBanaAlipayClient(String serverUrl, String appId, String privateKey) {
		super(serverUrl, appId, privateKey);
	}
	
	
	@Override
	public <T extends AlipayResponse> T execute(AlipayRequest<T> request, String accessToken) throws AlipayApiException {
		LOG.info("请求参数"+request.getTextParams()+"; token = " + accessToken);
		try {
			T response = super.execute(request,accessToken);
			LOG.info("请求是否成功" + response.isSuccess());
			LOG.info("返回结果"+response.getBody());
			return response;
		} catch (AlipayApiException e) {
			LOG.warn("请求接口异常",e);
//			e.printStackTrace();
			throw e;
		}
		
	}
	
	@Override
	public <T extends AlipayResponse> T execute(AlipayRequest<T> request)
			throws AlipayApiException {
		return this.execute(request, null);
	}

}
