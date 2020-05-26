/**
* @Company Elink   
* @Title: AliPayService.java 
* @Package org.bana.alipay 
* @author ChuLinpeng   
* @date 2020年5月26日 下午1:39:40 
* @version V1.0   
*/
package org.bana.alipay;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;

/**
 * @ClassName: AliPayService
 * @Description:
 * @author ChuLinpeng
 */
public interface AliPayService {

	public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request) throws AlipayApiException;

	public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request, String authToken)
			throws AlipayApiException;
}
