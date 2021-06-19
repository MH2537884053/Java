package seven.zero.three.Demo01;

public class YearJudge {
    public void methodA(int year) {
        if(year%4 == 0 || year%100 !=0 && year%400 == 0) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
