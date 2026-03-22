//FUNCTION SUMOFSERIES(n: INTEGER) : INTEGER
//    DECLARE sum: INTEGER
//    SET sum = 0
//    FOR i FROM 1 TO n DO
//        sum = sum + i
//    END FOR
//    RETURN sum
//END FUNCTION
//PRINT SUMOFSERIES(5)
// code in java
public class functionSumofSEries {      
    public static int SUMOFSERIES(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(SUMOFSERIES(5)); // Output: 15
    }
}