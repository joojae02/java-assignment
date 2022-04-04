import java.util.Scanner;

public class p110_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 3개 입력 >>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int tmp = 0;
        if((a > b && b > c) || (a < b && b < c))
            tmp = b;
        else if((a > c && c > b) || (a < c && c < b))
            tmp = c;
        else if((c > a && a > b) || (c < a && a < b))
            tmp = a;
        System.out.println("중간값은 " + tmp);
    }
}
