package cn.cqyt.day04.demo03;

/*
题目要求：
定义一个方法：指定打印输出HelloWord的次数
 */

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }

    /*
    方法三要素：
    返回值：没有返回值，不需要告诉我你打印的结果
    方法名称：printCount()
    参数列表：需要告诉我打印几次，否则我不知道，有参数
     */

    public static void printCount(int a) {
        for (int i = 1; i <= a; i++) {
            System.out.println("HelloWord" + i);
        }
    }
}
