package cn.cqyt.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student("翠花",18);
        System.out.println("名字：" + stu.getName() + "，年龄：" + stu.getAge());

        // 不是说有了全参构造方法set就没用了，set()方法可以改信息
        stu.setAge(19);
        System.out.println("名字：" + stu.getName() + "，年龄：" + stu.getAge());
    }
}
