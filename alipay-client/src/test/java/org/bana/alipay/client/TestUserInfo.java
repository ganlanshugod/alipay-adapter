package org.bana.alipay.client;

import org.junit.Test;

import com.alipay.api.AlipayApiException;
import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.request.AlipayUserInfoShareRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.alipay.api.response.AlipayUserInfoShareResponse;

public class TestUserInfo extends ClientTest{
	
	@Test 
	public void testGetToken() throws AlipayApiException {
//		alipay.system.oauth.token
		AlipaySystemOauthTokenRequest request = new AlipaySystemOauthTokenRequest();
		request.setCode("1e4d257604d5434c8d8301ceeaaeZX86");
		request.setGrantType("authorization_code");
		AlipaySystemOauthTokenResponse response = alipayClient.execute(request);
		response.getAccessToken();
		response.getAlipayUserId();
		response.getAuthTokenType();
		
	}

	@Test
	public void test() throws AlipayApiException {
		AlipayUserInfoShareRequest request = new AlipayUserInfoShareRequest();
		String token = "";
		AlipayUserInfoShareResponse response = alipayClient.execute(request,token);
		if(response.isSuccess()){
		System.out.println("调用成功");
		} else {
		System.out.println("调用失败");
		}
	}
}
