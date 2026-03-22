/* FUNCTION REVERSE(n: INTEGER) : INTEGER
    DECLARE reversed: INTEGER
    SET reversed = 0
    WHILE n > 0 DO
        reversed = reversed * 10 + n % 10
        n = n / 10
    END WHILE
    RETURN reversed
END FUNCTION
PRINT REVERSE(123)
*/  
public class functionreverse {        
    public static int REVERSE(int n) {
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println(REVERSE(123)); // Output: 321
    }
}