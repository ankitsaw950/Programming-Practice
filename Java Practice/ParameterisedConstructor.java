package Practice_Questions;
import java.util.*;


class parent
{
    int x,y;
    parent(int a,int b)
    {
       x=a;
       y=b;
    }
    public void display()
    {
        System.out.println("value of x is :"+x);
        System.out.println("value of y is :"+y);
    }
}


public class ParameterisedConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a =sc.nextInt();
        int b= sc.nextInt();

        parent A = new parent(a,b);
        A.display();
    }
}
