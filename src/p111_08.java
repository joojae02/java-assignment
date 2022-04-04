import java.util.Scanner;

public class p111_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x1 y1의 값 >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        System.out.print("x2 y2의 값 >> ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if(inRect(x1, y1, 100, 100, 200, 200) || inRect(x2, y2, 100, 100, 200, 200) ||
                inRect(x1, y2, 100, 100, 200, 200) ||inRect(x2, y1, 100, 100, 200, 200) ||
                inRect(100, 100, x1, y1, x2, y2) ||inRect(200, 200, x1, y1, x2, y2) ||
                inRect(200, 100, x1, y1, x2, y2) ||inRect(100, 200, x1, y1, x2, y2)) {
            System.out.println("충돌합니다.");
        }
        else System.out.println("충돌하지 않습니다.");
    }
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2)
    {
        if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else return false;
    }
}
