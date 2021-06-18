package cn.cqyt.day06.demo02;

public class Demp03PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    public static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "vivo";
        one.price = 1500;
        one.color = "银白色";
        return one;
    }
}
