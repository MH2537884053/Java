package cn.cqyt.day04.demo03;

/*
题目要求：
定义一个方法，用来求出1~100之间数字的和
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是" + getSum());
    }

    /*
    方法三要素：
    返回值：有返回值，返回结果为int
    方法名称：getSum()
    参数列表：已经确定了范围，所以不用告诉我任何东西不需要参数
     */

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        return sum;
    }
}
