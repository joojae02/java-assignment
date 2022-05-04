import java.util.Scanner;

public class p241_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("수학, 과학, 영서 순으로 3개의 점수 입력 >>");
        int math  = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math, science, english);
        System.out.println("평균은 " + me.average());
        scanner.close();
    }
}
class Grade {
    private int math;
    private int science;
    private int english;
    public Grade (int math, int science, int english)
    {
        this.math = math;
        this.english = english;
        this.science = science;
    }
    public int average()
    {
        return (math + english + science) / 3;
    }
}
