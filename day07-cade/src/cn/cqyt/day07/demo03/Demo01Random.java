package cn.cqyt.day07.demo03;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt();

        System.out.println("生成随机数：" + num);
    }
}
