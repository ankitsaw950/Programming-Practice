import java.util.Scanner;

class fibonacciGenerator {
    
    // Helper method to multiply two 2x2 matrices
    public void multiply(int[][] A, int[][] B) {
        int a00 = A[0][0] * B[0][0] + A[0][1] * B[1][0];
        int a01 = A[0][0] * B[0][1] + A[0][1] * B[1][1];
        int a10 = A[1][0] * B[0][0] + A[1][1] * B[1][0];
        int a11 = A[1][0] * B[0][1] + A[1][1] * B[1][1];
        
        A[0][0] = a00;
        A[0][1] = a01;
        A[1][0] = a10;
        A[1][1] = a11;
    }

    // Helper method to raise the matrix to the power of n using recursion
    public void power(int[][] matrix, int n) {
        if (n == 0 || n == 1)
            return;
        
        // Initialize the base matrix
        int[][] baseMatrix = {{1, 1}, {1, 0}};
        
        // Recursively reduce the power
        power(matrix, n / 2);
        multiply(matrix, matrix);  // Matrix exponentiation by squaring

        // If n is odd, multiply once more with the base matrix
        if (n % 2 != 0)
            multiply(matrix, baseMatrix);
    }

    // Method to generate the nth Fibonacci number
    public int genfib(int n) {
        if (n == 0) return 0;  // F(0) = 0
        if (n == 1) return 1;  // F(1) = 1

        // Initialize the transformation matrix
        int[][] matrix = {{1, 1}, {1, 0}};
        
        // Raise the matrix to the (n-1)th power
        power(matrix, n - 1);
        
        // The nth Fibonacci number will be stored in matrix[0][0]
        return matrix[0][0];
    }
}

public class FibonacciMatrixExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an instance of fibonacciGenerator
        fibonacciGenerator fibGen = new fibonacciGenerator();
        
        // Input the value of n (nth Fibonacci number to generate)
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        // Generate and display the nth Fibonacci number
        int nthFibonacci = fibGen.genfib(n);
        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);
    }
}
