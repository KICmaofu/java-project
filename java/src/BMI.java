//输入函数
public class BMI {
    public static void main(String[] args) {
        try (//输入体重和身高
        java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("请输入体重（kg）：");
            double weight = scanner.nextDouble();
            System.out.print("请输入身高（m）：");
            double height = scanner.nextDouble();
            //计算BMI
            double bmi = weight / (height * height);
            //输出BMI值
            System.out.printf("BMI值为: %.2f%n", bmi);
        }
    }
    
}
