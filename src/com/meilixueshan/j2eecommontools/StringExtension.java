/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meilixueshan.j2eecommontools;

/**
 *
 * @author Administrator
 */
public final class StringExtension {
    /**
     * 字符串转Integer
     * @param str
     *          待转换的字符串
     * @param failValue
     *          默认值（转换失败时，返回的值）
     * @return
     *          转换后的值
     */
    public static Integer toInt(String str, int failValue) {
        int result;
        try
        {
            result = Integer.parseInt(str);
        } catch (Exception ex) {
            result = failValue;
        }
        
        return result;
    }
    
    /**
     * 字符串转换Integer
     * @param str
     *          待转换的字符串
     * @return 
     *         转换后的值（如果转换失败，则返回0）
     */
    public static Integer toInt(String str) {
        return toInt(str, 0);
    }
    
    /**
     * 字符串转Long
     * @param str
     *          待转换的字符串
     * @param failValue
     *          默认值（转换失败时，返回的值）
     * @return 
     *          转换后的值
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
     * @param str
     *          待转换的字符串
     * @return 
     *          转换后的值（如果转换失败，则返回0）
     */
    public static  long toLong(String str) {
        return toLong(str, 0);
    }
    
    /**
     * 字符串转Double
     * @param str
     *          待转换的字符串
     * @param failValue
     *          转换失败时的返回值
     * @return 
     *          返回转换后的值
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
     * @param str
     *          待转换的字符串
     * @return 
     *          返回转换后的值（如果转换失败则返回0）
     */
    public static double toDouble(String str) {
        return toDouble(str, 0);
    }
}
