/*
unit                     rate
<50                      1.00
>=50 && <100             1.25
>=100 && <200            1.75
>=200 && <300            2.50
>=300                    3.00
*/


package Practice_Questions;
import java.util.*;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the consumer number : ");
        String name = sc.nextLine();

        System.out.print("Enter the unit consumed : " );
        int unit=sc.nextInt();

        double charge ;
        if(unit<50)
            charge = unit*1.00;
        else if(unit<100)
            charge=49*1.00 + (unit-49)*1.25;
        else if(unit<200)
            charge=49*1.00 + 50*1.25 +(unit-99)*1.75;
        else if (unit<300)
            charge=49*1.00 + 50*1.25 + 100*1.75 +(unit-199)*2.50;
        else
            charge =49*1.00 + 50*1.25 + 100*1.75 +100*2.50 +(unit-299)*3.00;

        double totalcharge =charge+50;
        System.out.println("=============================");
        System.out.println("          Bill Receipt        ");
        System.out.println("=============================");
        System.out.println("Consumer : "+ name);
        System.out.println("Unit consumed : "+unit);
        System.out.println("Total bill : "+totalcharge);
    }
}
