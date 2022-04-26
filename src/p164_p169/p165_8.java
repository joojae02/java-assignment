package p164_p169;

import java.util.Scanner;

public class p165_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개? ");
        int n = scanner.nextInt();
        int [] num = new int[n];
        for(int i = 0; i< n; i++)
        {
            int check = 0;
            int tmp = (int)(Math.random() * 100) + 1;
            for(int k = 0; k < i ; k ++)
            {
                if (tmp == num[k])
                {
                    check = 1;
                    break;
                }
            }
            if(check == 1)
                i--;
            else
                num[i] = tmp;

        }
        for(int i = 0; i< n; i++)
        {
            if(i % 10 == 0)
                System.out.println();
            System.out.print(num[i] + " ");
        }
    }
}
