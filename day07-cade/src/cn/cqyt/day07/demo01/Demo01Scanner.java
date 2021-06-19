package cn.cqyt.day07.demo01;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        // System.in从键盘输入
        Scanner sc = new Scanner(System.in);

        //获取键盘输入的int数值
        int num = sc.nextInt();
        System.out.println("输入的数字：" + num);

        // 获取键盘输入的String字符串
        String num1 = sc.next();
        System.out.println("输入的字符串：" + num1);
    }
}
