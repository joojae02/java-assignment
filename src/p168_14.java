import java.util.Scanner;

public class p168_14 {
    public static void main(String[] args) {
        String couse [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95,88,76,62,55};

        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            int tmp = -1;
            System.out.print("과목 이름>>");
            String c = scanner.next();
            if(c.equals("그만"))
                break;
            for(int i = 0; i<5;i++)
                if(couse[i].equals(c))
                {
                    tmp = i;
                    break;
                }
            if(tmp == -1)
                System.out.println("없는 과목입니다.");
            else
                System.out.println(couse[tmp] + "의 점수는 "+ score[tmp] + "입니다.");
        }

    }

}
