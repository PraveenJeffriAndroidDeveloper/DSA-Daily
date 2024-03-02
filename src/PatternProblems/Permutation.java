package PatternProblems;
import java.util.*;
public class Permutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String to Permutate = ");
        String strinf = input.nextLine();
        Permutation mainClass = new Permutation();
        mainClass.permutation(strinf,"");
    }

    public void permutation(String str , String ans)
    {
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            String rem = str.substring(0,i)+str.substring(i+1);
            permutation(rem,ans+ch);
        }
    }
}
