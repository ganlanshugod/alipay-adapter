/**
* @Company Elink   
* @Title: AlipayServiceImpl.java 
* @Package org.bana.alipay.impl 
* @author ChuLinpeng   
* @date 2020年5月26日 下午1:40:32 
* @version V1.0   
*/
package org.bana.alipay.impl;

import java.util.Map;

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
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author ChuLinpeng
	 * @date 2020年5月26日 下午1:44:54
	 * @param appId
	 * @param request
	 * @return
	 * @throws AlipayApiException
	 * @see org.bana.alipay.AliPayService#execute(java.lang.String,
	 *      com.alipay.api.AlipayRequest)
	 */
	@Override
	public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request) throws AlipayApiException {
		return alipayClientFactory.getAlipayClient(appId).execute(request);
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author ChuLinpeng
	 * @date 2020年5月26日 下午1:43:14
	 * @param appId
	 * @param request
	 * @param authToken
	 * @return
	 * @throws AlipayApiException
	 * @see org.bana.alipay.AliPayService#execute(java.lang.String,
	 *      com.alipay.api.AlipayRequest, java.lang.String)
	 */
	@Override
	public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request, String authToken)
			throws AlipayApiException {
		return alipayClientFactory.getAlipayClient(appId).execute(request, authToken);
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author ChuLinpeng
	 * @date 2020年5月26日 下午2:46:11
	 * @param appId
	 * @param request
	 * @param accessToken
	 * @param appAuthToken
	 * @return
	 * @throws AlipayApiException
	 * @see org.bana.alipay.AliPayService#execute(java.lang.String,
	 *      com.alipay.api.AlipayRequest, java.lang.String, java.lang.String)
	 */
	@Override
	public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request, String accessToken,
			String appAuthToken) throws AlipayApiException {
		return alipayClientFactory.getAlipayClient(appId).execute(request, accessToken, appAuthToken);
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author ChuLinpeng
	 * @date 2020年5月26日 下午2:46:11
	 * @param appId
	 * @param request
	 * @return
	 * @throws AlipayApiException
	 * @see org.bana.alipay.AliPayService#pageExecute(java.lang.String,
	 *      com.alipay.api.AlipayRequest)
	 */
	@Override
	public <T extends AlipayResponse> T pageExecute(String appId, AlipayRequest<T> request) throws AlipayApiException {
		return alipayClientFactory.getAlipayClient(appId).pageExecute(request);
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author ChuLinpeng
	 * @date 2020年5月26日 下午2:46:11
	 * @param appId
	 * @param request
	 * @return
	 * @throws AlipayApiException
	 * @see org.bana.alipay.AliPayService#sdkExecute(java.lang.String,
	 *      com.alipay.api.AlipayRequest)
	 */
	@Override
	public <T extends AlipayResponse> T sdkExecute(String appId, AlipayRequest<T> request) throws AlipayApiException {
		return alipayClientFactory.getAlipayClient(appId).sdkExecute(request);
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author ChuLinpeng
	 * @date 2020年5月26日 下午2:46:11
	 * @param appId
	 * @param request
	 * @param method
	 * @return
	 * @throws AlipayApiException
	 * @see org.bana.alipay.AliPayService#pageExecute(java.lang.String,
	 *      com.alipay.api.AlipayRequest, java.lang.String)
	 */
	@Override
	public <T extends AlipayResponse> T pageExecute(String appId, AlipayRequest<T> request, String method)
			throws AlipayApiException {
		return alipayClientFactory.getAlipayClient(appId).pageExecute(request, method);
	}

	/**
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @author ChuLinpeng
	 * @date 2020年5月26日 下午2:46:11
	 * @param appId
	 * @param result
	 * @param requsetClazz
	 * @return
	 * @throws AlipayApiException
	 * @see org.bana.alipay.AliPayService#parseAppSyncResult(java.lang.String,
	 *      java.util.Map, java.lang.Class)
	 */
	@Override
	public <TR extends AlipayResponse, T extends AlipayRequest<TR>> TR parseAppSyncResult(String appId,
			Map<String, String> result, Class<T> requsetClazz) throws AlipayApiException {
		return alipayClientFactory.getAlipayClient(appId).parseAppSyncResult(result, requsetClazz);
	}

	public void setAlipayClientFactory(AlipayClientFactory alipayClientFactory) {
		this.alipayClientFactory = alipayClientFactory;
	}
}
