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
     *         如果转换失败，则返回0
     */
    public static Integer toInt(String str) {
        return toInt(str, 0);
    }
}
