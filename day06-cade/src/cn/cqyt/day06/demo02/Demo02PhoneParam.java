package cn.cqyt.day06.demo02;

public class Demo02PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();

        one.brand = "小米";
        one.price = 8800;
        one.color = "中国红";

        method1(one);
    }

    public static void method1(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
