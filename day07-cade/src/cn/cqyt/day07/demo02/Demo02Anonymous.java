package cn.cqyt.day07.demo02;

import java.util.Scanner;

/*
匿名对象作方法参数
 */
public class Demo02Anonymous {
    public static void main(String[] args) {
        // 普通赋值
     /*   Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("输入：" + num);*/

        // 匿名对象赋值
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        // 普通传参
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        // 匿名对象传参
//        methodParam(new Scanner(System.in));

        int num = methodReturn().nextInt();
        System.out.println("输入：" + num);
    }

    public static void methodParam(Scanner sc) {
        System.out.println(sc);
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in); // 谁调用我，我就把值给谁
    }
}
