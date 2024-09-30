
import java.util.*;


public class countVowels {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);

        System.out.print("Enter the string");
        String str = sc.nextLine();

        int len =0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            len=len+1;
        }

        System.out.println("The number of the vowels present in the string : " +len );
    }
}
