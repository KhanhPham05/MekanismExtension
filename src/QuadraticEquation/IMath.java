package QuadraticEquation;

interface IMath {
    default void GetValue(int x, int y, int z) {}

    boolean CheckValue();
    void CalcDelta();

    void CompareAndCalc();
}
