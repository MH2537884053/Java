package seven.zero.three.Demo02;

import java.util.ArrayList;
import java.util.Random;

/*
题目要求：
定义一个int型数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，平均值，和值，并输出出来。
 */
public class JudgeSun {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        int max = 0;
        int min = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt());
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(max < list.get(i))
                max = list.get(i);
            if(min > list.get(i))
                min = list.get(i);
            sum += list.get(i);
        }
        System.out.println("最大值：" + max + ",最小值：" + min + ",和：" + sum);
    }
}
