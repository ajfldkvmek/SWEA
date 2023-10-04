package D2;
import java.util.Scanner;

//SWEA #1024
public class MFN { //최빈값
    public static void mfn(){
        Scanner sc = new Scanner(System.in);


        //1000명 최빈값

        int T = sc.nextInt();

        //int [][] arr = new int[T][101];// 0~100까지 점수 빈도를 저장;
        int [] arr = new int[101];
        int [] result = new int[10];
        int score;

        int max_score = 0;//최빈수의 최댓값

        for(int test_case = 0; test_case < T; test_case++){ //테스트케이스 T번 만큼 실행

            //int [] arr = new int[101];
            int temp = 0;
            int a = sc.nextInt();

            for(int i = 0; i < 1000; i++){//1000명의 점수 입력;
                score = sc.nextInt();
                if(score>=0&&score<=100) arr[score] += 1;
            }

            for(int j = 0; j < arr.length-1; j++){
                if(temp <= arr[j]) {
                    temp = arr[j];
                    result[test_case] = j;
                }
                arr[j] = 0;
            }

            System.out.println("#"+a+" "+result[test_case]);
        }

    }
}
