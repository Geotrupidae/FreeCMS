package cn.freeteam.util;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
 


import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.conn.ssl.TrustStrategy;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.ssl.SSLContextBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;



public class HttpsClientUtil {
	private static Logger logger = LoggerFactory.getLogger(HttpsClientUtil.class);
	static CloseableHttpClient httpClient;
	static CloseableHttpResponse httpResponse;
 
	public static CloseableHttpClient createSSLClientDefault() {
		try {
			SSLContext sslContext = new SSLContextBuilder().loadTrustMaterial(null, new TrustStrategy() {
				// 信任所有
				public boolean isTrusted(X509Certificate[] chain, String authType) throws CertificateException {
					return true;
				}
			}).build();
			HostnameVerifier hostnameVerifier = NoopHostnameVerifier.INSTANCE;
			SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslContext, hostnameVerifier);
			return HttpClients.custom().setSSLSocketFactory(sslsf).build();
		} catch (KeyManagementException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (KeyStoreException e) {
			e.printStackTrace();
		}
		return HttpClients.createDefault();
 
	}
 
	/**
	 * 发送https请求
	 * 
	 * @param jsonPara
	 * @throws Exception
	 */
	public static String doPost(Map<String, Object> params, String url) {
		try {
			HttpPost httpPost = new HttpPost(url);
			List<NameValuePair> listNVP = new ArrayList<NameValuePair>();
			if (params != null) {
				for (String key : params.keySet()) {
					listNVP.add(new BasicNameValuePair(key, params.get(key).toString()));
				}
			}
			UrlEncodedFormEntity entity = new UrlEncodedFormEntity(listNVP, "UTF-8");
			logger.info("创建请求httpPost-URL={},params={}", url, listNVP);
			httpPost.setEntity(entity);
			httpClient = HttpsClientUtil.createSSLClientDefault();
			httpResponse = httpClient.execute(httpPost);
			HttpEntity httpEntity = httpResponse.getEntity();
			if (httpEntity != null) {
				String jsObject = EntityUtils.toString(httpEntity, "UTF-8");
				return jsObject;
			} else {
				return null;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				httpResponse.close();
				httpClient.close();
				logger.info("请求流关闭完成");
			} catch (IOException e) {
				logger.info("请求流关闭出错");
				e.printStackTrace();
			}
		}
	}
	
	public static String doPost(String url,
			JSONObject paramBody, String charset) throws Exception{
		String result = null;
		HttpPost httpPost = new HttpPost(url);
        httpPost.addHeader("Content-Type", "application/json;charset=utf-8");
        StringEntity entity = new StringEntity(paramBody.toString(), "utf-8");
        entity.setContentEncoding("UTF-8");
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        logger.info("request url and params:"+url+entity.toString());
		httpClient = HttpsClientUtil.createSSLClientDefault();
		CloseableHttpResponse response = httpClient.execute(httpPost);
		if(response !=null){
			HttpEntity resEntity = response.getEntity();
			if(resEntity != null){
				result = EntityUtils.toString(resEntity, charset);
			}
		}
		return result;
	}
	
	public static String doGet(String url,
			Map<String, String> paramHeader, Map<String, String> paramBody, String charset) throws Exception{
		String result = null;
		String paramStr = initParam(paramBody, charset);
		HttpGet httpGet = new HttpGet(url+"?"+paramStr);
		setHeader(httpGet, paramHeader);
		httpClient = HttpsClientUtil.createSSLClientDefault();
		CloseableHttpResponse response = httpClient.execute(httpGet);
		if(response !=null){
			HttpEntity resEntity = response.getEntity();
			if(resEntity != null){
				result = EntityUtils.toString(resEntity, charset);
			}
		}
		return result;
	}
	
    private static String initParam(Map<String, String> param, String charset) throws Exception {  
        // 设置参数  
    	String paramStr = "";
        if (param != null) {  
            List<NameValuePair> list = new ArrayList<NameValuePair>();  
            Set<String> keySet = param.keySet();  
            for (String key : keySet) {  
                list.add(new BasicNameValuePair(key, param.get(key)));  
            }  
            HttpEntity entity = new UrlEncodedFormEntity(list, charset);
            paramStr = EntityUtils.toString(entity);
//              paramStr = list.toString();
        }  
        return paramStr;

    }
    
    private static void setHeader(HttpRequestBase request, Map<String, String> paramHeader) {  
        // 设置Header  
        if (paramHeader != null) {  
            Set<String> keySet = paramHeader.keySet();  
            for (String key : keySet) {  
                request.addHeader(key, paramHeader.get(key));  
            }  
        }  
    }  
 
	public static void main(String[] args) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("authCode", "FX:123");
		map.put("userName", "jianghaida");
		map.put("pwd", "jianghaida");
		
 
		System.out.println(HttpsClientUtil.doPost(map, "https://www.baidu.com"));
	}
}


