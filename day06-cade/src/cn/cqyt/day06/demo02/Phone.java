package cn.cqyt.day06.demo02;

public class Phone {
    String brand; // 品牌
    int price; // 价格
    String color; // 颜色

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    }

    public void sendMessage() { // 发短信
        System.out.println("发信息");
    }
}
