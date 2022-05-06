import java.util.Scanner;

class Circle{
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public int rad()
    {
        return radius;
    }
    public void show()
    {
        System.out.println("(" + x + "," + y + ")" + radius);
    }
}

public class CircleManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c [] = new Circle[3];
        for (int i = 0; i<c.length; i++)
        {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        int r = 0;
        int t = 0;
        for (int i = 0; i<c.length; i++)
        {
            int tmp = c[i].rad();
            if(r <= tmp)
            {
                r = tmp;
                t = i;
            }

        }
        System.out.print("가장 면적이 큰 원은 ");
        c[t].show();
        scanner.close();
    }

}
