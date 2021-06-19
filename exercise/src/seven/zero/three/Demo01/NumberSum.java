package seven.zero.three.Demo01;

public class NumberSum {
    public int methodSum() {
        int sum=0;
        for (int i = 1; i < 100; i+=2) {
            sum = sum + i;
        }
        return sum;
    }
}
