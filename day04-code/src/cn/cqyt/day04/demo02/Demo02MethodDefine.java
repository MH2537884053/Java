package cn.cqyt.day04.demo02;

/*
方法调用的三种格式：
1.单独调用： 方法名称(参数);
2.赋值调用： 数据类型 变量 = 方法名称(参数);
3.打印调用： System.out.println(方法名称(参数));
 */

public class Demo02MethodDefine {
    public static void main(String[] args) {
        // 单独调用
        sum(10,20);
        // 赋值调用： 赋值给变量你想怎么玩都可以
        int num = sum(5,6); // 11
        num += 100;
         System.out.println(num);
        // 打印调用
        System.out.println(sum(20,20)); // 40
    }
    public static int sum(int a,int b){
        System.out.println("方法执行啦！");
        return a+b;
    }
}
