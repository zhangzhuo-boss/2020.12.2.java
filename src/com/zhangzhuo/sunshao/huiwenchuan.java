package com.zhangzhuo.sunshao;

import java.util.Scanner;

public class huiwenchuan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        if (isHuiWen(inputString)) {
            System.out.println("正确");
        } else {
            System.out.println("错误");
        }
    }

    /**
     * 判断一个字符串是否是回文串
     * 啥叫回文?例子如下：
     * 1
     * 22
     * 3443
     * 55555655555
     *
     * @param inputString 字符串输入
     * @return 是否回文，是：true，否：false
     */
    public static boolean isHuiWen(String inputString) {
        /*
         * 例如：3443 的 length=4， 第一个位置为0， leftChar = 3
         *
         * 3   4   4   3
         * 0   1   2   3
         */
        for (int i = 0; i < inputString.length() / 2; i++) {
            char leftChar = inputString.charAt(i);
            char rightChar = inputString.charAt(inputString.length() - i - 1);

            if (leftChar == rightChar) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
