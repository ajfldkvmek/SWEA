package D2;

import java.util.Scanner;

/*
    SWEA2001 파리 죽이기

    N을 입력받아서 N x N 배열 생성
    N x N 배열 안의 숫자는 해당 영역에 존재하는 파리의 개수를 의미한다.
    N은 5 이상 15이하

    M x M 크기의 파리채를 한 번 내리쳐 최대한 많은 파리를 죽이고자 한다.
    M은 2이상 N이하

    입력값 첫 줄에 N과 M이 주어짐

 */
public class Fly_kill {

    public static void flykill(){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){

            int N = sc.nextInt();
            int M = sc.nextInt();

            int m = (N-M); //이동 횟수

            //int fly=0; // 잡은 파리 수
            int max_fly = 0;
            int fly = 0; //잡은 파리 수

            int [][] arr = new int[N][N];

            for(int a = 0; a < N; a++){
                for(int b = 0; b < N; b++){
                    arr[a][b] = sc.nextInt();
                }
            }

            //MxM행렬 만들기

            for(int x = 0; x <= m; x++){
                for(int y = 0; y <= m; y++){

                    fly = 0; //잡은 파리 수

                    for(int a = 0; a < M; a++){
                        for(int b = 0; b < M; b++){
                            fly += arr[x+a][y+b];
                        }
                    }

                    // System.out.println(fly);

                    if(max_fly < fly) max_fly = fly;
                }
            }

            System.out.println("#"+test_case+" "+max_fly);
        }

    }
}
