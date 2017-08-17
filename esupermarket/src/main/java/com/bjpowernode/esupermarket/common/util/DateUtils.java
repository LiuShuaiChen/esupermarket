package com.bjpowernode.esupermarket.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @ClassName: DateUtils
 * @Description: 时间生成工具类
 * @author: ShuaichenLau
 * @date: 2017年8月17日 上午9:55:32
 */
public class DateUtils {

	private static final SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat simstr = new SimpleDateFormat("yyyyMMddHHmmss");

	/**
	 * 获取当前时间 生成格式yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String getDate() {
		return sim.format(new Date());
	}

	/**
	 * 获取当前时间 生成格式yyyyMMddHHmmss
	 * @return
	 */
	public static String getDateStr() {
		return simstr.format(new Date());
	}

}
