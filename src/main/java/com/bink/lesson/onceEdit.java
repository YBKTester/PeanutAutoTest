package com.bink.lesson;

/**
 * @author yangbingkun
 * 2020/7/20 --4:31 下午
 */

public class onceEdit {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String str1 = "palesdasdads";
        String str2 = "palesdasdads2";
        boolean res = ifOnceEdit(str1, str2);
        //获取当前时间
        long endTime = System.currentTimeMillis();
        System.out.println(res);
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");

    }

    private static boolean ifOnceEdit(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) >= 2) {
            return false;
        } else if (str1.length() == str2.length()) {
            int count = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    count = count + 1;
                }
            }
            if (count >= 2) {
                return false;
            }
        } else {
            String str11 = str1.length() > str2.length() ? str1 : str2;
            String str22 = str1.length() > str2.length() ? str2 : str1;
            for (int i = 0; i < str22.length(); i++) {
                if (str11.charAt(i) != str22.charAt(i)) {
                    String str111 = str11.substring(i + 1);
                    String str222 = str22.substring(i);
                    if (str11.substring(i + 1).equals(str222)) {
                        return true;
                    }

                }
            }
        }

        return false;
    }
}


