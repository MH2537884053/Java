package cn.cqyt.day07.demo02;

/*
匿名对象格式 ：new 类名();
只要右边的，不要左边的名字和赋值运算符
 */
public class Demo01Anonymous {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "光头强";
        person.showName(); // 光头强

        // 匿名对象
        new Person().name = "肥波"; // 第二次
        new Person().showName(); // null 第三次创建对象
    }
}
