package cn.cqyt.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(methodSame(100,200));
    }

    public static boolean methodSame(int a,int b) {
       /* boolean same;
        if (a == b) {
            same = true;
        }
        else {
            same = false;
        }*/

        // boolean same = a == b ? true : false;
        // boolean same = a == b;
        return a == b;
    }
}
