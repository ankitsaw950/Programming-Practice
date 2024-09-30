import java.util.Stack;

public class TowerOfHanoi {

    // Method to move disk from one rod to another
    public static void moveDisk(Stack<Integer> fromRod, Stack<Integer> toRod, char from, char to) {
        int disk = fromRod.pop();
        toRod.push(disk);
        System.out.println("Move disk " + disk + " from " + from + " to " + to);
    }

    // Method to solve Tower of Hanoi iteratively using stacks
    public static void solveHanoi(int numDisks) {
        Stack<Integer> source = new Stack<>();
        Stack<Integer> aux = new Stack<>();
        Stack<Integer> dest = new Stack<>();

        char src = 'S', auxRod = 'A', destRod = 'D';

        // Number of moves needed
        int totalMoves = (int) Math.pow(2, numDisks) - 1;

        // Push disks onto the source rod (largest at the bottom)
        for (int i = numDisks; i >= 1; i--) {
            source.push(i);
        }

        // Swap destination and auxiliary rods if the number of disks is even
        if (numDisks % 2 == 0) {
            char temp = auxRod;
            auxRod = destRod;
            destRod = temp;
        }

        // Perform the required moves
        for (int i = 1; i <= totalMoves; i++) {
            if (i % 3 == 1) {
                moveBetweenRods(source, dest, src, destRod);
            } else if (i % 3 == 2) {
                moveBetweenRods(source, aux, src, auxRod);
            } else if (i % 3 == 3) {
                moveBetweenRods(aux, dest, auxRod, destRod);
            }
        }
    }

    // Method to move disks between rods with simple checks
    public static void moveBetweenRods(Stack<Integer> fromRod, Stack<Integer> toRod, char from, char to) {
        if (fromRod.isEmpty()) {
            moveDisk(toRod, fromRod, to, from);
        } else if (toRod.isEmpty()) {
            moveDisk(fromRod, toRod, from, to);
        } else if (fromRod.peek() > toRod.peek()) {
            moveDisk(toRod, fromRod, to, from);
        } else {
            moveDisk(fromRod, toRod, from, to);
        }
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        System.out.println("Solving Tower of Hanoi with " + n + " disks:");
        solveHanoi(n);
    }
}
