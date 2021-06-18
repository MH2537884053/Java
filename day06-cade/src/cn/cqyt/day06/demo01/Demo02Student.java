package cn.cqyt.day06.demo01;

public class Demo02Student {
    public static void main(String[] args) {
        // 1.导包
        // 需要使用student类，在同一包下，可省略不写
        Student stu = new Student();

        System.out.println(stu.name); // 默认值： null
        System.out.println(stu.age); // 默认值： 0

        System.out.println("===============");
        stu.name = "圣诞节";
        stu.age = 18;
        System.out.println(stu.age);
        System.out.println(stu.name);

        System.out.println("============");
        stu.study();
        stu.eat();
        stu.sleep();
    }
}
