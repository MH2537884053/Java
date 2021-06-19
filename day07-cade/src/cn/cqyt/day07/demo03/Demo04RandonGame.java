package cn.cqyt.day07.demo03;

import java.util.Random;
import java.util.Scanner;

/*
用代码模拟猜数字小游戏 [1~100]
 */
public class Demo04RandonGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你猜的数字：");
            int guessNum = sc.nextInt();
            if (guessNum > randomNum) {
                System.out.println("太大了！！");
            } else if (guessNum < randomNum) {
                System.out.println("太小了！！！");
            } else {
                System.out.println("恭喜你猜对了！");
                break;
            }
        }
        System.out.println("游戏结束！！！");
    }
}
