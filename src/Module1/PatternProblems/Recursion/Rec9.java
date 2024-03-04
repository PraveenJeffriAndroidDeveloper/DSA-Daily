package Module1.PatternProblems.Recursion;

public class Rec9 {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        if(n==0)
            return 0;
        int first = 0;
        int second = 1;
        for(int i=2;i<=n;i++)
        {
            int temp = first ;
            first = second ;
            second = temp+second;
        }

        return second;

        //Hello world
        

    }
}
