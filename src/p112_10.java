import java.util.Scanner;

public class p112_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력 >>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int r1 = scanner.nextInt();
        System.out.print("두번째 원의 중심과 반지름 입력 >>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int r2 = scanner.nextInt();
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if(d <= r1 + r2)
            System.out.println("두원은 서로 겹친다");
        else
            System.out.println("안겹친다");
    }
}
