package PatternProblems;
import java.util.*;
public class Pattern11 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int flag = 1;
        for(int i=0;i<n;i++)
        {
            if(i%2==1)
            {
                flag= 0;
            }
            else {
                flag = 1;
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print(flag);
                flag = flag==1?0:1;
            }
            System.out.println();
        }
    }
}
