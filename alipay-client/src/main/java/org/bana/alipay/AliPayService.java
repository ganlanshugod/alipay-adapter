/**
* @Company Elink   
* @Title: AliPayService.java 
* @Package org.bana.alipay 
* @author ChuLinpeng   
* @date 2020年5月26日 下午1:39:40 
* @version V1.0   
*/
package org.bana.alipay;

import java.util.Map;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;

/**
 * @ClassName: AliPayService
 * @Description:
 * @author ChuLinpeng
 */
public interface AliPayService {
	
	/**
     * 
     * 
     * @param <T>
     * @param request
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request) throws AlipayApiException;

    /**
     * 
     * 
     * @param <T>
     * @param request
     * @param accessToken
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request,
                                                String authToken) throws AlipayApiException;

    /**
     * 
     * 
     * @param request
     * @param accessToken
     * @param appAuthToken
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T execute(String appId, AlipayRequest<T> request, String accessToken,
                                                String appAuthToken) throws AlipayApiException;

    /**
     * 
     * @param <T>
     * @param request
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T pageExecute(String appId, AlipayRequest<T> request) throws AlipayApiException;
    
    /**
     * SDK客户端调用生成sdk字符串
     * @param <T>
     * @param request
     * @return
     * @throws AlipayApiException
     */
    public <T extends AlipayResponse> T sdkExecute(String appId, AlipayRequest<T> request) throws AlipayApiException;

    /**
    * 
    * @param request
    * @return
    * @throws AlipayApiException
    */
    public <T extends AlipayResponse> T pageExecute(String appId, AlipayRequest<T> request,
                                                    String method) throws AlipayApiException;

    /**
     * 移动客户端同步结果返回解析的参考工具方法
     * 
     * @param result 移动客户端SDK同步返回的结果map，一般包含resultStatus，result和memo三个key
     * @param requsetClazz 接口请求request类，如App支付传入 AlipayTradeAppPayRequest.class
     * @return 同步返回结果的response对象
     * @throws AlipayApiException
     */
    public <TR extends AlipayResponse, T extends AlipayRequest<TR>> TR parseAppSyncResult(String appId, Map<String, String> result,
                                                                                          Class<T> requsetClazz) throws AlipayApiException;
}
