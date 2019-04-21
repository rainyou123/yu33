package com.demo2.tools;

public class MD5Utils {
}

//    public static String getMD5String(final String pwd){
//        try {
//            MessageDigest md = MessageDigest.getInstance("md5");
//            byte[] bytes = pwd.getBytes("utf-8");
//            byte[] bytes1 = md.digest(bytes);
//
//            //a-z A-Z 0-9 / +
//            String str = Base64.getEncoder().encodeToString(bytes1);
//            return str;
//        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
//        return null;
//