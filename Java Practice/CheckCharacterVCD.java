package Practice_Questions;
import java.util.*;
public class CheckCharacterVCD {

    public static boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return ch=='a'|| ch=='e'||ch=='i'|| ch=='o'|| ch=='u';
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        if(Character.isDigit(ch))
        {
            System.out.println(ch + " is a digit.");
        }

        else if(Character.isLetter(ch))
        {
            if(isVowel(ch))
                System.out.println(ch+" is a vowel.");
            else
                System.out.println(ch+" is a constant.");
        }
        else
            System.out.println(ch + " is neither a digit nor a letter.");
    }
}
