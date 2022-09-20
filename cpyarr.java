import java.util.Scanner;

public class cpyarr{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //taking input of number of rows and columns.
        System.out.print("Enter the number of m : ");
        int m = input.nextInt();
        System.out.print("Enter the number of n : ");
        int n = input.nextInt();
        
        int[][] arr = new int[m][n];    //initializing the original array.
        
        //taking input of elements of the matrix.
        for(int i  = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print("Enter the value of the element at (" + (i+1) + "," + (j+1) + ") : ");
                arr[i][j] = input.nextInt();
            }
        }

        int[][] cpy_arr = new int[m][n];    //initializing the copy array.

        //copying 5he original array into the new array.
        for(int i  = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                cpy_arr[i][j] = arr[i][j];
            }
        }

        //displaying the new array.
        for(int i  = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.println("The value of the element at (" + (i+1) + "," + (j+1) + ") : " + cpy_arr[i][j]);
            }
        }

    }
}