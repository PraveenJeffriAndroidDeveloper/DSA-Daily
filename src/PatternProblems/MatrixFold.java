package PatternProblems;

import java.util.Scanner;

public class MatrixFold {
    static int temp_arr[][];
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size");
        int row = input.nextInt();
        int column = input.nextInt();
        int arr[][] = new int[row][column];
        int count = 1;
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                arr[i][j] = count++;
            }
        }

        int fold_count = 1;
        int flag = 0;
        while(fold_count<4)
        {
            if(flag==0)
            {
                temp_arr = new int[row][column/2];
                int oneD[] = new int[row];
                for(int i=0;i<row;i++)
                {
                    oneD[i] = arr[i][0] + arr[i][column-1];
                }

                for(int i=0;i<row;i++)
                {
                    for(int j=0;j<column/2;j++)
                    {
                        temp_arr[i][j] = oneD[i];
                    }
                }
                arr = temp_arr;
                column/=2;
            }
            else {
                temp_arr = new int[row/2][column];
                int oneD[] = new int[column];
                int dummy_row = row-1;
                for (int i=0;i<column;i++)
                {
                    oneD[i] = arr[i][0] + arr[dummy_row--][i];
                }
                for(int i=0;i<row/2;i++) {
                    for (int j = 0; j < column; j++) {
                        temp_arr[i][j] = oneD[i];
                    }
                }
                arr = temp_arr;
                row/=2;

            }
            flag = (flag == 0) ? 1 : 0;

            System.out.println("Matrix fold = "+fold_count++);
            for (int i=0;i<row;i++)
            {
                for(int j=0;j<column;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }


    }
}
