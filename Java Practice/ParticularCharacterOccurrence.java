
import java.util.*;

public class ParticularCharacterOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.print("Enter the character to find : ");
        char c = sc.next().charAt(0);

        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==c)
                count++;
        }
        System.out.println("The occurence of "+c+" is : "+count+" times.");
    }
}
