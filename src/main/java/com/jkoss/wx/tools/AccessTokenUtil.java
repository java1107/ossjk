package com.jkoss.wx.tools;

import java.util.Date;

import com.google.gson.Gson;

public class AccessTokenUtil {

	private static AccessToken accessToken;
	// 到期时间
	private static Long expiration_time;

	public static AccessToken getAccessToken() {
		// 时效的判断
		if (accessToken == null) {
			// 第一次获取AccessToken
			accessToken = getNewAccessToken();
			expiration_time = accessToken.getExpires_in()
					+ (new Date().getTime() / 1000);
			return accessToken;
		} else {
			// 当前
			Long currentTime = new Date().getTime() / 1000;
			if (currentTime < (expiration_time - 5 * 60)) {
				return accessToken;
			} else {
				accessToken = getNewAccessToken();
				expiration_time = accessToken.getExpires_in()
						+ (new Date().getTime() / 1000);
				return accessToken;
			}

		}

	}

	private static AccessToken getNewAccessToken() {
		String url = J1107WXConstants.TokenUrl.replace("APPID",
				J1107WXConstants.AppID).replace("APPSECRET",
						J1107WXConstants.Secret);
		String tmp = HttpClientUtil.sendGet(url);

		Gson gson = new Gson();

		AccessToken accessToken = gson.fromJson(tmp, AccessToken.class);

		if (accessToken.getAccess_token() != null) {
			return accessToken;
		}
		System.out.println("Errcode:" + accessToken.getErrcode()
				+ "  ,  Errmsg:" + accessToken.getErrmsg());
		return null;

	}
}
