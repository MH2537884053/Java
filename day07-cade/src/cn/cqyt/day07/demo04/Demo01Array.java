package cn.cqyt.day07.demo04;

public class Demo01Array {
    public static void main(String[] args) {
        // 创建长度为三的数组，用来存放Person数组
        Person[] array = new Person[3]; // 数组的缺点：长度一旦创建，不可改变
        System.out.println(array);

        Person one = new Person("嘟嘟",2);
        Person two = new Person("黑风",9);
        Person three = new Person("大马猴",27);

        array[0] = one;  //地址值
        array[1] = two;  //地址值
        array[2] = three;  //地址值

        System.out.println(array[1].getName() + "," + array[2].getName());
    }
}
