/*FUNCTION factorial(n: INTEGER) : INTEGER
  DECLARE result: INTEGER
  SET result = 1
    FOR i FROM 1 TO n DO
        result = result * i
    END FOR 
    RETURN result
END FUNCTION
PRINT factorial(5)
*/
// code in java
public class functionfactorial {        
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}
