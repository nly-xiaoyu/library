package edu.hunau.hyx.util;

/**
 * @author 五香加孜然
 * @creat2021--09--09--11:38
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by dt
 */
public class MD5Util {

    public static String stringMD5(String input) {

        try {

            // 拿到一个MD5转换器（如果想要SHA1参数换成”SHA1”）

            MessageDigest messageDigest = MessageDigest.getInstance("MD5");


            // 输入的字符串转换成字节数组

            byte[] inputByteArray = input.getBytes();


            // inputByteArray是输入字符串转换得到的字节数组

            messageDigest.update(inputByteArray);


            // 转换并返回结果，也是字节数组，包含16个元素

            byte[] resultByteArray = messageDigest.digest();


            // 字符数组转换成字符串返回
            String hexString = new bytesToHex().bytesToHexString(resultByteArray);
            return (hexString);


        } catch (NoSuchAlgorithmException e) {

            return null;

        }
    }
}
