package cn.cqyt.day07.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num;
        for (int i = 0; i < 100; i++) {
            num = r.nextInt(10);  // 实际范围为0~9 [0,9)
            System.out.println(num);
        }
    }
}
