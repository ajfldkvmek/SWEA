package D2;

import java.util.Scanner;
public class Sudoku {

    public static void sudoku() {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++){

            int [][] arr = new int[9][9];
            int [] row_arr = new int[9];
            int [] col_arr = new int[9];
            int [] box_arr = new int[9];
            int err = 1;
            for(int r=0; r<9;r++){
                for(int c=0;c<9;c++){
                    arr[r][c] = sc.nextInt();
                }
            }

            for(int r=0; r<9;r++){
                for(int c=0;c<9;c++) { row_arr[(arr[r][c])-1]+=1; }
                for(int check = 0;check<9;check++) {
                    if(row_arr[check]!=1) {
                        err = 0;
                        break;
                    }
                }

                if(err==0) break;
                else row_arr = new int[9];
            }


            for(int c=0; c<9;c++){
                for(int r=0;r<9;r++) {col_arr[(arr[r][c])-1]+=1;}
                for(int check = 0;check<9;check++) {
                    if(col_arr[check]!=1) {
                        err = 0;
                        break;
                    }
                }

                if(err==0) break;
                else col_arr = new int[9];
            }

            int row=0;
            int col=0;


            while(row<9){
                for(int a = 0; a<3;a++){
                    for(int b=0; b<3;b++){ box_arr[arr[row+a][col+b]-1] += 1;}
                }

                for(int k = 0; k <9; k++){
                    if(box_arr[k] != 1) err = 0;
                    break;
                }

                if(err==0) break;
                else box_arr = new int[9];

                row+=3;
                col+=3;
            }

            System.out.println("#"+test_case+" "+err);
        }
    }
}
