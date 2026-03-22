//Psuedocode
/*
FUNCTION max(a: INTEGER, b: INTEGER) : INTEGER
    DECLARE maxValue: INTEGER
    IF a > b THEN
        maxValue = a
    ELSE
        maxValue = b
    END IF
END FUNCTION    
PRINT max(5, 3)  
*/  
//code in java
public class functionMax {
    public static int max(int a, int b) {
        int maxValue;
        if (a > b) {
            maxValue = a;
        } else {
            maxValue = b;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(max(5, 3)); // Output: 5
    }
}   