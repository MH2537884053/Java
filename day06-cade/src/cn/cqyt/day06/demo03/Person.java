package cn.cqyt.day06.demo03;

public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("姓名：" + name + "，年龄：" + age);
    }

    // 这个成员方法，专门用与向age设置数据
    public void setAge(int age) {
        if(age < 100 && age > 0) {
            this.age = age;
        } else {
            System.out.println("数据不合理");
        }
    }

    // 这个成员方法，用与获取age数据
    public int getAge() {
        return age;
    }
}
