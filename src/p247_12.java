import java.util.Scanner;

class Sit{
    private String name [] = {"---","---","---","---","---","---","---","---","---","---"};
    public void print()
    {
        for(int i= 0; i< name.length; i++)
            System.out.print(name[i] + " ");
        System.out.println();
    }
    public void putName(String name, int num)
    {
        if(num > 10 || num < 1)
        {
            System.out.println("없는 번호입니다.");
            return;
        }
        this.name[num - 1] = name;
    }
    public void delName(String name)
    {
        for(int i = 0; i< this.name.length; i++)
        {
            if(this.name[i].equals(name))
            {
                this.name[i] = "---";
                return;
            }
        }
        System.out.println("없는 이름입니다.");
    }

}
class p247_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sit S = new Sit();
        Sit A = new Sit();
        Sit B = new Sit();
        System.out.println("명품콘서트홀 예약 서비스입니다.");
        while(true)
        {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int c = scanner.nextInt();
            if(c == 4)
                break;
            else if(c == 1)
            {
                int tmp;
                System.out.print("좌석 구분 S(1), A(2), B(3) >>");
                tmp = scanner.nextInt();
                if(tmp == 1)
                    S.print();
                else if(tmp == 2)
                    A.print();
                else if(tmp == 3)
                    B.print();
                System.out.print("이름>>");
                String name = scanner.next();
                System.out.print("번호>>");
                int num = scanner.nextInt();
                if(tmp == 1)
                    S.putName(name,num);
                else if(tmp == 2)
                    A.putName(name,num);
                else if(tmp == 3)
                    B.putName(name,num);
            }
            else if(c == 2)
            {
                System.out.print("S >> ");
                S.print();
                System.out.print("A >> ");
                A.print();
                System.out.print("B >> ");
                B.print();
            }
            else if(c == 3)
            {
                int tmp;
                System.out.print("좌석 구분 S(1), A(2), B(3) >>");
                tmp = scanner.nextInt();
                if(tmp == 1)
                    S.print();
                else if(tmp == 2)
                    A.print();
                else if(tmp == 3)
                    B.print();
                System.out.print("이름>>");
                String name = scanner.next();
                if(tmp == 1)
                    S.delName(name);
                else if(tmp == 2)
                    A.delName(name);
                else if(tmp == 3)
                    B.delName(name);
            }


        }
    }
}
