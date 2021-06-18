package cn.cqyt.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone one = new Phone();

        System.out.println(one.brand); // null
        System.out.println(one.price); // 0
        System.out.println(one.color); // null

        System.out.println("============");
        one.brand = "华为";
        one.price = 2500;
        one.color = "蓝色";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("=================");
        one.call("宝贝");
        one.sendMessage();
    }
}
