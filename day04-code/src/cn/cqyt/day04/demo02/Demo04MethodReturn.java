package cn.cqyt.day04.demo02;

/*
注意：
1.对于有返回值的，可以用单独调用、赋值调用和打印调用
2.对于没有返回值的，只能用单独调用，不能使用赋值调用和打印调用
 */
public class Demo04MethodReturn {
    public static void main(String[] args) {
        printSum(10,20); // 30
        int num = getSum(20,20);
        System.out.println(num);
        System.out.println("============");
        getSum(15,25); // 正确写法，但是没有用到返回值
    }

    // 我有返回值，谁调用我，我就把计算结果给谁
    public static int getSum(int a,int b) {
        int result = a + b;
        return result;
    }

    // 没有返回值，我只负责自己打印
    public static void printSum(int a,int b) {
        System.out.println(a+b);
    }
}
