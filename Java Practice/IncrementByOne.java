

import java.util.Scanner;

public class IncrementByOne {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        int val=n;
        int ans=0;
        int last;

        while(val>0)
        {
            last=(val%10)+1;
            if(last==10) {
                last = 0;
                ans+=1;
            }
            ans=ans*10+last;
            val=val/10;
        }
        val=ans;
        ans=0;
        while(val>0)
        {
            last=val%10;
            ans=ans*10+last;
            val=val/10;
        }


//
//
//        int val=n;
//        int ans=0;
//        int place=1;
//        while(val>0)
//        {
//            int last = (val%10)+1;
//            if(last==10)
//                last=0;
//            ans=ans+ last*place;
//            place=place*10;
//            val=val/10;
//        }

        System.out.println("The incremented of the "+ n + " is "+ans);
    }
}
