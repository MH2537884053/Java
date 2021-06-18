package cn.cqyt.day04.demo03;

public class Demo04MethodNotice {
    public static void main(String[] args) {

    }

    /*
    注意事项：
    一个方法中可以有多个return，但是必须保证只有一个return被用到
     */
    public static int getMax(int a,int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void method1() {
        return;
    }
}
