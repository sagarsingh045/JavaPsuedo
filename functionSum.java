//FUNCTION SUM(n: INTEGER) : REAL
//    DECLARE sum: REAL
//    SET sum = 0.0
//    FOR i FROM 1 TO n DO 
//        sum = sum + (1.0 / i)
//    END FOR  
//    RETURN sum
//END FUNCTION  
//PRINT SUM(5)
// code in java
    
public class functionSum {        
    public static double SUM(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SUM(5)); // Output: 2.283333333333333
    }
}   