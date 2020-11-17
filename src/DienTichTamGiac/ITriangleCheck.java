package DienTichTamGiac;

public interface ITriangleCheck {

    void getTriangleEdge(int a, int b, int c);

    default void CheckTriangle() { }
}
