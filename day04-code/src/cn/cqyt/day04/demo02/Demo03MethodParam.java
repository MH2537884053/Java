package cn.cqyt.day04.demo02;

public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(10,12); // 120
        System.out.println("==============");
        method2();
    }

    // 两数相乘，必须知道两数各自是多少，否则无法无法成
    // 有参数
    public static void method1(int a,int b) {
        int result = a*b;
        // return result;
        System.out.println(result);
    }

    // 循环打印十次HelloWord
    // 无参数
    public static void method2() {
        for (int i = 0; i < 10; i++) {
            System.out.println("HelloWord" + (i+1));
        }
    }
}
