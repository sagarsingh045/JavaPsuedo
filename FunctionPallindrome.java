/* FUNCTION PALLINDROME(n: INTEGER) : BOOLEAN
    DECLARE reversed: INTEGER
    SET reversed = 0
    WHILE n > 0 DO
        reversed = reversed * 10 + n % 10
        n = n / 10
    END WHILE
    IF reversed = original THEN
        RETURN TRUE
    ELSE
        RETURN FALSE
    END IF
END FUNCTION
PRINT PALLINDROME(121)
*/  
public class FunctionPallindrome {        
    public static boolean PALLINDROME(int n) {
        int original = n; // Store the original number
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return reversed == original; // Check if the reversed number is equal to the original
    }

    public static void main(String[] args) {
        System.out.println(PALLINDROME(121)); // Output: true
    }
}