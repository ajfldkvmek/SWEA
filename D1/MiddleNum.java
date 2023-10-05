package D1;

import java.util.Scanner;
        import java.io.FileInputStream;
        import java.util.Arrays;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
public class MiddleNum {
    public static void middle() {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int [] arr = new int[N];

        int temp = Integer.MIN_VALUE;
        int count = 0;

        for(int a = 0; a < N; a++) {
            arr[a] = sc.nextInt();
            if(temp <= arr[a]) temp = arr[a];
        }

        Arrays.sort(arr);

        System.out.println(arr[N/2]);
    }
}