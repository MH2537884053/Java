package cn.cqyt.day06.demo03;

public class Demo01VariableDifference {
    String name; //成员变量，不用赋初值

    public static void method1() {
        int age = 18; // 局部变量 ，赋初值
        System.out.println(age);
      //  System.out.println(name);
    }

    public void method2() {
        int age = 18;
        System.out.println(age);
        System.out.println(name);
    }

    public void method3(int param) {  // 方法的参数也是局部变量
        int num;
        // System.out.println(age); // 错误写法，出了作用域
        // System.out.println(num); // 没赋值，不能使用

        //参数在方法调用的时候，必然会被赋值
        System.out.println(param); // 没有报错，
    }
}
