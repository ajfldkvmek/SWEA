package D2;
import java.util.Scanner;
public class Game369 {

    public static void g369() {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        for(int a = 1; a <= N; a++){

            String str = Integer.toString(a);

            int count =0;
            for(int b = 0; b < str.length(); b++){

                if(str.charAt(b)=='3'||str.charAt(b)=='6'||str.charAt(b)=='9'){
                    count++;
                }
            }
            if(count==0)
                System.out.print(str+" ");
            else{
                for(int c = 0; c < count; c++){
                    System.out.print("-");
                }
                System.out.print(" ");
            }
        }
    }
}
