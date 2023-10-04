package D1;

import java.util.Scanner;
public class Average {
    public static void average(){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int a =1; a<=T; a++){
            double sum = 0;
            int num;
            for(int b = 0; b < 10; b++){
                num = sc.nextInt();
                sum += num;
            }

            sum = sum/10;

            System.out.println("#"+a+" "+String.format("%.0f", sum));
        }
    }
}
