public class p165_10 {
    public static void main(String[] args) {
        int [][] num = new int[4][4];
        int [] n = new int[10];
        for(int i = 0; i< 10; i++)
        {
            int check = 0;
            int tmp = (int)(Math.random() * 10) + 1;
            for(int k = 0; k < i ; k ++)
            {
                if (tmp == n[k])
                {
                    check = 1;
                    break;
                }
            }
            if(check == 1)
                i--;
            else
                n[i] = tmp;
        }
        for(int i = 0; i< 10; i++)
            num[n[i]/4][n[i]%4] = (int)(Math.random()*10)+1;
        for(int i = 0; i< 4; i++)
        {
            for(int j = 0; j< 4; j++)
                System.out.print(num[i][j] + " ");
            System.out.println();
        }
    }




}
