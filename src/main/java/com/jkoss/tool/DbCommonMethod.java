package com.jkoss.tool;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class DbCommonMethod implements Serializable {
	/**
	 * SimpleDateFormat("yyyy-MM-dd");
	 */
	public static SimpleDateFormat isoFormat = new SimpleDateFormat(
			"yyyy-MM-dd");
	
	public static SimpleDateFormat isoFormatMth = new SimpleDateFormat("yyyy-MM");
	/**
	 * SimpleDateFormat("yyyyMMdd");
	 */
	public static SimpleDateFormat iso0Format = new SimpleDateFormat("yyyyMMdd");
	/**
	 * SimpleDateFormat("HH:mm:ss");
	 */
	public static SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
	/**
	 * SimpleDateFormat("HHmmss");
	 */
	public static SimpleDateFormat time2Format = new SimpleDateFormat("HHmmss");
	/**
	 * SimpleDateFormat("HHmmssSSS");
	 */
	public static SimpleDateFormat time3Format = new SimpleDateFormat(
			"HHmmssSSS");
	/**
	 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSSSS");
	 */
	public static SimpleDateFormat iso2Format = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss.SSSSSS");
	/**
	 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	 */
	public static SimpleDateFormat iso1Format = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss.SSS");
	/**
	 * SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	 */
	public static SimpleDateFormat iso3Format = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss");
	/**
	 * SimpleDateFormat("yyyyMMddHHmmssSSS");
	 */
	public static SimpleDateFormat iso4Format = new SimpleDateFormat(
			"yyyyMMddHHmmssSSS");

	public static String DRL_WORKING_FOLDER = "DRL_WORKING_FOLDER";

	public static Double MAX_AMT_15 = 9999999999999.99;

	public static Double MAX_AMT_18 = 9999999999999999.99;

	public static List<String> FS_MODS = new ArrayList<String>();

	/**
	 * str��Ϊ��ʱȥ���ַ�������Ŀո񣬷��򷵻�null
	 * 
	 * @param str
	 * @return
	 */
	public static String trimString(Object str) {
		if (str != null) {
			return trimSuffix(str.toString());
		}
		return null;
	}

	 
	public static String trimStringDecimal(Object str) {
		if (str instanceof Date) {
			return time2Format.format((Date) str);
		}
		if (str != null) {
			if (str.toString().trim().length() > 0) {
				return trimSuffix(str.toString());
			} else {
				return "0";
			}
		}
		return null;
	}

	 
	public static int compareTo(Date date1, Date date2) {
		if (date1 == null) {
			return date2 == null ? 0 : -1;
		} else {
			return date1.compareTo(date2);
		}
	}
 
	public static int compareTo(BigDecimal dec1, BigDecimal dec2) {
		if (dec1 == null) {
			return dec2 == null ? 0 : -1;
		} else {
			return dec1.compareTo(dec2);
		}
	}

	 
	public static boolean isBlank(String str) {
		return str == null || str.length() == 0 || " ".equals(str);
	}

	 
	public static boolean isBlank(BigDecimal str) {
		return str == null || str.doubleValue() == 0;
	}

 
	public static boolean isBlank(double str) {
		return str == 0;
	}

	 
	public static int compareTo(String str1, String str2) {
		if (str1 == null) {
			if (str2 == null) {
				return 0;
			} else {
				return isBlank(str2) ? 0 : -1;
			}
		} else {
			if (str1.length() == 0) {
				return isBlank(str2) ? 0 : -1;
			}
			if (str2 == null || isBlank(str2)) {
				return 1;
			}
			return str1.compareTo(str2);
		}
	}

 
	public static String trimSuffix(String s) {

		int len = s.length();
		char[] val = s.toCharArray();
		while (len > 0 && (val[len - 1] <= ' ')) {
			len--;
		}
		return ((len > 0) && len <= s.length()) ? s.substring(0, len) : s;
	}

	 
	public static String intToString(int i, int length) {
		String result = String.valueOf(i);
		try {
			while (result.length() < length) {
				result = "0" + result;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	 
	public static boolean isNumeric(String str) {
		Pattern pattern = Pattern.compile("^[0-9]*");
		Matcher isNum = pattern.matcher(str);
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}

	 
	public static boolean isDate(String strDate, String dateFormat) {
		SimpleDateFormat df = new SimpleDateFormat(dateFormat);
		try {
			Date tmpDate = df.parse(strDate);
			String strTempDate = df.format(tmpDate);
			if (!strTempDate.equals(strDate)) {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	 
	public static String strToL(String str, int length) {
		try {
			if (str == null) {
				str = "";
			}
			if (str.length() > length) {
				str = str.substring(0, length);
			}
			while (str.length() < length) {
				str = str + " ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}
}
