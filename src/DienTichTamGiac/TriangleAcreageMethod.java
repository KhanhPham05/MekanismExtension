
package DienTichTamGiac;

public class TriangleAcreageMethod implements ITriangleAcreage {

    public TriangleAcreageMethod(){}

    boolean isValid;
    int a,b,c;
    double s,p;

    @Override
    public void getTriangleEdge(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void CheckTriangle() {
        if (this.a+this.b > this.c || this.b+this.c > this.a || this.a+this.c>this.b)
            { isValid = true; System.out.println("Day La Mot Tam Giac Hop Le !! ");}
        else { isValid = false; System.out.println("Day Khong Phai La Mot Tam Giac"); }
    }

    @Override
    public void calc() {
        if (isValid){
            //TODO: tinh chu vi
            p = ((this.a+this.b+this.c)/2);
            s = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
        }
        System.out.println("dian tich tam giac la: " + s);
    }
}
