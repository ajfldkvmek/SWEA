package D2;

import java.util.Scanner;
public class PascalTri {

    public  static void pascal(){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){
            int N = sc.nextInt();

            int [][] arr = new int[N][N];

            for(int a = 0; a < N; a++){
                for(int b = 0; b <= a; b++){

                    if(a==b)arr[a][b]=1;
                    if(b==0) arr[a][b]=1;

                    else {
                        arr[a][b] = arr[a-1][b-1]+arr[a-1][b];
                    }
                }
            }

            System.out.println("#"+test_case);
            for(int k = 0;k < N; k++){
                for(int i = 0; i <=k; i++){
                    System.out.print(arr[k][i]+" ");
                }
                System.out.println();
            }

        }
    }
}
