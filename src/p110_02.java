import java.util.Scanner;

public class p110_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("2자리수 정수 입력(10~99)>>");
        int a = scanner.nextInt();
        if(a/10 == a%10)
        {
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
    }
}
