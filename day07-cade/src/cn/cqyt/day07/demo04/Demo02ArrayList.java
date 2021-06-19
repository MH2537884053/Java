package cn.cqyt.day07.demo04;

import java.util.ArrayList;

/*
数组一旦创建长度不可改变
ArrayList长度可以改变
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        list.add("吉吉");
        System.out.println(list);

        list.add("毛毛");
        list.add("罗卜头");
        list.add("涂涂");
        System.out.println(list);
    }
}
