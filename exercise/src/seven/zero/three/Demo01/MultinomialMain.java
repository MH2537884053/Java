package seven.zero.three.Demo01;

import java.util.Scanner;

public class MultinomialMain {
    public static void main(String[] args) {
        Multinomial mul = new Multinomial();
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.println("请输入：");
        x = sc.nextInt();
        System.out.println("项数为：");
        y = sc.nextInt();
        mul.setA(x,y);
        System.out.println("a为：" + x + "项数为：" + y + "结果为：" + mul.getA());
    }
}
