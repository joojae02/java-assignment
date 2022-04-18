import java.util.Scanner;

public class p164_6 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i:unit)
        {
            System.out.println(i + "원 : " + num / i);
            num %= i;
        }
    }
}
