package cn.cqyt.day07.demo01;

import java.util.Scanner;

/*
题目：
从键盘输入三个int数字，求出最大值。
 */
public class Demo03ScannerMax {
    public static void main(String[] aegs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第一个数：");
        int b = sc.nextInt();
        System.out.println("请输入第一个数：");
        int c = sc.nextInt();

        // 用条件运算符来比较大小
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        System.out.println("最大值为:" + max);
    }
}
