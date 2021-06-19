package seven.zero.three.Demo01;

public class Multinomial {
    private int a;
    public void setA(int a,int b) {
        int sum = 0;
        int a1 = 0;
        if(a <= 9 && a > 0) {
            for (; b > 0; b--) {
                a1 = a1 * 10 + a;
                sum = sum + a1;
            }
            this.a = sum;

        } else {
            System.out.println("输入不合法！");
        }
    }

    public int getA() {
        return a;
    }
}
