/* FUNCTION Q1(INTEGER a, INTEGER b )
    INTEGER c = 1
    while (b > 0) 
        if(b MOD 2 EQUALS 1)
            c = c * a
            a = a * a
            b = b / 2
        
        END IF
    END WHILE
    return c;
END FUNCTION
*/
public class FuncQ1 {
    public static int q1(int a, int b) {
        int c = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                c = c * a;
                a = a * a;
                b = b / 2;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(q1(4, 3)); // Output: 32
    }
}