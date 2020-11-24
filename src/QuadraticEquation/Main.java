package QuadraticEquation;

import java.util.Scanner;

import static java.lang.System.*;

class Main {
    public static void main(String[] args){
        out.println("Phuong Trinh Bac Hai: a*x^2 + b*x + c = 0");

        Scanner sc = new Scanner(in);
        out.print("Nhap Cac Gia Tri: \n \t Nhap a = ");
        int a = sc.nextInt();

        out.print(" \tNhap b = ");
        int b = sc.nextInt();

        out.print("\tNhap c = ");
        int c = sc.nextInt();

        Math ob = new Math(a,b,c);
        if (ob.CheckValue()){
            ob.CalcDelta();
            ob.CompareAndCalc();
        } else
            out.println("Day khong la mot phuong trinh hop le !!");
    }
}
