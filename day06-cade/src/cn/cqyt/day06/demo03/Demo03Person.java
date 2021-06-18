package cn.cqyt.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "大表哥";
        person.setAge(102);
        person.show();
    }
}
