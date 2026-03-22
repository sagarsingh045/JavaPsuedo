/*Function Aot(b : INTEGER, h : REAL) : REAL
    RETURN 0.5 * b * h
END FUNCTION
PRINT Aot(5, 10.0)
*/
// code in java
public class functionAot {  
    public static double Aot(int b, double h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        System.out.println(Aot(5, 10.0)); // Output: 25.0
    }
}