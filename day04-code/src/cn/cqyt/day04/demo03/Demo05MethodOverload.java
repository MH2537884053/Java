package cn.cqyt.day04.demo03;

public class Demo05MethodOverload { // 方法重载
    public static void main(String[] args) {
        sum(10,30);
    }

    public static int sum(int a,int b) {
        return a+b;
    }
    // 参数类型不同
    public static int sum(double a,double b) {
        return (int)(a+b);
    }
    // 参数个数不同
    public static int sum(int a,int b,int c) {
        return a+b;
    }
    // 错误写法 与参数名称无关
    /*public static int sum(int x,int y) {
        return x+y;
    }*/
    // 与方法的返回值类型无关
    /*public static double sum(int a,int b) {
        return a + b + 0.0;
    }*/

    // 参数的多类型顺序不同
    public static int sum(double a,int b) {
        return (int)(a+b);
    }
    public static int sum(int a,double b) {
        return (int)(a+b);
    }
}
