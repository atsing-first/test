package com.hande;

/**
 * @author atsing
 * @date 2021/7/9
 */
public class Test01 {
    public static void main(String[] args) {
//       字符串中 . 分隔符的使用 , 具备特殊含义, 需要转义
        String a = "207.0";
        System.out.println(a.split("\\.")[0]);
    }
}
