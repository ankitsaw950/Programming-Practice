

public class PrimeNumberInrange {
    public static void main(String[] args) {
        int start = 1;
        int end = 20;

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        print();
        System.out.println("The factorial of the given number is : "+fact(5));
    }

    public static boolean isPrime(int num) {
        // Base condition

        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }

    public static void print()
    {
        for(int i=-10;i<=-1;i++)
            System.out.println(i);
    }
    public static int fact(int num)
    {
        if(num==0 || num==1) return num;

        return num*fact(num-1);
    }

    }

