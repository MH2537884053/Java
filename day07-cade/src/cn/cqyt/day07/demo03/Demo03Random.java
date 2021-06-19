package cn.cqyt.day07.demo03;

import java.util.Random;

/*
根据int变量的n值，来获取随机数字，范围是[1~n]
 */
public class Demo03Random {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 7;

        for (int i = 0; i < 100; i++) {
            // 原本范围是[0~7),整体加一后范围变成[1~7]
            int result = r.nextInt(n) + 1;
            System.out.println(result);
        }
    }
}
