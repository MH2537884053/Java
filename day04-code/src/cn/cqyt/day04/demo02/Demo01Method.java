package cn.cqyt.day04.demo02;

public class Demo01Method {
    public static void main(String[] args) {
        printMthod();
    }
    public static void printMthod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
