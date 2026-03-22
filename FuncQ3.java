/*FUNCTION Q3(a: INTEGER, b: INTEGER , c: INTEGER)
    if((a^8)<8)
       c = a+c
       c = a+c
    END IF
    return a+b+c
END FUNCTION        
    */
public class FuncQ3 {
    public static int q3(int a, int b, int c) {
        if ((a ^ 8) < 8) {
            c = a + c;
            c = a + c;
        }
        return a + b + c;
    }
}