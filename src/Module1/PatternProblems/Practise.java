package Module1.PatternProblems;
import java.util.*;
public class Practise {
    static int count = 0;
    public static void main(String args[])
    {
        char ch = 'A';
        if(ch>='a' && ch<='z')
        {
            System.out.println("It is lowercase");
        }
        else {
            System.out.println("No it is not lowercase");
        }
        Scanner input = new Scanner(System.in);
       String str = input.next();
       permutation(str,"");
        System.out.println("Total count is "+count);
    }

    public static void permutation(String str , String ans)
    {
        if(str.length()==0){
            System.out.println(ans);
            count++;
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String rem = str.substring(0,i)+str.substring(i+1);
            permutation(rem , ans+ch);

        }
    }
}
