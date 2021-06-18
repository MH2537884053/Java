package cn.cqyt.day06.demo04;

/*
谁调用this谁就是this 如这里的person和this地址一样
 */
public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "懒洋洋";
        person.sayHello("蛋蛋");
        System.out.println(person);
    }
}
