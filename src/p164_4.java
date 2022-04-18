import java.util.Scanner;

public class p164_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        for(int i = 0 ; i<= c - 'a' ; i++)
        {
            for(char j = 'a'; j<= c - i ; j++)
                System.out.print(j);
            System.out.println();
        }
    }
}
