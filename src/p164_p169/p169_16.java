package p164_p169;

import java.util.Scanner;

public class p169_16 {
    public static void main(String[] args) {
        String str[] = {"가위", "바위", "보"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("가위바위보 게임을 시작합니다.");
        while(true) {
            System.out.print("가위바위보 >> ");
            String s = scanner.next();
            if(s.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            int n = (int)(Math.random()*3);
            if(str[n].equals("가위")) {
                if(s.equals("바위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + str[n] + " , 사용자가 이겼습니다.");
                else if(s.equals("보"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + str[n] + " , 컴퓨터가 이겼습니다.");
                else if(s.equals("가위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + str[n] + " , 비겼습니다.");
            }
            else if(str[n].equals("바위")) {
                if(s.equals("보"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + str[n] + " , 사용자가 이겼습니다.");
                else if(s.equals("가위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + str[n] + " , 컴퓨터가 이겼습니다.");
                else if(s.equals("바위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + str[n] + " , 비겼습니다.");
            }
            else if(str[n].equals("보")) {
                if(s.equals("가위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + str[n] + " , 사용자가 이겼습니다.");
                else if(s.equals("바위"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + str[n] + " , 컴퓨터가 이겼습니다.");
                else if(s.equals("보"))
                    System.out.println("사용자 = " + s + ", 컴퓨터 = " + str[n] + " , 비겼습니다.");
            }
        }
    }
}
