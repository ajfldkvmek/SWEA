package D2;
import java.util.Scanner;

/*
    swea 1859 백만장자 프로젝트

    1. 원재는 연속된 N일 동안의 물건의 매매가를 예측하여 알고 있다.
    2. 당국의 감시망에 걸리지 않기 위해 하루에 최대 1만큼 구입할 수 있다.
    3. 판매는 얼마든지 할 수 있다.

    첫 번째 줄에 테스트 케이스의 수 T가 주어진다.

    각 테스트 케이스 별로 첫 줄에는 자연수 N(2 ≤ N ≤ 1,000,000)이 주어지고,

    둘째 줄에는 각 날의 매매가를 나타내는 N개의 자연수들이 공백으로 구분되어 순서대로 주어진다.

    각 날의 매매가는 10,000이하이다.
    int 보다는 long 쓰기
 */
public class Millionaire {

    public static void million(){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int round = 1; round <= T; round++){

            int N = sc.nextInt();
            int [] arr = new int[N];
            int temp = 0;
            int index=0;
            int new_index=0;
            long money = 0;
            int k = 0;

            //배열에 값 저장
            for(int a=0; a<N; a++){
                arr[a] = sc.nextInt();
            }

            //백만장자 시작
            while(true){

                if(index >= N) break;

                for(int a = index; a < N; a++){
                    if(temp < arr[a]){
                        temp = arr[a];
                        index = a; //가장 큰 값의 위치를 index에 저장
                    }
                }

                //System.out.println(temp + " " + index);

                for(;new_index<=index;new_index++){
                    money += arr[index]-arr[new_index];
                    //System.out.println(money +" "+arr[index]+" "+arr[new_index]);
                }

                temp = 0;
                index += 1;

            }
            System.out.println("#"+round+" "+money);
        }
    }
}
