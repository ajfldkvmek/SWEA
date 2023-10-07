package D2;

import java.util.Arrays;
import java.util.Scanner;
//1983. 조교의 성적 매기기
public class Grade {

    public static void grade(){

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case = 1;test_case<=T;test_case++){

            String[] grade = new String[]{"D", "C-", "C0", "C+", "-B", "B0","B+", "A-","A0", "A+" };

            int N = sc.nextInt();
            int k = sc.nextInt();
            int [] score = new int[N];
            int [] new_score = new int[N];
            int num = N/10; // 학 학점당 가능한 학생 수
            int index = 0;

            //score 배열에 학생들의 점수 입력
            for(int a = 0; a < N; a++) {
                int mid=sc.nextInt();
                int fin=sc.nextInt();
                int rep=sc.nextInt();

                score[a] = mid*35 + fin*45 + rep*20;
            }

            System.arraycopy(score, 0, new_score, 0, N);


            Arrays.sort(new_score);

            // score 에서 k번 학생의 점수를 찾아내서,
            // new_score에 있는 값과 비교, 해당하는 값의 index를 찾기
            //System.out.println(score[k-1]);
            for(int a = 0; a < N; a++){
                if(new_score[a] == score[k-1]) {
                    index = a;
                    break;
                }
            }

            index =index/num;
            System.out.println("#"+test_case+" "+grade[index]);
        }
    }
}
