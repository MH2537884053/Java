package seven.zero.three.Demo01;

import java.util.Scanner;

/*
判断年份是否为闰年
 */
public class Demo01Bissextile {
    public static void main(String[] args) {
        int year;
        System.out.println("请输入年份：");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        YearJudge yj = new YearJudge();
        yj.methodA(year);
    }
}
