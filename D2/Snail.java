package D2;

import java.util.Scanner;
public class Snail {
    public static void snail(){
        Scanner sc = new Scanner(System.in);
        //달팽이 배열

        int T = sc.nextInt();
        int[] round = new int[T];
        int x = 1; //round check
        for (int a = 0; a < T; a++) {
            round[a] = sc.nextInt();
        }

        for (int a = 0; a < T; a++) {
            int N = round[a];

            int num = 1;
            int row = 0;
            int column = -1;
            int control = 1;

            int[][] arr = new int[N][N];
            int count = N;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < count; j++) {
                    column += control;
                    arr[row][column] = num;
                    num++;
                }
                count--;

                for (int k = 0; k < count; k++) {
                    row += control;
                    arr[row][column] = num;
                    num++;
                }
                control *= -1;
            }

            System.out.println("#" + x);
            x++;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}

