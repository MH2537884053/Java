package seven.zero.three.Demo01;

import java.util.Scanner;

public class MainGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grade grade = new Grade();
        System.out.println("请输入成绩：");
        while(true) {

            double g = sc.nextDouble();   // 注意nextDouble后面的（）；
            grade.setGrade(g); // 注意括号
            if (g>0 && g<=100) {
                break;
            }
        }
        double num = grade.getGrade();
        Grading grg = new Grading();
        // grg.methodA(num);
         System.out.println(num + "等级为：" + grg.methodA(num));  // void 无返回值 只能单独调用
    }
}
