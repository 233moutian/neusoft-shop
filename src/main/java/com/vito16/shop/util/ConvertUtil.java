package com.vito16.shop.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 周欣文
 * @version 2018/10/19
 */
public class ConvertUtil {
	public static String toDateStr(Object o) throws ParseException {
		return o == null ? null : new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
				.format((Date) o);
	}

	public static String toYMDStr(Object o) throws ParseException {
		return o == null ? null : new SimpleDateFormat("yyyy-MM-dd")
				.format((Date) o);
	}
}
