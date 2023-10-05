package D1;

import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class Odd_num {

    public static void odd() {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

        for(int test_case = 1; test_case <= T; test_case++)
        {

            int odd_num = 0;

            for(int a = 0; a < 10; a++){
                int num = sc.nextInt();
                /*각 수는 0 이상 10000 이하의 정수이다.*/
                if(num<0 || num>1000){
                    a--;
                    continue;
                }

                if(num%2 == 1)
                    odd_num += num;
            }
            System.out.println("#"+test_case+" "+ odd_num);
        }
    }
}
