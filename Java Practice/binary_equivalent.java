import java.util.Scanner;
public class binary_equivalent {
    public static String Binary(int x) {
        if (x == 0) {
            return "";
        }
        int a = x % 2;
        x = x / 2;
        return Binary(x) + a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        String ans = Binary(n);
        // Handle the case when the number is 0
        if (ans.isEmpty()) {
            ans = "0";
        }
        System.out.println("The binary equivalent of " + n + " is : " + ans);
    }
}
