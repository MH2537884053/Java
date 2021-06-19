package cn.cqyt.day07.demo04;


import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean success = list.add("懒洋洋"); // 返回值为 Boolean
        System.out.println(success);

        list.add("喜羊羊");
        list.add("灰太狼");
        list.add("暖洋洋");
        System.out.println(list);

        String whoRemove = list.remove(2); // 删除索引值为2的值
        System.out.println("被删除的是：" + whoRemove);
        System.out.println(list);
    }
}

