package ShapesAcreage;

import DienTichTamGiac.ITriangleAcreage;

public class Triangle implements ITriangleAcreage {
    private int a;
    private int b;
    private int c;
    private boolean isValid;
    @Override
    public void getTriangleEdge(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void CheckTriangle() {
        if(this.a + this.b > this.c || this.a + this.c > this.b || this.b+ this.c > this.a) isValid = true; else isValid=false;
    }

    @Override
    public void calc() {
        double s,p;
        if(isValid) {
            p = (this.a+this.b+this.c)/2;
            s = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
            System.out.printf("Dien Tich Tam Giac la: %f",s);
        }
        else System.out.println("Day khong phai la mot tam giac hop le!!");

    }
}
