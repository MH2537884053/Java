package cn.cqyt.day07.demo04;

import java.util.ArrayList;

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 错误写法，ArrayList不支持基本数据类型，（集合里面存的是地址，所以基本类型不能用）
//        ArrayList<int> list = new ArrayList<>();

        ArrayList<Integer> listA = new ArrayList<>();

        listA.add(100);
        listA.add(400);
        listA.add(30);
        listA.add(420);
        System.out.println(listA);
    }
}
