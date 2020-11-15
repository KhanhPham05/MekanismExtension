package DienTichTamGiac;

import java.util.Scanner;

public class TinhTamGiacMain {
    public static void main(String args[]) {

        System.out.println("Nhap cac canh cua tam giac");

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap canh a: a ="); int a = sc.nextInt();
        System.out.print("Nhap canh b: b ="); int b = sc.nextInt();
        System.out.print("Nhap canh c: c ="); int c = sc.nextInt();

        TriangleAcreageMethod ob = new TriangleAcreageMethod();

        ob.getTriangleEdge(a,b,c);
        ob.CheckTriangle();
        ob.calc();
    }
}
