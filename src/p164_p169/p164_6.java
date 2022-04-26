package p164_p169;

import java.util.Scanner;

public class p164_6 {
    public static void main(String[] args) {
        int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int [] tmp = new int[8];
        System.out.print("금액을 입력하시오 >> ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0; i< 8; i++)
        {
            tmp[i] = num / unit[i];
            num %= unit[i];
        }
        for(int i = 0; i< 8; i++)
            if(tmp[i] != 0)
            System.out.println(unit[i] + "원 : " + tmp[i] + "개");

    }
}
