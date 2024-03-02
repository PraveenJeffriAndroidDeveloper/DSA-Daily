package PatternProblems;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int row = n+ n-1;
        int column = n+n-1;
        int[][] matrix = new int[row][column];
        int top = 0;
        int left = 0;
        int right = row-1;
        int bottom = column-1;
        int temp = n;
        for(int i=0;i<n;i++)
        {
            //left to right
            for(int j=left;j<=right;j++)
            {
                matrix[top][j] = temp;
            }

            for(int j=top;j<bottom;j++)
            {
                matrix[j][right] = temp;
            }

            for(int j=right;j>=left;j--)
            {
                matrix[bottom][j]=temp;
            }

            for(int j=bottom;j>=top;j--)
            {
                matrix[j][left] = temp;
            }

            top++;
            left++;
            right--;
            bottom--;
            temp--;
        }
        for(int i=0;i<row;i++)
        {
            for(int j = 0;j<column;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
