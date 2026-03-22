//Psuedocode
/*
FUNCTION aoc(rad : REAL) : REAL
    RETURN 3.14 * rad * rad
END FUNCTION
PRINT aoc(6.6)  
*/
// code in java
public class functionAoc {
    public static double aoc(double rad) {
        return 3.14 * rad * rad;
    }

    public static void main(String[] args) {
        System.out.println(aoc(6.6)); // Output: 136.8464
    }
}
