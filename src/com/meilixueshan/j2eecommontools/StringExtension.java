/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meilixueshan.j2eecommontools;

import java.math.BigDecimal;

/**
 * 字符串扩展类（主要是一此常用的字符串操作及类型转换）
 * @author meilixueshan
 */
public final class StringExtension {
    
    // 正式表达式：数字
    public final static String REGEX_NUMBER = "^[-+]?(([0-9]+)([.]([0-9]+))?|([.]([0-9]+))?)$";
    // 正式表达式： 用户帐号
    public final static String REGEX_ACCOUNT = "^[a-zA-Z0-9_]{6,18}$";
    // 正式表达式： 页面名称
    public final static String REGEX_PAGENAME = "^[a-zA-Z0-9-_]{1,32}$";
    // 正式表达式： 邮箱
    public final static String REGEX_EMAIL = "\\w+((-w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+";
    // 正式表达式： 密码
    public final static String REGEX_PASSWORD = "^[a-zA-Z0-9_]{6,18}$";

    /**
     * 字符串转Integer
     *
     * @param str 待转换的字符串
     * @param failValue 默认值（转换失败时，返回的值）
     * @return 转换后的值
     */
    public static Integer toInt(String str, int failValue) {
        int result;
        try {
            result = Integer.parseInt(str);
        } catch (Exception ex) {
            result = failValue;
        }

        return result;
    }

    /**
     * 字符串转换Integer
     *
     * @param str 待转换的字符串
     * @return 转换后的值（如果转换失败，则返回0）
     */
    public static Integer toInt(String str) {
        return toInt(str, 0);
    }

    /**
     * 字符串转Long
     *
     * @param str 待转换的字符串
     * @param failValue 默认值（转换失败时，返回的值）
     * @return 转换后的值
     */
    public static long toLong(String str, long failValue) {
        long result;
        try {
            result = Long.parseLong(str);
        } catch (Exception e) {
            result = failValue;
        }
        return result;
    }

    /**
     * 字符串转Long
     *
     * @param str 待转换的字符串
     * @return 转换后的值（如果转换失败，则返回0）
     */
    public static long toLong(String str) {
        return toLong(str, 0);
    }

    /**
     * 字符串转Double
     *
     * @param str 待转换的字符串
     * @param failValue 转换失败时的返回值
     * @return 返回转换后的值
     */
    public static double toDouble(String str, double failValue) {
        double result;
        try {
            result = Double.parseDouble(str);
        } catch (Exception e) {
            result = failValue;
        }
        return result;
    }

    /**
     * 字符串志Double
     *
     * @param str 待转换的字符串
     * @return 返回转换后的值（如果转换失败则返回0）
     */
    public static double toDouble(String str) {
        return toDouble(str, 0);
    }

    /**
     * 字符串转BigDecimal
     *
     * @param str 待转换的字符串
     * @param failValue 转换失败时返回的值
     * @return 返回转换后的值
     */
    public static BigDecimal toBigDecimal(String str, double failValue) {
        BigDecimal result;
        try {
            result = new BigDecimal(str);
        } catch (Exception e) {
            result = BigDecimal.valueOf(failValue);
        }
        return result;
    }

    /**
     * 字符串转BigDecimal
     *
     * @param str 待转换的字符串
     * @return 返回转换后的值（如果转换失败则返回0）
     */
    public static BigDecimal toBigDecimal(String str) {
        return toBigDecimal(str, 0);
    }

    /**
     * 字符串转Boolean
     *
     * @param str 待转换的字符串
     * @return 返回转换后的值（只有当字符串为true时，不区分大小写，才返回true，其余均返回false）
     */
    public static boolean toBoolean(String str) {
        if (str != null && str.toLowerCase().equals("true")) {
            return true;
        }
        return false;
    }
    
    /**
     * 判断字符串是否为空字符串
     * @param str
     *          待检测的字符串
     * @return 
     *          判断是否是空值
     */
    public static boolean isEmpty(String str) {
        return (str != null && str.length() == 0);
    }
    
    /**
     * 判断字符串是否为空字符串或空字符串对象
     * @param str
     *          待检测的字符串
     * @return 
     *          判断是否为空字符串或空对象
     */
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.length() == 0);
    }
    
    /**
     * 移除所有空格
     * @param str
     *          待处理的字符串
     * @return 
     *          返回处理后的字符串
     */
    public static String removeAllSpace(String str) {
        if(isNullOrEmpty(str)) {
            str = "";
        } else {
            str = str.trim();
            str = str.replaceAll(" ", "");
            str = str.replaceAll(" 　", "");
        }
        return str;
    }
    
    /**
     * 移除指定的开始字符
     * @param str
     * @param trimStr
     * @return
     */
    public static String trimStart(String str, String trimStr) {
        if (!isNullOrEmpty(str)) {
            if (str.startsWith(trimStr)) {
                return str.substring(trimStr.length());
            }
        }
        return str;
    }
    
    /**
     * 移除指定的结束字符
     * @param str
     * @param trimStr
     * @return
     */
    public static String trimEnd(String str, String trimStr) {
        if (!isNullOrEmpty(str)) {
            if (str.endsWith(trimStr)) {
                return str.substring(0, str.length() - trimStr.length());
            }
        }
        return str;
    }
    
    /**
     * 检测字符串是否是数字
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
        if (isNullOrEmpty(str)) {
            return false;
        }
        return str.matches(REGEX_NUMBER);
    }
	
    /**
     * 检查帐号是有效的
     * @param str
     * @return
     */
    public static boolean isValidAccount(String str) {
        return str.matches(REGEX_ACCOUNT);
    }

    /**
     * 检查密码是有效的
     * @param str
     * @return
     */
    public static boolean isValidPassword(String str) {
        return str.matches(REGEX_PASSWORD);
    }

    /**
     * 检查邮箱是有效的
     * @param str
     * @return
     */
    public static boolean isEmail(String str) {
        return str.matches(REGEX_EMAIL);
    }
}