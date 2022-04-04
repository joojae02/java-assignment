import java.util.Scanner;

public class p112_12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산 >> ");
        float a = scanner.nextFloat();
        String s = scanner.next();
        float b = scanner.nextFloat();
        switch (s){
            case "+" :
                System.out.println(a + " + " + b +"의 계산 결과는 " + (a+b));
                break;
            case "-":
                System.out.println(a + " - " + b +"의 계산 결과는 " + (a-b));
                break;
            case "*" :
                System.out.println(a + " * " + b +"의 계산 결과는 " + (a*b));
                break;
            case "/" :
                if(b == 0)
                    System.out.println("0으로는 나눌수 없습니다");
                else
                    System.out.println(a + " / " + b +"의 계산 결과는 " + (a/b));
                break;
        }
    }
}
