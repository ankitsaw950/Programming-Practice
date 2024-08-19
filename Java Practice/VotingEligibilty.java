package Practice_Questions;
import java.util.*;

public class VotingEligibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  the name : ");
        String name  = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age >18)
            System.out.println(name+" you are eligible to vote.");
        else
            System.out.println(name+" you are not eligible to vote.");
    }
}
