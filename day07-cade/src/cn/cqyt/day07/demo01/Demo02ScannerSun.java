package cn.cqyt.day07.demo01;

import java.util.Scanner;

/*
题目：
从键盘输入两个整数 求和。
 */
public class Demo02ScannerSun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num1 = sc.nextInt();
        int result = num + num1;
        System.out.println("两数之和：" + result);
    }
}
