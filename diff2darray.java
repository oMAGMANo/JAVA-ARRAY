import java.util.Scanner;

public class diff2darray{
    public static void main(String[] args){
        int[][] a = {{9,8,7},
                    {6,5,4},
                    {3,2,1},
                    {10,11,12}};
        int[][] b = {{9,8,7},
                    {6,5,4},
                    {3,2,1},
                    {10,11,12}};
        
        int m = a.length;
        int n = a[0].length;

        int[][] diff = new int[m][n];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                diff[i][j] = a[i][j] - b[i][j];
            }
        }

        
        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++){
                System.out.print(diff[i][j] + " ");
            }
            System.out.println();
        }
    }
}