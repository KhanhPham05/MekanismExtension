package ShapesAcreage;

import java.util.Scanner;

import static java.lang.Math.*;

class Math implements IMath{

    protected Math(){
        System.out.println("Launching... ");
    }

    @Override
    public void Square(int x) {
        int s = x * x;
        System.out.printf("Dien Tich hinh Vuong la: %f",s);
    }

    @Override
    public void Circle(int r) {
        boolean isValid;

        double pi = 3.14;
        double s = (r*r) * pi;
        System.out.printf("Dien Tich Hinh Tron La: %f",s);
    }

    @Override
    public void Rectangle(int x, int y) {
        int s = x*y;
        System.out.printf("Dien Tich Hinh chu Nhat La: %d",s);
    }

    @Override
    public void Triangle(int x, int y, int z) {
        int a = x ; int b = y; int c = z;

        //Check Value
        while (a + b < c || a + c < b || b + c < a){
            System.out.println("Day khong phai la mot tam giac! Nhap lai:");

            Scanner sc = new Scanner(System.in);

            System.out.print("\t canh a = ");
                 int a1 = a = sc.nextInt();

            System.out.print("\t canh b = ");
                 int b1 = b = sc.nextInt();

            System.out.print("\t canh c = ");
                 int c1 = c  = sc.nextInt();
            }

        //Calculating
        Calc (a ,b ,c);
    }

    private void Calc(int a, int b, int c) {
        double s, p;
        p = (a + b + c) / 2;
        s = sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("Dien Tich Tam Gaic la: %f", s);
    }


}
