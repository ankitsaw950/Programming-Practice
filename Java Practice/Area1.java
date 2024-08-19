package Practice_Questions;

class Test {
    int len, width;

    void getdata(int x, int y) {
        len = x;
        width = y;
    }

    int area() {
        int a = len * width;
        return a;
    }
}

public class Area1 {
    public static void main(String[] args) {
//        Test T1;  Direct yese use karenge toh error ayega

        Test T1 = new Test();
        T1.getdata(10,15);
        System.out.println("Area :" + T1.area() );

//        int a1;
//        T1.len = 10;
//        T1.width = 15;
//        a1 = T1.len * T1.width;
//        System.out.println("Area : "+a1);


    }
}
