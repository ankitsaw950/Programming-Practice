public class _8 {
   static class Polygon{
    // Method to draw a filled square
    public void polygon(int n, char ch) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    // Method to draw a filled rectangle
    public void polygon(int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print('@');
            }
            System.out.println();
        }
    }
    // Method to draw a filled triangle
    public void polygon() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
    public static void main(String[] args) {
        Polygon p = new Polygon();
        // Draw a filled square
        p.polygon(5, '#');
        // Draw a filled rectangle
        p.polygon(3, 5);
        // Draw a filled triangle
        p.polygon();
    }
}
