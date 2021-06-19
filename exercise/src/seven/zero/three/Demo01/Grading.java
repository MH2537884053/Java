package seven.zero.three.Demo01;

public class Grading extends Grade{
    public char methodA(double num) {
        if (num>=90 && num<=100) {
            // System.out.println(num + "等级为：A");
            return 'A';
        }
        else if(num>=80 && num<90) {
            // System.out.println(num + "等级为：B");
            return 'B';
        }
        else if(num>=70 && num<80) {
            // System.out.println(num + "等级为：C");
            return 'C';
        }
        else if(num>=60 && num<700) {
            // System.out.println(num + "等级为：D");
            return 'D';
        }
        else{
            // System.out.println(num + "等级为：E");
            return 'E';
        }
    }
}
