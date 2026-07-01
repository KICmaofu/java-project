public class lp {
    public static void main(String[] args) {
        try (//输入两个数进行加法
        java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.print("请输入第一个数：");
            double num1 = scanner.nextDouble();
            System.out.print("请输入第二个数：");
            double num2 = scanner.nextDouble();
            double sum = num1 + num2;
            System.out.printf("两个数的和为: %.2f%n", sum);
            //关闭 Scanner 对象
        }
    }
}
