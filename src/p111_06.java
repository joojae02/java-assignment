import java.util.Scanner;

public class p111_06 {
    public static void main(String[] args) {
        System.out.print("1~99 사이의 정수를 입력하시오 >>");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if((a/10)%3 == 0 && (a%10)%3 == 0)
        {
            System.out.println("박수짝짝");
        }
        else if((a/10)%3 == 0 || (a%10)%3 == 0)
        {
            System.out.println("박수짝");
        }
    }
}
