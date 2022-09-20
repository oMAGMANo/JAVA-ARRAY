import java.util.Scanner;
import java.io.*;

public class chk_sym_arr{

    //function to make transpose of a 2D array.
    public static int[][] transpose(int[][] a){
        int m = a.length;
        int n = a[0].length;

        int[][] a_tran = new int[n][m];

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                a_tran[j][i] = a[i][j];
            }
        }

        return a_tran;
    }

    //function to print a 2D array.
    public static void printarray(int[][] a){
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void checksym(int[][] a, int[][] b){
        int flag = 1;   //using flag variable to check for unequal elements in two matrices.
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                if(a[i][j] != b[i][j]){
                    flag=-1;
                }
            }
        }
        if(flag == -1)
            System.out.println("Not a symmetric array.");
        else
            System.out.println("Symmetric array!");
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //taking input of number of rows and columns.
        System.out.print("Enter the value of m : ");
        int m = input.nextInt();
        System.out.print("Enter the value of n : ");
        int n = input.nextInt();
        if((m==n)&&(m!=0&&n!=0)){
            int[][] arr = new int[m][n];    //initializing the original array.
        
            //taking input of elements of the matrix.
            for(int i  = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    System.out.print("Enter the value of the element at (" + (i+1) + "," + (j+1) + ") : ");
                    arr[i][j] = input.nextInt();
                }
            }

            //printing original matrix
            System.out.println("Original matrix : ");
            printarray(arr);

            int[][] tran_arr = transpose(arr);  //initializing the transpose array and storing it;s value.

            //printing transpose matrix.
            System.out.println("Transpose matrix : ");
            printarray(tran_arr);   

            System.out.println();

            checksym(arr, tran_arr);    //checking for symmetric matrix.
        }
        else
            System.out.println("Not a symmetric array.");
    }
}