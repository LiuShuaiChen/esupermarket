package com.bjpowernode.esupermarket.common.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.bjpowernode.esupermarket.common.constant.ApplicationConstant;


/**
 * cookie工具类
 * @author ShuaichenLau
 *
 */
public class CookieUtils {

	/**
	 * 获取cookie中key所对象的value值
	 * @param key
	 * @param request
	 * @return
	 */
	public static String getCookieValue(String key, HttpServletRequest request){
		//应用key所对应的value
		String shops = "";
		//从本地获取cookies对象
		Cookie[] cookies = request.getCookies();
		//判断cookies对象是否为空
		if (cookies != null) {
			//如果不为空 循环遍历
			for (Cookie cookie : cookies) {
				//获取当前应用key所对应的cookie对象
				if (ApplicationConstant.DL_SHOP.equals(cookie.getName())) {
					//得到value
					shops = cookie.getValue();
				}
			}
		}
		return shops;
	}
}
