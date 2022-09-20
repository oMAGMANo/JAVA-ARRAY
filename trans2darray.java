import java.util.Scanner;

public class trans2darray{
    public static void main(String[] args){
        int[][] a = {{9,8,7},
                    {6,5,4},
                    {3,2,1},
                    {10,11,12}};
             
        int m = a.length;
        int n = a[0].length;
        
        int[][] a_tran = new int[n][m];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                a_tran[j][i] = a[i][j];
            }
        }

        for(int i = 0; i<a_tran.length; i++){
            for(int j = 0; j<a_tran[0].length; j++){
                System.out.print(a_tran[i][j] + " ");
            }
            System.out.println();
        }
    }
}