package ShapesAcreage;

import java.util.Scanner;

import static java.lang.System.*;

class MainClass {
        public static void main(String[] args){
        Math ob = new Math();
        Scanner sc = new Scanner(System.in);
        out.println("------ TINH DIEN TICH CAC HINH --------\n \t -- PICK ONE --");
        out.println("Nhap Mot Che Do:  \t  - Type a mode - ");

        out.println("0 >>> Exit ");
        out.println("1 >>> Hinh Vuong \t - Square -");
        out.println("2 >>> Hinh Tron  \t - Circle -");
        out.println("3 >>> Hinh Chu Nhat \t - Rectangle -");
        out.println("4 >>> Hinh Tam Giac \t - Triangle - \n");

        int n = sc.nextInt();

        switch(n) {
            case 0:
                break;
            case 1:
                System.out.print("Nhap canh :");
                int a = sc.nextInt();
                ob.Square(a);
                break;
            case 2:
                System.out.print("Nhap ban kinh :");
                int r = sc.nextInt();
                ob.Circle(r);
                break;
            case 3:
                System.out.print("Nhap canh a:");
                int a1 = sc.nextInt();
                System.out.print("Nhap canh b:");
                int b = sc.nextInt();
                ob.Rectangle(a1,b);

            case 4:
                System.out.print("Nhap canh a:");
                int x = sc.nextInt();
                System.out.print("Nhap canh b:");
                int y = sc.nextInt();
                System.out.print("Nhap canh c:");
                int z = sc.nextInt();
                ob.Triangle(x,y,z);
                break;
            default :
                break;
        }
    }
}
