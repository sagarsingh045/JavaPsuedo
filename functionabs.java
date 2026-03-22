//FUNCTION abs(x: INTEGER) : INTEGER
//    IF x < 0 THEN
//        RETURN -x
//    ELSE
//        RETURN x
//    END IF
//END FUNCTION
//PRINT abs(-5)
//*/
// code in java
public class functionabs {
    public static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println(abs(-5)); // Output: 5
    }
}