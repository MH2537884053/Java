package cn.cqyt.day06.demo01;

import java.util.Arrays;

/*
面向过程：当要实现一个功能时，都必须要自己亲历亲为
面向对象：当要实现一个功能时，找一个会此功能的人帮我做事
 */
public class Demo01PrintArray {
    public static void main(String[] args) {
        // 实现一个数组，要求打印格式： [a,b,c,d]
        // 使用面向过程，每一步都需要亲历亲为
        int array[] = {1,2,3,4,5,6};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i == array.length-1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println("============");

        // 使用面向对象
        // 找一个JDK给我们提供的Arrays类
        // 其中toString方法，提供了我们想要的格式
        System.out.println(Arrays.toString(array));
    }
}
