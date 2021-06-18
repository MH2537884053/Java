package cn.cqyt.day06.demo03;

//Java 的封装性
public class Demo02Method {
    public static void main(String[] args) {
        int[] array = {10,6,9,12,7,21,19};

        int max = getMax(array);
        System.out.println(max);
    }

    // 给我一个数组，我还你一个最大值
    public static int getMax(int[] num) {
        int max;
        max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
