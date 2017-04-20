package com.jkoss.wx.tools;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.CharsetUtils;
import org.apache.http.util.EntityUtils;

public class HttpClientUtil {

	/**
	 * 上传
	 * 
	 * @param url
	 * @param file
	 * @return
	 */
	public static String upload(String url, File file) {
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		if (file != null) {
			HttpEntity entity = MultipartEntityBuilder.create()
					.addPart("media", new FileBody(file)).build();
			// 设置表单
			httpPost.setEntity(entity);
			// 设置请求内容类型
			httpPost.setHeader("Content-Type",
					ContentType.MULTIPART_FORM_DATA.toString());
		}
		try {
			// 执行请求
			CloseableHttpResponse response = httpClient.execute(httpPost);
			// 响应
			String responseContent = EntityUtils.toString(response.getEntity());
			return responseContent;
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

	public static String sendGet(String url) {
		// 获取一个浏览器对象
		CloseableHttpClient client = HttpClients.createDefault();
		// 创建get请求
		HttpGet httpGet = new HttpGet(url);

		try {
			// 获取响应
			CloseableHttpResponse response = client.execute(httpGet);
			// 返回响应的字符串
			return EntityUtils.toString(response.getEntity(), Consts.UTF_8);

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	public static String sendPost(String url, String jsonStr) {
		// 获取一个浏览器对象
		CloseableHttpClient client = HttpClients.createDefault();
		// 创建post请求
		HttpPost httpPost = new HttpPost(url);

		if (jsonStr != null && !"".equals(jsonStr)) {

			StringEntity stringEntity = new StringEntity(jsonStr, Consts.UTF_8);
			httpPost.setEntity(stringEntity);
		}

		try {
			// 获取响应
			CloseableHttpResponse response = client.execute(httpPost);
			// 返回响应的字符串
			return EntityUtils.toString(response.getEntity(), Consts.UTF_8);

		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
