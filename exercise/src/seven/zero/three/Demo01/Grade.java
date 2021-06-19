package seven.zero.three.Demo01;

public class Grade {
    private double grade;
    public void setGrade(double grade) {
        // this.grade = grade;
        if (grade<=100.0 && grade>0.0) {
            this.grade = grade;
        } else {
            System.out.println("输入成绩不合理，请从新输入");    // 放在else中显示，if中不显示
        }
    }

    public double getGrade() {
        return grade;
    }
}
