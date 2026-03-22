/*FUNCTION Q2(a: INTEGER, b: INTEGER , c: INTEGER)
  if((c^b+a)<(a&c))
    b = a^b
    c = (a+3)+c
   END IF
   if((3^b)+(c^c)>(11&c))
    b = (c+12)^a
   END IF
    return a+b+c
END FUNCTION
*/  
public class FuncQ2 {
    public static int q2(int a, int b, int c) {
        if ((c ^ b + a) < (a & c)) {
            b = a ^ b;
            c = (a + 3) + c;
        }
        if ((3 ^ b) + (c ^ c) > (11 & c)) {
            b = (c + 12) ^ a;
        }
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(q2(2, 6, 1)); // Output will depend on the logic of the function
    }
}