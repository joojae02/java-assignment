import java.util.Scanner;

class Phone {
    private String name;
    private String tel;
    Phone(String name, String tel)
    {
        this.name = name; this.tel = tel;
    }
    public String rname() {return name;}
    public String rtel() {return tel;}

}

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수 >>");
        int p = scanner.nextInt();
        Phone phone [] = new Phone[p];
        for(int i = 0; i < phone.length; i++)
        {
            System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸없이 입력) >>");
            String name = scanner.next();
            String tel = scanner.next();
            phone[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다......");
        while(true)
        {
            int check = 0;
            System.out.print("검색할 이름 >> ");
            String name = scanner.next();
            if(name.equals("그만"))
                break;
            for(int i = 0; i < phone.length ; i++)
                if(phone[i].rname().equals(name))
                {
                    check = -1;
                    System.out.println(name + "의 번호는 " + phone[i].rtel() + "입니다.");
                }
            if(check == 0)
                System.out.println(name + " 이 없습니다.");
        }
    }

}
