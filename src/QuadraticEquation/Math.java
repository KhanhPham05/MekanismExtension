package QuadraticEquation;

import static java.lang.System.*;
import static java.lang.Math.*;

class Math implements IMath{
    private final int a,b,c;
    private int Delta;

    protected Math(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

     @Override
     public boolean CheckValue() {
         return a != 0;
     }

     @Override
    public void CalcDelta() {
        Delta = (b*b) - 4*a*c;
    }

    @Override
    public void CompareAndCalc()  {
        double x, x1 = 0, x2 = 0;

        boolean n = false;
        boolean m = false;
        if (Delta < 0) {
            out.println("Phuong Trinh Nay Vo Nghiem !!");
            return;
        } else
        if (Delta > 0){
            if (a + b +c == 0) {
                n = true;
                x1 = 1;
                x2 = c/a;
            }
            if (a - b + c == 0){
                m = true;
                x1 = -1;
                x2 = -c/a;
            }
            if (!n && !m){
                x1 = (-b + sqrt(Delta))/2*a;
                x2 = (-b - sqrt(Delta))/2*a;
            }
            out.printf("Phuong trinh co 2 nghiem phan biet. Do la: \n \t x1 = %f", x1 ," \n \t x2 = %f" ,x2);
        }
        if (Delta == 0){
            x = -(b / 2*a);
            out.printf("Phuong Trinh Co 2 Nghiem Kep. Do La: x1 = x2 = %f", x);
            return;
        }
    }
}
