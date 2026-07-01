public class Scanner {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("请输入一个整数：");
        int number = scanner.nextInt();
        System.out.println("您输入的整数是：" + number);
        scanner.close();
    }
}