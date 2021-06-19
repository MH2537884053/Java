package seven.zero.three.Demo02;

import java.util.ArrayList;
import java.util.Random;

/*
题目要求：
定义一个int型数组，包含10个元素，分别赋值为1~10，然后将数组中的元素都向前移一个位置。
 */
public class RandomArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(10) + 1);
        }
        System.out.println("原始数组：" + list);
       /* for (int j = list.size() - 1; j >= 1; j--) {
            temp = list.get(j);
            list.get(j) = list.get(j-1); // 错误写法
            list.get(j-1) = temp;
            list1.add(temp);
        }*/
        for (int j = 0; j < list.size(); j++) {
            if(j == list.size()-1) {
                list1.add(list.get(0));
            } else {
                list1.add(list.get(j+1));
            }
        }
        System.out.println("新数组：" + list1);
    }
}
