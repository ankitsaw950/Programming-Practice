public class GCD_Of_Two_number {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        int n1 = 18;
        int n2 = 6;
        System.out.println("GCD of " + n1 + " and " + n2 + " is : " + gcd(n1, n2));

    }
}